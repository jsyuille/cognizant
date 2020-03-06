package com.revature.configserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ExperimentController {

	@Autowired
	ExperimentRepository expRepo;
	
	@GetMapping("/api/experiment/**")
	public ResponseEntity<SpeedResult> getExperimentById(int i) {
		return ResponseEntity.ok(expRepo.findById(i));
	}
	
	@PostMapping("/api/experiment")
	public void updateExperiment(SpeedResult sr) {
		expRepo.save(sr);
	}
}
