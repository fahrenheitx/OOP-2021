package com.cristian.lab5;

public class I extends H {
    protected String i;
    I(String X) {
        super("Oleg");
        i = X;
    }

    @Override
    public String toString() {
        return "I{" +
                "g='" + g + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}
