package com.cristian.lab3;

public class Main {
    public static void main(String[] args) {
        TextManipulation someString = new TextManipulation();
        someString.text = "Some text. Testing test test. Hey? Textttete erer erere!";
        System.out.println(someString.getWords());
        System.out.println(someString.getSentences());
    }
}