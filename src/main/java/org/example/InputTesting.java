package org.example;

public class InputTesting {

     private String input;

    public InputTesting(String input) {
        this.input = input;
    }

    public boolean validateTheInput() {
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
