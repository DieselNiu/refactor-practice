package com.github.dieselniu.charpter7.moveMethod1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {
    @Test
    public void should_be_able_to_calculate_over_draft_charge_and_bank_charge_when_account_is_premium_and_over_drawn_more_than_seven_days() {
        Account premium = new Account(new AccountType("premium"), 10);
        double overdraftCharge = premium.overdraftCharge();
        double bankCharge = premium.bankCharge();
        assertThat(overdraftCharge).isEqualTo(12.55);
        assertThat(bankCharge).isEqualTo(17.05);
    }


    @Test
    public void should_be_able_to_calculate_over_draft_charge_and_bank_charge_when_account_is_premium_and_over_drawn_less_than_seven_days() {
        Account premium = new Account(new AccountType("premium"), 6);
        double overdraftCharge = premium.overdraftCharge();
        double bankCharge = premium.bankCharge();
        assertThat(overdraftCharge).isEqualTo(10);
        assertThat(bankCharge).isEqualTo(14.5);
    }

    @Test
    public void should_be_able_to_calculate_over_draft_charge_bank_charge_when_account_is_not_premium_and_over_drawn() {
        Account premium = new Account(new AccountType("not_premium"), 10);
        double overdraftCharge = premium.overdraftCharge();
        double bankCharge = premium.bankCharge();
        assertThat(overdraftCharge).isEqualTo(17.5);
        assertThat(bankCharge).isEqualTo(22);
    }

    @Test
    public void should_be_able_to_calculate_over_draft_charge_bank_charge_when_account_is_not_premium_and_not_over_drawn() {
        Account premium = new Account(new AccountType("not_premium"), 0);
        double overdraftCharge = premium.overdraftCharge();
        double bankCharge = premium.bankCharge();
        assertThat(overdraftCharge).isEqualTo(0);
        assertThat(bankCharge).isEqualTo(4.5);
    }

}