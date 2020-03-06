package com.revature.configserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="AggregateService")
public interface projectRepo {
	
	@GetMapping("/api/experiment")
	public String getExperiment();

}
