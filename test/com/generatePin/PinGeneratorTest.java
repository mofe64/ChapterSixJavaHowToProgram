package com.generatePin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinGeneratorTest {
        PinGenerator pinGenerator;
    @BeforeEach
    void setUp() {
        pinGenerator = new PinGenerator(2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void generateUnsaltedPin() {
        System.out.println( pinGenerator.generateUnsaltedPin());

    }

    @Test
    void generateSaltedPin() {
        long unsaltedPin = pinGenerator.generateUnsaltedPin();
        System.out.println("unsalted pin is " + unsaltedPin);
        System.out.println("salted pin is "  + pinGenerator.encryptPin(unsaltedPin));
        System.out.println("salt is " + pinGenerator.getSalt());
    }
}