package com.springLearning.beans;

import java.util.Map;
import java.util.Set;

public class Bike {
	private Map<Integer, Engine> engine;
	private String name;
	
	public void setEngine(Map<Integer, Engine> engine) {
		this.engine = engine;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void getDetails() {
		System.out.println(this.name);
		Set<Integer> set = engine.keySet();
		for(Integer e : set) {
			System.out.println(engine.get(e).getCc());
		}
	}
}
