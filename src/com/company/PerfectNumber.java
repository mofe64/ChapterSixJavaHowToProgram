package com.company;

import java.util.HashSet;
import java.util.Set;

public class PerfectNumber {
    public static boolean isPerfect(int number) {
        Set<Integer> factors = new HashSet<>();
        for (int i = 0; i < number; i++) {
            for (int j = number; j > 0; j--) {
                if (i * j == number) {
                    factors.add(i);
                    factors.add(j);
                }
            }
        }
        factors.remove(number);
        int sum = 0;
        for (int num : factors) {
            sum += num;
        }
        return sum == number;
    }
}
