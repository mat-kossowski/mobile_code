package org.example;

public class App {
    public static void main(String[] args) {
        String a = "6 2 8 33 88 7777 9999 0 55 666 7777 7777 666 9 7777 55 444";
        String b = "kocham cie";
        InputTesting test = new InputTesting(a);
        Decoding decoding = new Decoding();
        System.out.println(decoding.decodingFunctionNumbers(a));
        System.out.println(decoding.decodingFunctionWords(b));
        System.out.println(test.validateTheInput());


    }
}

