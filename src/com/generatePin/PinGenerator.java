package com.generatePin;

import java.security.SecureRandom;

public class PinGenerator {

    private SecureRandom random = new SecureRandom();
    private int numberToSaltPinWith;
    private int pinLength;
    long unsaltedPin;
    long saltedPin;

    public PinGenerator(int pinLength) {
        this.pinLength = pinLength;
        numberToSaltPinWith = random.nextInt(7);
        numberToSaltPinWith += 2;
    }


    public long generateUnsaltedPin() {
        long[] pinDigitArray = new long[pinLength];
        StringBuilder stringRepresentationOfUnsaltedPin = new StringBuilder(pinLength);
        for (int pinDigit = 0; pinDigit <= pinLength - 1; pinDigit++) {
            pinDigitArray[pinDigit] = random.nextInt(8) + 1;
            stringRepresentationOfUnsaltedPin.append(pinDigitArray[pinDigit]);
        }
        long newPin = Long.parseLong(stringRepresentationOfUnsaltedPin.toString());
        unsaltedPin = newPin;
        return newPin;
    }

    public long encryptPin(long pin) {
       // System.out.println("Pin is " + pin);
        StringBuilder stringRepresentationOfSaltedPin = new StringBuilder();
        String stringValueOfPin = String.valueOf(pin);
       // System.out.println("String value of pin is " + stringValueOfPin);

        for (int i = 0; i < stringValueOfPin.length(); i++) {
            // System.out.println(stringValueOfPin.charAt(i) + " multiplied by " + numberToSaltPinWith + " = " + (Integer.parseInt(String.valueOf(stringValueOfPin.charAt(i)))* numberToSaltPinWith) );
            //System.out.println(stringRepresentationOfSaltedPin.toString());
            stringRepresentationOfSaltedPin.append(Integer.parseInt(String.valueOf(stringValueOfPin.charAt(i))) * numberToSaltPinWith);

        }
//        System.out.println(stringRepresentationOfSaltedPin.toString());
        long newSaltedPin = Long.parseLong(stringRepresentationOfSaltedPin.toString());
        //       System.out.println(newSaltedPin);
        saltedPin = newSaltedPin;
        return newSaltedPin;
    }

    public int getSalt() {
        return numberToSaltPinWith;
    }


}

