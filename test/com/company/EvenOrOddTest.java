package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isEven() {
        assertTrue(EvenOrOdd.isEven(6));
        assertTrue(EvenOrOdd.isEven(18));
        assertFalse(EvenOrOdd.isEven(77));
    }
}