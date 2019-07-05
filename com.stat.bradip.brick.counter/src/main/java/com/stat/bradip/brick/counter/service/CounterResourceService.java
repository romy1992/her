package com.stat.bradip.brick.counter.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stat.bradip.brick.counter.feign.CounterResourceFeign;
import com.stat.bradip.commons.counter.model.CounterDatFileMonthModel;

@Service
@Transactional
public class CounterResourceService {

	@Autowired
	private CounterResourceFeign counterFeign;

	public Long getCounter(Integer id, List<String> descriptions, String mese, String anno) {
		List<CounterDatFileMonthModel> datFileModel = counterFeign.getCounter(id).getBody().getCounterDatFile();
		Long counter = 0L;
		for (String description : descriptions) {
			List<CounterDatFileMonthModel> specificModel = datFileModel
					.stream().filter(c -> c.getStringDescription().equals(description)
							&& c.getMonthRiferimer().equals(mese) && c.getYearRiferiment().equals(anno))
					.collect(Collectors.toList());
			for (CounterDatFileMonthModel sp : specificModel) {
				counter += sp.getCounterTotalMonth();
			}

		}
		return counter;
	}

}
