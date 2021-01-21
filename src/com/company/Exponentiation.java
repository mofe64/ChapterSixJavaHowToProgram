package com.company;

public class Exponentiation {
    public static int integerPower(int base, int exponent) {
        int value = 1;
        for (int i = 0; i < exponent; i++) {
            value *= base;

        }
        return value;
    }
}
