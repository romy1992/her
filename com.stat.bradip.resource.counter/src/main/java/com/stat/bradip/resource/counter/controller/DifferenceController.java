package com.stat.bradip.resource.counter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stat.bradip.commons.counter.model.DifferenceCounterModel;
import com.stat.bradip.resource.counter.entity.DifferenceCounter;
import com.stat.bradip.resource.counter.management.MappingMappStruct;
import com.stat.bradip.resource.counter.repository.DifferenceRepository;

@RestController
@RequestMapping("api/difference")
public class DifferenceController {

	@Autowired
	private DifferenceRepository repository;

	@Autowired
	private MappingMappStruct mapp;

	@PostMapping("insertDifference")
	public DifferenceCounterModel insert(@RequestBody DifferenceCounterModel model) {
		return mapp.mappingEntityToModelDifferenceCounter(
				repository.save(mapp.mappingModelToEntityDifferenceCounter(model)));
	}

	@GetMapping("getAllSpecific")
	public List<DifferenceCounterModel> getSpecificUpdate() {
		List<DifferenceCounter> counterSpecific = repository.findAll();
		List<DifferenceCounterModel> newDifference = new ArrayList<>();
		if (!counterSpecific.isEmpty()) {
			for (DifferenceCounter dif : counterSpecific) {
				newDifference.add(mapp.mappingEntityToModelDifferenceCounter(dif));
			}
			return newDifference;
		}
		return new ArrayList<>();
	}
}
