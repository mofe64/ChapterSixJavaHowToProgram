package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isPerfect() {
        assertTrue(PerfectNumber.isPerfect(6));
        assertTrue(PerfectNumber.isPerfect(28));
        assertTrue(PerfectNumber.isPerfect(496));
        assertTrue(PerfectNumber.isPerfect(8128));
        assertFalse(PerfectNumber.isPerfect(100));
        assertFalse(PerfectNumber.isPerfect(1829));
    }
}