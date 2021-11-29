package com.cristian.lab8;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricBody> geometricBodies = new ArrayList<>();

        geometricBodies.add(new Cube(51.233));
        geometricBodies.add(new Parallelepiped(1, 23.1, 23));
        geometricBodies.add(new Sphere(2));

        System.out.println(GeometricBodyController.getFigureWithBiggestSurface(geometricBodies));
        System.out.println(GeometricBodyController.getFigureWithBiggestVolume(geometricBodies));
        System.out.println();

        GeometricBody someCube = new GeometricBody() {
            double edge = 14;

            @Override
            public double getSurface() {
                return 6 * edge * edge;
            }

            @Override
            public double getVolume() {
                return edge * edge * edge;
            }

            @Override
            public String toString() {
                return new StringJoiner(", ", "someCube [", "]")
                        .add("edge=" + edge)
                        .add("surface=" + getSurface())
                        .add("volume=" + getVolume())
                        .toString();
            }
        };

        System.out.println("Surface of the GeometricBody instance = " + someCube.getSurface());
        System.out.println("Volume of the GeometricBody instance = " + someCube.getVolume());

        geometricBodies.add(someCube);

        System.out.println(GeometricBodyController.getFigureWithBiggestSurface(geometricBodies));
        System.out.println(GeometricBodyController.getFigureWithBiggestVolume(geometricBodies));

        System.out.println();
        for(GeometricBody fig: geometricBodies)
            System.out.println(fig);
    }
}