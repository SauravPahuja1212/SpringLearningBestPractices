package com.springLearning.lookupMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearningLookUpMethod {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/SpringLookUpMethod.xml");
		LookUpMethodClass lookUpMethod = (LookUpMethodClass) context.getBean("lookUpMethod");
		
		System.out.println(lookUpMethod.getEngine());
		
		context.close();
	}
}
