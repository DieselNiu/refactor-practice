package com.github.dieselniu.charpter7.removeMiddleMan6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {
	@Test
	public void should_be_able_to_find_someone_manager() {
		Person bob = new Person("bob", new Department("001", new Person("john", new Department("001"))));
		assertThat(bob.managerName()).isEqualTo("john");
	}


}