package com.github.dieselniu.charpter7.moveMethod1;

public class Account {
    private final AccountType _type;
    private final int _daysOverdrawn;

    public Account(AccountType _type, int _daysOverdrawn) {
        this._type = _type;
        this._daysOverdrawn = _daysOverdrawn;
    }

    double overdraftCharge() {
        if (_type.isPremium()) {
            double result = 10;
            if (_daysOverdrawn > 7) result += (_daysOverdrawn - 7) * 0.85;
            return result;
        } else return _daysOverdrawn * 1.75;
    }


    double bankCharge() {
        double result = 4.5;
        if (_daysOverdrawn > 0) result += overdraftCharge();
        return result;
    }

}
