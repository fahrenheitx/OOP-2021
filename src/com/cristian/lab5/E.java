package com.cristian.lab5;

public class E extends D {
    protected String e;
    E(String Y) {
        super("Misa");
        e = Y;
    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}