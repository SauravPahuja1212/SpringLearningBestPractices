package com.springLearning.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("autoMOBILE")
public class Automobile {
	
	@Autowired
	@Qualifier("engine1")
	private Engine engine;
	
	public void printData() {
		System.out.println("Automobile capacity is cc :- "+engine.getCc());
	}
}
