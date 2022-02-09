package com.github.dieselniu.charpter9.decomposeConditional1;

import java.time.Instant;
import java.util.Date;

public class Good {
    private int quantity;
    private int charge;
    private Date date;

    public Good(int quantity, int charge, Date date) {
        this.quantity = quantity;
        this.charge = charge;
        this.date = date;
    }

    public int quantity() {
        return quantity;
    }

    public int charge() {
        return charge;
    }

    public Date date() {
        return date;
    }

    public static Date SUMMER_START() {
        return SUMMER_START;
    }

    public static Date SUMMER_END() {
        return SUMMER_END;
    }

    private static Date SUMMER_START = Date.from(Instant.parse("2007-07-03T10:15:30.00Z"));
    private static Date SUMMER_END = Date.from(Instant.parse("2007-12-03T10:15:30.00Z"));


    public int totalCharge( int _summerRate, int _winterServiceCharge, int _winterRate) {
        if (date.before(SUMMER_START) || date.after(SUMMER_END))
            charge = quantity * _winterRate + _winterServiceCharge;
        else charge = quantity * _summerRate;

        return charge;
    }


}
