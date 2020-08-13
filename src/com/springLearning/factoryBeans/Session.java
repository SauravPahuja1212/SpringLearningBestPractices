package com.springLearning.factoryBeans;

public class Session {
	
	protected Session(Object o) throws IllegalAccessException {
		if(!(o instanceof SessionFactory))
			throw new IllegalAccessException("This session is only accessible through SessionFactory");
	}
	
	public void printSessionDetails() {
		System.out.println("You accessed this session :-> "+ this.getClass().getCanonicalName());
	}
}
