package com.company;

public class SquareOfCharacters {
    public static void display(int number, char character) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
