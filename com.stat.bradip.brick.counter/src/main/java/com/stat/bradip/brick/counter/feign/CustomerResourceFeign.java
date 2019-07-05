package com.stat.bradip.brick.counter.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stat.bradip.commons.model.FaceFileModel;

@FeignClient(name = "customer", configuration = FeignClientConfiguration.class)
public interface CustomerResourceFeign {

	@RequestMapping("/project/getAllFile/{id}")
	public List<FaceFileModel> getFileFlagFalse(@PathVariable Integer id);

	@RequestMapping("/project/setFileFlag/{id}")
	public void setFlag(@PathVariable("id") Integer id);
}
