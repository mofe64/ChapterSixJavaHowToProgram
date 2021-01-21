package com.company;

public class GreatestCommonDivisor {

    public static int getGCD(int numberOne, int numberTwo) {
        int largestValue = Math.max(numberOne, numberTwo);
        int divisor;
        int largestDivisor = 0;
        for (int i = 1; i < largestValue; i++) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                divisor = i;
                if (divisor > largestDivisor) {
                    largestDivisor = divisor;
                }
            }
        }
        return largestDivisor;
    }
}
