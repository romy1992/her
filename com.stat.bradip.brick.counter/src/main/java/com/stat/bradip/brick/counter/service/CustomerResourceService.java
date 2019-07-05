package com.stat.bradip.brick.counter.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stat.bradip.brick.counter.feign.CounterResourceFeign;
import com.stat.bradip.brick.counter.feign.CustomerResourceFeign;
import com.stat.bradip.commons.counter.model.CounterDatFileMonthModel;
import com.stat.bradip.commons.counter.model.CounterModel;
import com.stat.bradip.commons.model.DateFileModel;
import com.stat.bradip.commons.model.FaceFileModel;
import com.stat.bradip.commons.model.StringSubjectModel;

@Service
@Transactional
public class CustomerResourceService {

	@Autowired
	private CustomerResourceFeign customerResourceFeign;

	@Autowired
	private CounterResourceFeign counterFeign;

	public List<FaceFileModel> getAllFileFalse(Integer idCustomer) {
		return customerResourceFeign.getFileFlagFalse(idCustomer).stream().filter(c -> !c.getIsOk())
				.collect(Collectors.toList());
	}

	public CounterModel generatedCounterMounth(Integer id, FaceFileModel model) {
		CounterModel counterModel = new CounterModel();
		counterModel.setIdCustomer(id);
		counterModel.setIdFile(model.getId());
		List<CounterDatFileMonthModel> files = new ArrayList<>();
		for (String string : searchDescriptions(model)) {
			CounterDatFileMonthModel datFileMounth = new CounterDatFileMonthModel();
			datFileMounth.setMonthRiferimer(model.getMese());
			datFileMounth.setYearRiferiment(model.getAnno());
			datFileMounth.setStringDescription(string);
			datFileMounth.setCounterTotalMonth(counterMounth(string, model));
			files.add(datFileMounth);
		}
		counterModel.setCounterDatFile(files);

		return counterModel;
	}

	private Set<String> searchDescriptions(FaceFileModel model) {
		Set<String> stringsDescription = new HashSet<>();
		model.getDatFileList()
				.forEach(c -> c.getStringSubjectList().forEach(a -> stringsDescription.add(a.getStringDescription())));
		return stringsDescription;
	}

	private Long counterMounth(String description, FaceFileModel model) {
		Long number = 0L;
		for (DateFileModel dataFile : model.getDatFileList()) {
			List<StringSubjectModel> stringSubs = dataFile.getStringSubjectList().stream()
					.filter(s -> s.getStringDescription().equals(description)).collect(Collectors.toList());
			for (StringSubjectModel stringSub : stringSubs) {
				number += stringSub.getNumber();
			}
		}
		return number;
	}

	public void insertCounterMonth(CounterModel counterModel) {

		counterFeign.insertCounterMonth(counterModel);
	}

}
