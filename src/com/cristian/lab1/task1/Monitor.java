package com.cristian.lab1.task1;

public class Monitor {
    public String model;
    public String color;
    public String dimension;
    public String resolution;

    public void Display() {
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Dimension : " + dimension);
        System.out.println("Resolution : " + resolution + "\n");
    }
}