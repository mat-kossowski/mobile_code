package org.example.tests;

import java.util.regex.Pattern;

public class InputTesting {

    public String input;

    public InputTesting(String input) {
        this.input = input;
    }

    public static boolean containsOnlyDigits(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public boolean validateTheInput() {
        boolean containsLetters = false;
        boolean containsDigits = false;

        if (input == null || input.isEmpty()) {
            return false;
        }


        for (char c : input.toCharArray()) {

            if (!Character.isDigit(c) && !Character.isLetter(c) && c != ' ') {
                return false;
            }

            if (Character.isLetter(c)) {
                containsLetters = true;
            } else if (Character.isDigit(c)) {
                containsDigits = true;
            }


        }
        if(containsDigits && containsLetters){
            return false;
        }

        return true;
    }


}
