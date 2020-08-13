package com.springLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springLearning.beans.Bike;

public class SpringLearningApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/Spring.xml");
		Bike bike = (Bike) context.getBean("bike");

		bike.getDetails();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
