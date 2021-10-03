package com.cristian.lab2;

public class Box {
    double height;
    double width;
    double depth;

    public Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    public Box(double value) {
        this.height = value;
        this.width = value;
        this.depth = value;
    }

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double volume() {
        return this.depth * this.height * this.width;
    }

    public double surface() {
        double a = 2 * this.width * this.height;
        double b = 2 * this.width * this.depth;
        double c = 2 * this.height * this.depth;

        return a + b + c;
    }
}

class TestBox {
    public static void main(String[] args) {
        Box firstBox = new Box(5, 6, 7);
        System.out.println("Box volume = " + firstBox.volume());
        System.out.println("Box surface = " + firstBox.surface());
    }
}
