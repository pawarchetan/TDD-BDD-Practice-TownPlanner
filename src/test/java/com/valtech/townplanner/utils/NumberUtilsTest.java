package com.valtech.townplanner.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberUtilsTest {
    @Test
    public void test1IsOdd() throws Exception {
        assertThat(NumberUtils.isOdd(1)).isTrue();
    }

    @Test
    public void test2IsEven() throws Exception {
        assertThat(NumberUtils.isEven(2)).isTrue();
    }

    @Test
    public void test9IsOdd() throws Exception {
        assertThat(NumberUtils.isOdd(9)).isTrue();
    }

    @Test
    public void test12IsEven() throws Exception {
        assertThat(NumberUtils.isEven(12)).isTrue();
    }

    @Test
    public void testOddIsNotEven() throws Exception {
        assertThat(NumberUtils.isOdd(3)).isTrue();
        assertThat(NumberUtils.isEven(3)).isFalse();
    }

    @Test
    public void testEvenIsNotOdd() throws Exception {
        assertThat(NumberUtils.isEven(4)).isTrue();
        assertThat(NumberUtils.isOdd(4)).isFalse();
    }
}
