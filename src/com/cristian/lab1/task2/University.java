package com.cristian.lab1.task2;

public class University {
    public String name;
    public int foundationYear;
    public Student[] student = new Student[3];
    
    public double meanValue(){
        double sum = 0;
        for (Student student : this.student) {
            sum += student.mark;
        }
        return sum / student.length;
    }
}
