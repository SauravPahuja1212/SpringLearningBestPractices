package com.springLearning.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleUsingInterfaces implements InitializingBean, DisposableBean {

	private static final String PRINT = "Hello World !";
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Printing in destroy() ->" +PRINT);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Printing in afterPropertiesSet() ->" +PRINT);
	}
	
	public void printDetails() {
		System.out.println("Printing in printDetails() -> "+PRINT);
	}
}
