package com.revature.configserver;

import javax.persistence.Embeddable;

@Embeddable
public class Speed {

	private Duration duration;
	private Distance distance;
}
