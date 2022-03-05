package com.github.dieselniu.charpter7.hideDelegate5;

public class Person {
	private String name;
	private Department department;

	public Person(String name, Department department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public Department getDepartment() {
		return department;
	}
}
