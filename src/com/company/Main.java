package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame(20);
        Scanner input = new Scanner(System.in);
        guessGame.runGame(input);

    }
}
