package org.example;

public class InputTesting {

    public boolean validateTheInput(String input) {

        if (input == null || input.isEmpty()) {
            return false;
        }

        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c) && c != ' ') {
                return false;
            }
        }

        return true;
    }
}
