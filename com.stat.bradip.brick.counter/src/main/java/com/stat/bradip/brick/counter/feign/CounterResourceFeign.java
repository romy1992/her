package com.stat.bradip.brick.counter.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stat.bradip.commons.counter.model.CounterModel;
import com.stat.bradip.commons.counter.model.DifferenceCounterModel;

@FeignClient(name = "counter", configuration = FeignClientConfiguration.class)
public interface CounterResourceFeign {

	@RequestMapping("api/counter/insert/counterMonth")
	public void insertCounterMonth(@RequestBody CounterModel counterModel);

	@RequestMapping("api/counter/getCounterMonth/{id}")
	public ResponseEntity<CounterModel> getCounter(@PathVariable Integer id);
	
	@RequestMapping("api/difference/insertDifference")
	public void insertDifference(@RequestBody DifferenceCounterModel differenceModel);
	
	@RequestMapping("api/counter/getAllCounter")
	public ResponseEntity<List<CounterModel>> getAllCounter();
	
	@RequestMapping("api/difference/getAllSpecific")
	public ResponseEntity<List<DifferenceCounterModel>> getSpecific();
}
