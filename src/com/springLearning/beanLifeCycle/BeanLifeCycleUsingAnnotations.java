package com.springLearning.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycleUsingAnnotations {

	private static final String PRINT = "Hello World !";
	
	@PreDestroy
	public void destroy() {
		System.out.println("Printing in destroy() ->" +PRINT);
	}

	@PostConstruct
	public void afterPropertiesSet() {
		System.out.println("Printing in afterPropertiesSet() ->" +PRINT);
	}
	
	public void printDetails() {
		System.out.println("Printing in printDetails() -> "+PRINT);
	}
}
