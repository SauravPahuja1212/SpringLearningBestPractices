package com.springLearning.EventHandler;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearningEventHandler {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("resource/SpringEventHandler.xml");
		
		context.start();
		context.stop();
		context.close();
		
		context.refresh();
	}
}
