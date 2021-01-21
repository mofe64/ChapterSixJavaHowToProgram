package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {
    ParkingCharges parkingCharges;
    @BeforeEach
    void setUp() {
        parkingCharges = new ParkingCharges();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateCharge() {
       assertEquals(6.0,parkingCharges.calculateCharge(3));
       assertEquals(8.5, parkingCharges.calculateCharge(4));
       assertEquals(11.5, parkingCharges.calculateCharge(5));
       assertEquals(15.0, parkingCharges.calculateCharge(6));
       assertEquals(10.00, parkingCharges.calculateCharge(24));
    }
}