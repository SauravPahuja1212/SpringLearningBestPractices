package com.springLearning.autoWired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springLearning.beans.Vehicle;

public class AutoWiredExample {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/SpringAutowired.xml");
		Vehicle vehicle = (Vehicle) context.getBean("vehicle");
		
		vehicle.getDetails();
		
		//Closing the context to save any leak
		context.close();
	}
}
