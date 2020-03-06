package com.revature.configserver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aggregateController {

	@Autowired
	ExperimentClient expClient;
	
	@Autowired
	ConversionClient conversionClient;
	
	@GetMapping("/api/experiment/**")
	public ResponseEntity<Object> getExperiment(String subject, Double unit) {
		Object e = expClient.getExperiment(subject);
		e = conversionClient.convert(e, unit);
		
		return ResponseEntity.ok(e);
	}
	
}
