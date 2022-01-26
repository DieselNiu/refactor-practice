package com.github.dieselniu.charpter7.moveField2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {
    @Test
    public void should_be_able_to_calculate_interest_for_one_day() {
        Account premium = new Account(new AccountType("premium"), 365.00);
        double interestForAmountDays = premium.interestForAmount_days(2.5, 5);
        assertThat(interestForAmountDays).isEqualTo(12.5);
    }

}