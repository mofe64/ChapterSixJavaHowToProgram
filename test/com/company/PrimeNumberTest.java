package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isPrime() {
        assertTrue(PrimeNumber.isPrime(7));
        assertTrue(PrimeNumber.isPrime(5));
        assertFalse(PrimeNumber.isPrime(9));
        assertFalse(PrimeNumber.isPrime(8));
        assertFalse(PrimeNumber.isPrime(1));
        assertFalse(PrimeNumber.isPrime(1000000000));
    }
}