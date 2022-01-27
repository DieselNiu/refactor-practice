package com.github.dieselniu.charpter7.extractClass3;

public class Person {
    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;

    public Person(String _name, String _officeAreaCode, String _officeNumber) {
        this._name = _name;
        this._officeAreaCode = _officeAreaCode;
        this._officeNumber = _officeNumber;
    }

    public String _name() {
        return _name;
    }

    public String _officeNumber() {
        return _officeNumber;
    }

    public String _officeAreaCode() {
        return _officeAreaCode;
    }

    public String getTelephoneNumber() {
        return ("(" + _officeAreaCode + ")" + _officeNumber);
    }
}
