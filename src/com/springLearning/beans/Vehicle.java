package com.springLearning.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle {
	
	@Autowired
	@Qualifier("engine")
	private Engine engine;
	
	public void getDetails() {
		System.out.println("Engine cc value :- "+ engine.getCc());
	}
}
