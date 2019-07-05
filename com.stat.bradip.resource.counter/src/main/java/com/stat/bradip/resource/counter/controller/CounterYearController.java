package com.stat.bradip.resource.counter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stat.bradip.commons.counter.model.CounterYearModel;
import com.stat.bradip.resource.counter.management.MappingMappStruct;
import com.stat.bradip.resource.counter.repository.CounterYearRepository;

@RestController
public class CounterYearController {

	@Autowired
	private CounterYearRepository repository;

	@Autowired
	private MappingMappStruct mapping;

	@PostMapping("insertCounterYear")
	public CounterYearModel insert(@RequestBody CounterYearModel model) {
		return mapping.mappingEntityToModelCounterYear(repository.save(mapping.mappingModelToEntityCounterYear(model)));
	}
}
