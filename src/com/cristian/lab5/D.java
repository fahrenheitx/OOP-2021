package com.cristian.lab5;

public class D extends C{
    protected String d;
    D(String z) {
        super("Ion");
        d = z;
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}
