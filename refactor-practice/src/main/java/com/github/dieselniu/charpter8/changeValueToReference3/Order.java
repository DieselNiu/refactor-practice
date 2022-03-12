package com.github.dieselniu.charpter8.changeValueToReference3;

public class Order {
	private Customer customer;

	public Order(String customerName) {
		this.customer = Customer.create(customerName);
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getCustomerName() {
		return customer.getName();
	}

	public void setCustomer(String customerName) {
		this.customer = Customer.create(customerName);
	}
}
