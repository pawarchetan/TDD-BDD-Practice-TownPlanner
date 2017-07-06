package com.valtech.townplanner;

import org.junit.Test;

import java.util.Arrays;

public class StreetAppTest {
    @Test
    public void testStreetAppHasProcess() throws Exception {
        new StreetApp(Arrays.asList(1, 2)).process();
    }

    @Test
    public void testStreetAppInValidHouseNumbers() throws Exception {
        new StreetApp(Arrays.asList(
                1, 2, 4, 3, 6, 5, 7, 8, 9, 10, 12, 11, 13, 15)).process();
    }
}
