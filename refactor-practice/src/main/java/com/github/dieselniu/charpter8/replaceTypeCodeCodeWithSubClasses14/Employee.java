package com.github.dieselniu.charpter8.replaceTypeCodeCodeWithSubClasses14;

public class Employee {
	private int _type;
	public static final int ENGINEER = 0;
	public static final int SALESMEN = 1;
	public static final int MANAGER = 2;

	public Employee(int _type) {
		this._type = _type;
	}

	public Employee() {

	}
}
