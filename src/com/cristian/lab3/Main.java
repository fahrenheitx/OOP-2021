package com.cristian.lab3;

public class Main {
    public static void main(String[] args) {
        TextManipulation someString = new TextManipulation();
        someString.text = "Some text. Testing test test. Hey? Textttete erer erere!";
        System.out.println("Number of words : " + someString.getWords());
        System.out.println("Number of sentences : " + someString.getSentences());
        System.out.println("Number of letters : " + someString.getLetters());
        System.out.println("Number of vowels : " + someString.getVowels());
        System.out.println("Number of consonants : " + someString.getConsonants());
    }
}