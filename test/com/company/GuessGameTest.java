package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GuessGameTest {
    GuessGame guessGame;
    int correctGuess;
    @BeforeEach
    void setUp() {
        guessGame = new GuessGame(10);
        correctGuess = guessGame.getNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testConfirmGuessReturnsCorrectMessageIfUserGotGuessRight(){
        assertEquals(1, guessGame.confirmGuess(correctGuess) );
    }

    @Test
    void testConfirmGuessReturnsLowerGuessMessageIfUserGuessedALowerNumberThanActualGuess(){
        int lowerGuess = correctGuess - 1;
        assertEquals(-1, guessGame.confirmGuess(lowerGuess));
    }

    @Test
    void testConfirmGuessReturnsHigherGuessMessageIfUserGuessedAHigherNumberThanActualGuess(){
        int higherGuess = correctGuess + 1;
        assertEquals(-2, guessGame.confirmGuess(higherGuess));
    }

    @Test
    void testResetNumberResetsTheCorrectNumber(){
        guessGame.resetNumber();
        assertNotEquals(correctGuess, guessGame.getNumber());
    }

    @Test
    void testGameShouldRunWhenRunMethodCalled(){
    }
    @Test
    void testGameShouldResetWhenUserGuessesWrongFiveTimes(){
        int incorrectGuess = correctGuess + 1;
        guessGame.confirmGuess(incorrectGuess);
        guessGame.confirmGuess(incorrectGuess);
        guessGame.confirmGuess(incorrectGuess);
        guessGame.confirmGuess(incorrectGuess);
        guessGame.confirmGuess(incorrectGuess);
        System.out.println(guessGame.getNumber());
        System.out.println(guessGame.getNumberOfGuessesMadeSoFar());
        assertNotEquals(correctGuess, guessGame.getNumber());
    }
}