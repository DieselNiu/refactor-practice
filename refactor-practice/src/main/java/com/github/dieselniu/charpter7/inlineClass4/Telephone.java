package com.github.dieselniu.charpter7.inlineClass4;

public class Telephone {
    private final String _officeAreaCode;
    private final String _officeNumber;

    public Telephone(String _officeAreaCode, String _officeNumber) {
        this._officeAreaCode = _officeAreaCode;
        this._officeNumber = _officeNumber;
    }

    public String _officeNumber() {
        return _officeNumber;
    }

    public String _officeAreaCode() {
        return _officeAreaCode;
    }
}
