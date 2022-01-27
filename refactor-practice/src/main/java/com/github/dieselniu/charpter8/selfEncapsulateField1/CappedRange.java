package com.github.dieselniu.charpter8.selfEncapsulateField1;

public class CappedRange extends IntRange {

    private int _cap;

    public int _cap() {
        return _cap;
    }

    public CappedRange(int _low, int _high, int cap) {
        super(_low, _high);

    }

    @Override
    public int _high() {
        return Math.min(super._high(), _cap());
    }
}
