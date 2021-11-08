package com.cristian.lab5;

public class A {
    protected String a;
    A(String z) {
        super();
        a = z;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                '}';
    }
}