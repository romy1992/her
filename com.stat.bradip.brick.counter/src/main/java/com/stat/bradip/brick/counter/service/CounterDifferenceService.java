package com.stat.bradip.brick.counter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stat.bradip.brick.counter.feign.CounterResourceFeign;
import com.stat.bradip.brick.counter.feign.CustomerResourceFeign;
import com.stat.bradip.commons.counter.model.CounterDatFileMonthModel;
import com.stat.bradip.commons.counter.model.CounterModel;
import com.stat.bradip.commons.counter.model.DifferenceCounterModel;
import com.stat.bradip.commons.counter.model.SpecificDifferenceModel;

@Service
@Transactional
public class CounterDifferenceService {

	@Autowired
	private CounterResourceFeign counterFeign;

	@Autowired
	private CustomerResourceFeign customerResourceFeign;

	private Long counterSpecificYearSubOne(Integer idCustomer, String description, String month, String year) {
		List<CounterModel> counterModel = counterFeign.getAllCounter().getBody().stream()
				.filter(c -> c.getIdCustomer() == idCustomer).collect(Collectors.toList());
		if (!counterModel.isEmpty()) {
			for (CounterModel counter : counterModel) {
				Optional<CounterDatFileMonthModel> datFileModelList = counter
						.getCounterDatFile().stream().filter(c -> c.getMonthRiferimer().equals(month)
								&& c.getYearRiferiment().equals(year) && c.getStringDescription().equals(description))
						.findFirst();
				if (datFileModelList.isPresent())
					return datFileModelList.get().getCounterTotalMonth();
			}
		}
		return 0L;
	}

	private Long numberBig(Long one, Long two) {
		if (one >= two)
			return one - two;
		else
			return two - one;

	}

	private DifferenceCounterModel controlExist(Integer id, CounterDatFileMonthModel counter) {
		String y = String.valueOf(Integer.parseInt(counter.getYearRiferiment()) - 1);
		List<DifferenceCounterModel> modelList = counterFeign.getSpecific().getBody().stream()
				.filter(a -> a.getIdCustomer() == id).collect(Collectors.toList());

		for (DifferenceCounterModel model : modelList) {
			if ((model.getDescription() != null && model.getDescription().equals(counter.getStringDescription()))) {
				List<SpecificDifferenceModel> specificList = model.getSpecificDifferenceList().stream()
						.filter(a -> a.getReferencePrimary().equals(counter.getMonthRiferimer() + " - " + y)
								&& a.getReferenceSecondary() == null)
						.collect(Collectors.toList());
				if (!specificList.isEmpty()) {
					for (SpecificDifferenceModel specific : specificList) {
						specific.setReferenceSecondary(
								counter.getMonthRiferimer() + " - " + counter.getYearRiferiment());
						Long totalPrimary = counterSpecificYearSubOne(id, counter.getStringDescription(),
								counter.getMonthRiferimer(), y);
						Long totalSecondary = counterSpecificYearSubOne(id, counter.getStringDescription(),
								counter.getMonthRiferimer(), counter.getYearRiferiment());
						specific.setTotalDifferenceNumber(numberBig(totalPrimary, totalSecondary));
						if (totalPrimary != 0)
							specific.setTotalDifferencePercentage(
									(double) (specific.getTotalDifferenceNumber() * 100) / totalPrimary);
						else
							specific.setTotalDifferencePercentage((double) (specific.getTotalDifferenceNumber() * 100));
					}
					model.setSpecificDifferenceList(specificList);
					return model;
				}

			}
		}
		return new DifferenceCounterModel();
	}

	public void sendDat(Integer idCustomer, List<CounterDatFileMonthModel> counterDatFile) {
		List<DifferenceCounterModel> differenceModelList = new ArrayList<>();
		for (CounterDatFileMonthModel counter : counterDatFile) {

			DifferenceCounterModel differenceModel = controlExist(idCustomer, counter);

			if (differenceModel.getIdCustomer() == null) {
				differenceModel.setIdCustomer(idCustomer);
				differenceModel.setDescription(counter.getStringDescription());
				SpecificDifferenceModel specific = new SpecificDifferenceModel();
				specific.setReferencePrimary(counter.getMonthRiferimer() + " - " + counter.getYearRiferiment());
				Long totalPrimary = counterSpecificYearSubOne(idCustomer, counter.getStringDescription(),
						counter.getMonthRiferimer(), counter.getYearRiferiment());
				specific.setTotalDifferenceNumber(totalPrimary);

				if (totalPrimary != 0)
					specific.setTotalDifferencePercentage(
							(double) (specific.getTotalDifferenceNumber() * 100) / totalPrimary);
				else
					specific.setTotalDifferencePercentage((double) (specific.getTotalDifferenceNumber() * 100));

				differenceModel.setSpecificDifferenceList(new ArrayList<>());
				differenceModel.getSpecificDifferenceList().add(specific);

			}
			differenceModelList.add(differenceModel);
		}
		insertDifference(differenceModelList);
		setFlag(idCustomer);
	}

	private void setFlag(Integer id) {
		customerResourceFeign.setFlag(id);
	}

	private List<DifferenceCounterModel> adapterList(List<DifferenceCounterModel> modelList) {
		modelList.stream().forEach(c -> {
			List<SpecificDifferenceModel> specificList = c.getSpecificDifferenceList().stream()
					.filter(a -> a.getReferencePrimary() != null && a.getReferenceSecondary() == null)
					.collect(Collectors.toList());
			for (SpecificDifferenceModel spec : specificList) {
				if (spec.getReferencePrimary() != null && spec.getReferenceSecondary() == null) {
					spec.setReferenceSecondary(spec.getReferencePrimary());
					spec.setReferencePrimary(null);
				}

			}
		});

		return modelList;
	}

	public void insertDifference(List<DifferenceCounterModel> differenceList) {
		for (DifferenceCounterModel difference : differenceList)
			counterFeign.insertDifference(difference);

	}

}
