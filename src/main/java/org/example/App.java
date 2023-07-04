package org.example;

import org.example.decoding.Decoding;
import org.example.tests.InputTesting;

public class App {
    public static void main(String[] args) {
        String a = "55 666 222 44 2 6 0 222 444 33 2222 ";
        String b = "Kocham cie1";

     Controller controller = new Controller(b);

        System.out.println(controller.decoding());

    }
}


