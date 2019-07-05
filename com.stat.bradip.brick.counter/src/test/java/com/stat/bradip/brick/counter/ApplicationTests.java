package com.stat.bradip.brick.counter;

import java.util.ArrayList;
import java.util.List;

import com.stat.bradip.brick.counter.service.CounterResourceService;

public class ApplicationTests {

	public static void main(String[] args) {
		CounterResourceService service = new CounterResourceService();

		List<String> descriptions = new ArrayList<String>();
		descriptions.add("love");
		System.out.println(service.getCounter(1, descriptions, "GENNAIO", "2019"));
		
	}
}
