package com.revature.configserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class experimentGetter {

	@Autowired
	projectRepo pr;
	
	GetMapping("/api/experiment")
	public String pr.getExperiment();
	//Gets information from aggregate information
}
