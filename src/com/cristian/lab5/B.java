package com.cristian.lab5;

public class B extends A{
    protected String b;
    B(String x) {
        super("Misaaa");
        b = x;
    }

    @Override
    public String toString() {
        return "B{" +
                "a='" + a + '\'' +
                "b='" + b + '\'' +

                '}';
    }
}
