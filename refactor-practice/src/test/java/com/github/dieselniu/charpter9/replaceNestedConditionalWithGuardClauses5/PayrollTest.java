package com.github.dieselniu.charpter9.replaceNestedConditionalWithGuardClauses5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PayrollTest {
    @Test
    public void should_be_able_to_calculate_pay_amount_when_people_is_dead() {
        Payroll payroll = new Payroll(true, false, false);
        double payAmount = payroll.getPayAmount();
        assertThat(payAmount).isEqualTo(0.0);
    }

    @Test
    public void should_be_able_to_calculate_pay_amount_when_people_is_separated() {
        Payroll payroll = new Payroll(false, false, true);
        double payAmount = payroll.getPayAmount();
        assertThat(payAmount).isEqualTo(2.0);
    }

    @Test
    public void should_be_able_to_calculate_pay_amount_when_people_is_retired() {
        Payroll payroll = new Payroll(false, true, false);
        double payAmount = payroll.getPayAmount();
        assertThat(payAmount).isEqualTo(4.0);
    }

    @Test
    public void should_be_able_to_calculate_pay_amount_when_people_is_normal() {
        Payroll payroll = new Payroll(false, false, false);
        double payAmount = payroll.getPayAmount();
        assertThat(payAmount).isEqualTo(6.0);
    }
}