package com.springLearning.staticVariableInjection;

public class StaticInjection {

	private static String staticField;
	
	public static void setStaticField(String staticField) {
		StaticInjection.staticField = staticField;
	}
	
	public void printData() {
		System.out.println("Value of static variable is :- "+staticField);
	}
}
