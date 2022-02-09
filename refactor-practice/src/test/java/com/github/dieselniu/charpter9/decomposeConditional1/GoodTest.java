package com.github.dieselniu.charpter9.decomposeConditional1;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

class GoodTest {
    @Test
    public void should_be_able_to_calculate_good_charge_when_in_summer() {
        Good good = new Good(2, 2, Date.from(Instant.parse("2007-08-03T10:15:30.00Z")));
        int totalCharge = good.totalCharge(2, 2, 2);
        assertThat(totalCharge).isEqualTo(4);
    }

    @Test
    public void should_be_able_to_calculate_good_charge_when_not_in_summer() {
        Good good = new Good(2, 2, Date.from(Instant.parse("2006-08-03T10:15:30.00Z")));
        int totalCharge = good.totalCharge(2, 2, 2);
        assertThat(totalCharge).isEqualTo(6);
    }
}