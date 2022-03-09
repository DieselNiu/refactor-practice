package com.github.dieselniu.charpter7.removeMiddleMan6;


public class Department {
	private String chargeCode;
	private Person manager;

	public Department(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public Department(String chargeCode,Person manager) {
		this.chargeCode = chargeCode;
		this.manager = manager;
	}

	public String getChargeCode() {
		return chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public Person getManager() {
		return manager;
	}

	public void setManager(Person manager) {
		this.manager = manager;
	}
}
