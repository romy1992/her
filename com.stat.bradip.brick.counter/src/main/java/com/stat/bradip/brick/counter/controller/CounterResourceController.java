package com.stat.bradip.brick.counter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stat.bradip.brick.counter.service.CounterResourceService;

@RestController
@RequestMapping("comparationFlgFalse")
public class CounterResourceController {

	@Autowired
	private CounterResourceService counterService;

	@GetMapping("getSpecificCounter/{id}")
	public Long specific(@PathVariable Integer id) {
		List<String> descriptions = new ArrayList<String>();
		descriptions.add("love");
		descriptions.add("like");
		descriptions.add("sorry");
		descriptions.add("haha");
		descriptions.add("anger");
		descriptions.add("wow");
		return counterService.getCounter(id, descriptions, "GENNAIO", "2018");
	}

}
