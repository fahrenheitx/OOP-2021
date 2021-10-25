package com.cristian.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner( new File("D:\\Anul 2 FAF\\POO\\oop-labs\\src\\com\\cristian\\lab4\\one_expression.txt"));
        VerifyExpression someString = new VerifyExpression();
        someString.text = scanner.useDelimiter("\\A").next();
        System.out.println(someString.checkBalancedParenthesis());
    }
}
