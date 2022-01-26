package com.github.dieselniu.charpter8.selfEncapsulateField1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntRangeTest {
    @Test
    public void should_be_able_to_judge_int_range() {
        IntRange intRange = new IntRange(1, 10);
        assertThat(intRange.includes(5)).isEqualTo(Boolean.TRUE);
        assertThat(intRange.includes(11)).isEqualTo(Boolean.FALSE);
    }


    @Test
    public void should_be_able_to_grow_high_level_for_int_range() {
        IntRange intRange = new IntRange(1, 10);
        intRange.grow(2);
        assertThat(intRange._high()).isEqualTo(20);
    }
}