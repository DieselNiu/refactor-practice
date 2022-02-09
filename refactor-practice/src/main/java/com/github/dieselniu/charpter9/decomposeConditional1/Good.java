package com.github.dieselniu.charpter9.decomposeConditional1;

import java.time.Instant;
import java.util.Date;

public class Good {
    private Double charge;
    private Double _summerRate;
    private Double _winterRate;
    private Double _winterServiceCharge;

    public Good(Double charge, Double _summerRate, Double _winterRate, Double _winterServiceCharge) {
        this.charge = charge;
        this._summerRate = _summerRate;
        this._winterRate = _winterRate;
        this._winterServiceCharge = _winterServiceCharge;
    }

    public Double charge() {
        return charge;
    }

    public Double _summerRate() {
        return _summerRate;
    }

    public Double _winterRate() {
        return _winterRate;
    }

    public Double _winterServiceCharge() {
        return _winterServiceCharge;
    }

    public static Date SUMMER_START() {
        return SUMMER_START;
    }

    public static Date SUMMER_END() {
        return SUMMER_END;
    }

    private static Date SUMMER_START = Date.from(Instant.parse("2007-07-03T10:15:30.00Z"));
    private static Date SUMMER_END = Date.from(Instant.parse("2007-12-03T10:15:30.00Z"));


    public double totalCharge(Date date, int quantity) {
        if (date.before(SUMMER_START) || date.after(SUMMER_END))
            charge = quantity * _winterRate + _winterServiceCharge;
        else charge = quantity * _summerRate;
        return charge;
    }


}
