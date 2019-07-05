package com.stat.bradip.resource.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stat.bradip.commons.model.CustomerModel;
import com.stat.bradip.commons.model.FaceFileModel;
import com.stat.bradip.resource.entity.Customer;
import com.stat.bradip.resource.entity.FaceFile;
import com.stat.bradip.resource.management.MappingMapStruct;
import com.stat.bradip.resource.repository.CustomerRepository;
import com.stat.bradip.resource.repository.FileXmlRepository;

@RestController
@RequestMapping("/project")
public class ProfilProjectController {

	@PersistenceContext
	EntityManager em;

	@Autowired
	private MappingMapStruct mappingStruct;

	@Autowired
	private CustomerRepository repository;

	@Autowired
	private FileXmlRepository fileXmlRepository;

	@PostMapping("/insertDocumentInput")
	public CustomerModel insertFile(@RequestBody CustomerModel model) {
		Customer customerEntity = mappingStruct.mappingModelToEntity(model);
		customerEntity.getFaceList().forEach(c -> c.setCustomer(customerEntity));
		return mappingStruct.mappingEntityToModel(repository.save(customerEntity));
	}

	@GetMapping("/deleteFile/{id}")
	public boolean deleteFile(@PathVariable Integer id) {

		if (fileXmlRepository.existsById(id)) {
			fileXmlRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@GetMapping("/getAllFile/{id}")
	public List<FaceFileModel> getAllFile(@PathVariable Integer id) {
		return mappingStruct.mappingEntityToModel(repository.findById(id).get()).getFaceList();
	}

	@GetMapping("/setFileFlag/{id}")
	public Boolean setFlagTrue(@PathVariable Integer id) {
		Optional<Customer> customer = repository.findById(id);
		if (customer.isPresent()) {
			List<FaceFile> entitiesFace = customer.get().getFaceList().stream().filter(file -> file.getId() != null)
					.collect(Collectors.toList());
			for (FaceFile entity : entitiesFace) {
				entity.setIsOk(true);
			}
			customer.get().setFaceList(entitiesFace);
			repository.save(customer.get());
			return true;
		}
		return false;

	}
}
