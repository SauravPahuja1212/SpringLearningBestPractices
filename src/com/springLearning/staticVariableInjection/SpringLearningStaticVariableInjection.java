package com.springLearning.staticVariableInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearningStaticVariableInjection {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/SpringStaticVariableInjection.xml");
		
		StaticInjection staticInjection = (StaticInjection) context.getBean("staticInjection");
		staticInjection.printData();
		
		context.close();
	}
}
