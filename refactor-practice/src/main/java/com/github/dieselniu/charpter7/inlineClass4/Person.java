package com.github.dieselniu.charpter7.inlineClass4;

public class Person {
    private final String _name;
    private final Telephone telephone;

    public Person(String _name, Telephone telephone) {
        this._name = _name;
        this.telephone = telephone;
    }

    public String _name() {
        return _name;
    }

    public String getTelephoneNumber() {
        return ("(" + telephone._officeAreaCode()) + ")" + telephone._officeNumber();
    }

}
