package com.springLearning.componentScan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springLearning.beans.Automobile;

public class SpringLearningComponentScan {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/SpringComponentScan.xml");
		
		Automobile mobile = (Automobile) context.getBean("autoMOBILE");
		mobile.printData();
		
		context.close();
	}
}
