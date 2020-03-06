package com.revature.configserver;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SpeedResult {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String subjectName;
	
	@Column
	private Speed speed;
	
	@Column
	private Timestamp experimentTime;

	public SpeedResult() {
		super();
	}

	public SpeedResult(Long id, String subjectName, Speed speed, Timestamp experimentTime) {
		super();
		this.id = id;
		this.subjectName = subjectName;
		this.speed = speed;
		this.experimentTime = experimentTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

	public Timestamp getExperimentTime() {
		return experimentTime;
	}

	public void setExperimentTime(Timestamp experimentTime) {
		this.experimentTime = experimentTime;
	}

	@Override
	public String toString() {
		return "SppedResult [id=" + id + ", subjectName=" + subjectName + "]";
	}
	
	

}
