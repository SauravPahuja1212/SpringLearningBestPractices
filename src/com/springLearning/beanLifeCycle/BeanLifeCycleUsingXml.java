package com.springLearning.beanLifeCycle;

public class BeanLifeCycleUsingXml {

	private static final String PRINT = "Hello World !";
	
	public void destroy() {
		System.out.println("Printing in destroy() ->" +PRINT);
	}

	public void afterPropertiesSet() {
		System.out.println("Printing in afterPropertiesSet() ->" +PRINT);
	}
	
	public void printDetails() {
		System.out.println("Printing in printDetails() -> "+PRINT);
	}
}
