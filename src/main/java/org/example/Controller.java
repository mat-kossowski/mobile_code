package org.example;

import org.example.decoding.Decoding;
import org.example.decoding.DecodingNumbers;
import org.example.decoding.DecodingWords;
import org.example.tests.InputTesting;

import java.util.regex.Pattern;


public class Controller {


    public String code;


    public Controller(String code) {
        this.code = code;
    }

    public boolean testInput() {
        InputTesting inputTesting = new InputTesting(code);
        return inputTesting.validateTheInput();

    }

    public static boolean containsOnlyDigits(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)) && input.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public String decoding() {
        if (testInput()) {

            if (containsOnlyDigits(code)) {
                DecodingNumbers decodingNumbers = new DecodingNumbers();
                return decodingNumbers.decodingFunctionNumbers(code);
            } else {
                DecodingWords decodingWords = new DecodingWords();
                return decodingWords.decodingFunctionWords(code);
            }
        }

        return "Bład";
    }
}
