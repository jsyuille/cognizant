package com.revature.configserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="DistanceUnit-Repository")
public interface ConversionClient {

	@PostMapping("/api/experiment")
	public Object convert(Object sr, Double c);
}
