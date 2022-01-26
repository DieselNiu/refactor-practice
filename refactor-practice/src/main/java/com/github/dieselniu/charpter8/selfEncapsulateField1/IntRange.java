package com.github.dieselniu.charpter8.selfEncapsulateField1;

public class IntRange {
    private final int _low;
    private int _high;

    public int _low() {
        return _low;
    }

    public int _high() {
        return _high;
    }

    public IntRange(int _low, int _high) {
        this._low = _low;
        this._high = _high;
    }

    boolean includes(int arg) {
        return arg >= _low && arg <= _high;
    }

    void grow(int factor) {
        _high = _high * factor;
    }
}
