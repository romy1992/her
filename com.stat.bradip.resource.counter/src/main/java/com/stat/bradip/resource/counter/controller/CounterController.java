package com.stat.bradip.resource.counter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stat.bradip.commons.counter.model.CounterModel;
import com.stat.bradip.resource.counter.entity.Counter;
import com.stat.bradip.resource.counter.management.MappingMappStructImpl;
import com.stat.bradip.resource.counter.repository.CounterRepository;

@RestController
@RequestMapping("api/counter")
public class CounterController {

	@Autowired
	private CounterRepository counterRepository;

	@Autowired
	private MappingMappStructImpl mapping;

	@PostMapping("insert/counterMonth")
	public CounterModel insertCounter(@RequestBody CounterModel counterModel) {
		return mapping.mappingEntityToModelCounterMonth(
				counterRepository.save(mapping.mappingModelToEntityCounterMonth(counterModel)));
	}

	@GetMapping("getCounterMonth/{id}")
	public CounterModel getCounter(@PathVariable Integer id) {
		return mapping.mappingEntityToModelCounterMonth(counterRepository.findById(id).get());
	}

	@GetMapping("getAllCounter")
	public List<CounterModel> getAllCounter() {
		List<Counter> counterList = counterRepository.findAll();
		List<CounterModel> counterModelList = new ArrayList<>();
		for (Counter counter : counterList)
			counterModelList.add(mapping.mappingEntityToModelCounterMonth(counter));
		return counterModelList;
	}

}
