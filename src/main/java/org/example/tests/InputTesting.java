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
        if (input == null || input.isEmpty()) {
            return false;
        }

        if (containsOnlyDigits(input)) {
            for (char c : input.toCharArray()) {
                if (c == '1' || !Character.isDigit(c) && c != ' ') {
                    return false;
                }
            }
        }


        return true;
    }


}
