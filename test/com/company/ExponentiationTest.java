package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentiationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void integerPower() {
       assertEquals(81,Exponentiation.integerPower(3,4));
       assertEquals(6561, Exponentiation.integerPower(9, 4));
    }

}