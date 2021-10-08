package com.cristian.lab3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TextManipulation someString = new TextManipulation();
        someString.text = "test test. test??? yes no yes test no, of course, noo no test.";
        System.out.println("Number of words : " + someString.getWords());
        System.out.println("Number of sentences : " + someString.getSentences());
        System.out.println("Number of letters : " + someString.getLetters());
        System.out.println("Number of vowels : " + someString.getVowels());
        System.out.println("Number of consonants : " + someString.getConsonants());
        System.out.println("Longest word : " + someString.getLongestWord());
    }
}