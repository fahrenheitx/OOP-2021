package com.cristian.lab8;

import java.util.StringJoiner;

public class Sphere implements GeometricBody {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurface() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return getSurface() * radius / 3;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Sphere.class.getSimpleName() + "[", "]")
                .add("radius=" + radius)
                .add("surface=" + getSurface())
                .add("volume=" + getVolume())
                .toString();
    }
}