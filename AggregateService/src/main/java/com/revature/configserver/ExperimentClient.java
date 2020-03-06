package com.revature.configserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="projectRepository")
public interface ExperimentClient {

	@GetMapping("/api/experiment/**")
	public Object getExperiment(String Subject);
}
