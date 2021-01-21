package com.company;

public class HypotenuseCalculator {
    public static double hypotenuse(double side1, double side2) {
        double value = (side1 * side1) + (side2 * side2);
        return Math.sqrt(value);

    }
}
