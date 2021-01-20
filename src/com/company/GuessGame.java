package com.company;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessGame {
    private SecureRandom randomNumber = new SecureRandom();
    private int number;
    private int numberOfWrongGuessesMadeSoFar;

    public GuessGame(int maxNumber) {
        number = 1 + randomNumber.nextInt(maxNumber);
    }


    public int getNumber() {
        return number;
    }

    public int confirmGuess(int numberGuessedByUser) {
        if (number == numberGuessedByUser) {
            System.out.println("Congratulations you guessed the number");
            return 1;
        } else if (number > numberGuessedByUser) {
            System.out.println("Aww too low, try again");
            numberOfWrongGuessesMadeSoFar++;
            resetGameIfOverFiveWrongGuesses();
            return -1;
        } else {
            System.out.println("That number was too large, try again");
            numberOfWrongGuessesMadeSoFar++;
            resetGameIfOverFiveWrongGuesses();
            return -2;
        }
    }

    public void resetNumber() {
        number = 1 + randomNumber.nextInt(11);
    }

    public int getNumberOfGuessesMadeSoFar() {
        return numberOfWrongGuessesMadeSoFar;
    }

    public void resetGameIfOverFiveWrongGuesses() {
        if (numberOfWrongGuessesMadeSoFar == 5) {
            System.out.println("Looks like You've guessed wrong 5 consecutive times");
            System.out.println("Resetting values and starting game again");
            resetNumber();
            this.numberOfWrongGuessesMadeSoFar = 0;
        }
    }

    public void runGame(Scanner input) {
        System.out.println("Welcome to the random number guessing game");
        int sentinel = 1;
        while (sentinel != -1) {
            try {
                System.out.println("Guess a new number");
                int userInput = input.nextInt();
                int result = confirmGuess(userInput);
                switch (result) {
                    case 1: {
                        System.out.println("Do you want to play again, Enter 1 for yes 2 for no");
                        userInput = input.nextInt();
                        if (userInput == 1) {
                            resetNumber();
                            break;
                        } else if (userInput == 2) {
                            sentinel = -1;
                            break;
                        } else {
                            throw new InputMismatchException();
                        }
                    }
                    case -1:
                    case -2: {
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Only numbers allowed as input");
                sentinel = -1;
            }

        }
    }
}
