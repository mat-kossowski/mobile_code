package org.example;

public class App {
    public static void main(String[] args) {
        String a = "55 666 222 44 2 6 0 222 444 33 ";
        String b = "Kocham cie";
        InputTesting test = new InputTesting(a);
        Decoding decoding = new Decoding();
        System.out.println(decoding.decodingFunctionNumbers(a));
        System.out.println(decoding.decodingFunctionWords(b));
        System.out.println(test.validateTheInput());


    }
}

