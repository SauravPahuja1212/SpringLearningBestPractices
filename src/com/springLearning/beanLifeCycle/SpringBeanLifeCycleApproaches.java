package com.springLearning.beanLifeCycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleApproaches {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("resource/SpringBeanLifeCycle.xml");
		//BeanLifeCycleUsingInterfaces usingInterfaces = (BeanLifeCycleUsingInterfaces) context.getBean("usingInterfaces");
		//BeanLifeCycleUsingXml usingXml = (BeanLifeCycleUsingXml) context.getBean("usingXml");
		BeanLifeCycleUsingAnnotations usingAnnotations = (BeanLifeCycleUsingAnnotations) context.getBean("usingAnnotations");
		
		usingAnnotations.printDetails();
		
		context.close();
	}
}
