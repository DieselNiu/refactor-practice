package com.github.dieselniu.charpter7.inlineClass4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {
    @Test
    public void should_be_able_to_get_telephone() {
        Person person = new Person("niu", new Telephone("+86", "13980334323"));
        assertThat(person.getTelephoneNumber()).isEqualTo("(+86)13980334323");
    }
}