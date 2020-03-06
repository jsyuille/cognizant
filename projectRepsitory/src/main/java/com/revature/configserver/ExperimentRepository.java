package com.revature.configserver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ExperimentRepository extends JpaRepository<SpeedResult, Integer>{

	public SpeedResult findById(int i);
	
	public void save(SpeedResult sr);
}
