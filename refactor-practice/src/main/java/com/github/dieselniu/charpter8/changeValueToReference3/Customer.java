package com.github.dieselniu.charpter8.changeValueToReference3;

public class Customer {
	private final String name;

	private Customer(String name) {
		this.name = name;
	}

	public static Customer create(String customerName) {
		return new Customer(customerName);
	}

	public String getName() {
		return name;
	}
}
