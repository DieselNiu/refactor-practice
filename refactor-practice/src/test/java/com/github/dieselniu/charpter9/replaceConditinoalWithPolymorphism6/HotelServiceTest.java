package com.github.dieselniu.charpter9.replaceConditinoalWithPolymorphism6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HotelServiceTest {
	@Test
	public void should_be_able_to_calculate_room_price_when_user_level_is_gold() {
		double roomPrice = new HotelService().getRoomPrice(new User(UserLevel.GOLD), new Room());
		assertThat(roomPrice).isEqualTo(0.8);
	}

	@Test
	public void should_be_able_to_calculate_room_price_when_user_level_is_silver() {
		double roomPrice = new HotelService().getRoomPrice(new User(UserLevel.SILVER), new Room());
		assertThat(roomPrice).isEqualTo(0.9);
	}

	@Test
	public void should_be_able_to_calculate_room_price_when_user_level_is_platinum() {
		double roomPrice = new HotelService().getRoomPrice(new User(UserLevel.PLATINUM), new Room());
		assertThat(roomPrice).isEqualTo(0.75);
	}

	@Test
	public void should_be_able_to_calculate_room_price_when_user_level_is_normal() {
		double roomPrice = new HotelService().getRoomPrice(new User(UserLevel.OTHERS), new Room());
		assertThat(roomPrice).isEqualTo(1.0);
	}
}