package com.cristian.lab1;

import com.cristian.lab1.task1.Monitor;
import com.cristian.lab1.task2.Student;
import com.cristian.lab1.task2.University;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Task 1 ---------- \n");

        // Create 2 monitors
        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();
        
        // Update first monitor properties
        monitor1.model = "LG 27GL650F-B";
        monitor1.color = "black";
        monitor1.dimension = "27 inch";
        monitor1.resolution = "1920x1080";

        // Update second monitor properties
        monitor2.model = "Samsung LS32A600NWIXCI";
        monitor2.color = "black";
        monitor2.dimension = "32 inch";
        monitor2.resolution = "2560x1440";

        // Comparing the properties
        monitor1.Display();
        monitor2.Display();

        // System.out.println("---------- Task 2 ---------- \n");

        // Creating 3 universities
        University university_1 = new University();
        University university_2 = new University();
        University university_3 = new University();

        // Updating properties
        university_1.name = "UTM";
        university_2.name = "USM";
        university_3.name = "ULIM";

        university_1.foundationYear = 1964;
        university_2.foundationYear = 1946;
        university_3.foundationYear = 1992;

        // Adding students to universities
        university_1.student[0] = new Student("Cristian", "Ionel", 20, 9.00);
        university_1.student[1] = new Student("Steve", "Down", 20, 9.50);
        university_1.student[2] = new Student("John", "Brown", 21, 8.40);

        university_2.student[0] = new Student("Jacob", "Dolphin", 19, 9.00);
        university_2.student[1] = new Student("Andrew", "Black", 20, 9.20);
        university_2.student[2] = new Student("Snow", "White", 21, 8.50);

        university_3.student[0] = new Student("Aliosha", "Flex", 20, 6.21);
        university_3.student[1] = new Student("Xoxo", "Xoxo", 20, 9.99);
        university_3.student[2] = new Student("Incoming", "Test", 21, 8.53);

        System.out.println("---------- Task 3 ---------- \n");

        System.out.printf("Media studentilor UTM : %.2f \n", university_1.meanValue());
        System.out.printf("Media studentilor USM : %.2f \n", university_2.meanValue());
        System.out.printf("Media studentilor ULIM : %.2f \n", university_3.meanValue());
    }
}
