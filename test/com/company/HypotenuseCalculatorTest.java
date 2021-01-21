package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypotenuseCalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void hypotenuse() {
        assertEquals(5.0, HypotenuseCalculator.hypotenuse(3.0, 4.0));
        assertEquals(17.0, HypotenuseCalculator.hypotenuse(8.0, 15.0));
    }
}