package com.stat.bradip.brick.counter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.stat.bradip.brick.counter.service.CounterDifferenceService;
import com.stat.bradip.brick.counter.service.CustomerResourceService;
import com.stat.bradip.commons.counter.model.CounterModel;
import com.stat.bradip.commons.model.FaceFileModel;

@RestController
@RequestMapping("comparationFlgFalse")
public class CustomerResourceController {

	@Autowired
	private CustomerResourceService serviceCustomerResource;

	@Autowired
	private CounterDifferenceService serviceCounterDifference;

	@GetMapping("{id}")
	public void getFileAllFalse(@PathVariable Integer id) throws JsonProcessingException {
		List<FaceFileModel> models = serviceCustomerResource.getAllFileFalse(id);
		for (FaceFileModel model : models) {
			CounterModel counterModel = serviceCustomerResource.generatedCounterMounth(id, model);
			serviceCustomerResource.insertCounterMonth(counterModel);
			serviceCounterDifference.sendDat(counterModel.getIdCustomer(), counterModel.getCounterDatFile());
		}
	}

}
