package com.springLearning.propertiesFileInjection;

public class PropertiesFileInjection {
	
	private String brand;
	private String model;
	private String year;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void printProperties() {
		System.out.println(brand+" "+model+" "+year);
	}
}
