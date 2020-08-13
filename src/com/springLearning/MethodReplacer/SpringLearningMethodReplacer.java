package com.springLearning.MethodReplacer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearningMethodReplacer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/SpringMethodReplacer.xml");
		MethodReplacerOldImplementation oldImplementation = (MethodReplacerOldImplementation) context.getBean("methodReplacer");
		
		oldImplementation.implementation();
		
		context.close();
	}
}
