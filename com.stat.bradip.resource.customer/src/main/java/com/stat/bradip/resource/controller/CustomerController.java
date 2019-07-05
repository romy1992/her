package com.stat.bradip.resource.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stat.bradip.commons.model.CustomerModel;
import com.stat.bradip.resource.entity.Customer;
import com.stat.bradip.resource.management.MappingMapStruct;
import com.stat.bradip.resource.repository.CustomerRepository;

@RestController
@RequestMapping("/mapping")
public class CustomerController {

	@Autowired
	private MappingMapStruct mappingStruct;

	@Autowired
	private CustomerRepository repository;

	@PostMapping("/insert")
	public CustomerModel insert(@RequestBody CustomerModel model) {
		return mappingStruct.mappingEntityToModel(repository.save(mappingStruct.mappingModelToEntity(model)));
	}

	@GetMapping("/getAll")
	public List<CustomerModel> getAll() {
		List<Customer> entities = repository.findAll();
		List<CustomerModel> model = new ArrayList<>();
		for (Customer entity : entities)
			model.add(mappingStruct.mappingEntityToModel(entity));
		return model;
	}

	@GetMapping("/getCustomerName/{id}")
	public CustomerModel getCustomer(@PathVariable Integer id) {
		try {
			return mappingStruct.mappingEntityToModel(repository.findById(id).get());
		} catch (NoSuchElementException e) {
			return new ResponseEntity<CustomerModel>(HttpStatus.NOT_FOUND).getBody();
		}
	}

	@GetMapping("/deleteCustomer/{id}")
	public boolean delete(@PathVariable Integer id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}

}
