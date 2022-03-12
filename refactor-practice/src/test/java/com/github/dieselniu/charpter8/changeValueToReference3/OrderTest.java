package com.github.dieselniu.charpter8.changeValueToReference3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {
	@Test
	public void should_1_order_not_equal_to_1_order_with_same_customer_name() {
		Order order1 = new Order("niuweizhe");
		assertThat(order1.getCustomer()).isNotEqualTo(new Order("niuweizhe"));
	}

}