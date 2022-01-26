package com.github.dieselniu.charpter7.moveField2;

public class Account {
    private final AccountType _type;
    private final double _interestRate;

    public double _interestRate() {
        return _interestRate;
    }

    public AccountType _type() {
        return _type;
    }

    public Account(AccountType _type, double _interestRate) {
        this._type = _type;
        this._interestRate = _interestRate;
    }

    double interestForAmount_days(double amount, int days) {
        return _interestRate * amount * days / 365;
    }

}
