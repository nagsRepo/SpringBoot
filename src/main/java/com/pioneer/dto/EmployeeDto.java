package com.pioneer.dto;

import org.codehaus.jackson.annotate.JsonProperty;

public class EmployeeDto {

	private String social;
	@JsonProperty("name")
	private String name;
	@JsonProperty("age")
	private int age;

	public EmployeeDto() {
		super();
	}

	public EmployeeDto(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getSocial() {
		return social;
	}

	public void setSocial(String social) {
		this.social = social;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [social=" + social + ", Name=" + name + ", age=" + age + "]";
	}

}
