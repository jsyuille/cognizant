package com.revature.configserver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface aggregateRepository extends JpaRepository<SpeedResult, Integer>{

	
}
