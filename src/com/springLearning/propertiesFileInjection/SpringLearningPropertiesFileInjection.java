package com.springLearning.propertiesFileInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearningPropertiesFileInjection {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/SpringPropertiesFileInjection.xml");
		PropertiesFileInjection propertyInjection = (PropertiesFileInjection) context.getBean("propertiesFile");
		
		propertyInjection.printProperties();
		
		context.close();
	}
}
