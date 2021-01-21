package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getGCD() {
        assertEquals(8, GreatestCommonDivisor.getGCD(16, 24));
        assertEquals(4, GreatestCommonDivisor.getGCD(12, 20));
    }
}