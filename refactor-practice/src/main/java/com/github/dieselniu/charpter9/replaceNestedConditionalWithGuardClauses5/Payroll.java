package com.github.dieselniu.charpter9.replaceNestedConditionalWithGuardClauses5;

public class Payroll {
    private final boolean _Dead;
    private final boolean _isRetired;
    private final boolean _isSeparated;

    public Payroll(boolean _Dead, boolean _isRetired, boolean _isSeparated) {
        this._Dead = _Dead;
        this._isRetired = _isRetired;
        this._isSeparated = _isSeparated;
    }

    public double getPayAmount() {
        double result;
        if (_Dead()) result = deadAmount();
        else {
            if (_isSeparated()) result = separatedAmount();
            else {
                if (_isRetired()) result = retiredAmount();
                else result = normalPayAmount();
            }
        }
        return result;
    }

    private boolean _isSeparated() {
        return _isSeparated;
    }

    private boolean _Dead() {
        return _Dead;
    }

    private boolean _isRetired() {
        return _isRetired;
    }

    private double normalPayAmount() {
        return 6.0;
    }

    private double retiredAmount() {
        return 4.0;
    }


    private double separatedAmount() {
        return 2.0;
    }

    private double deadAmount() {
        return 0;
    }
}
