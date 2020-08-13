package com.springLearning.factoryBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearningFactoryBeans {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resource/SpringFactoryBean.xml");
		Session session = (Session) context.getBean("s");
		session.printSessionDetails();
		
		context.close();
	}
}
