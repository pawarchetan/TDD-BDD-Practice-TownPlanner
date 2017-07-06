package com.valtech.townplanner.utils;

public class NumberUtils {
    public static boolean isEven(Integer value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(Integer value) {
        return !isEven(value);
    }
}
