package com.learning.project1;

import com.learning.day5.ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private ArrayList<Integer> marks;

    public Student(String name, ArrayList<Integer> marks) {
        this.name = name;

        for (int i = 0; i < marks.size(); i++) {
            if (!(marks.get(i) >= 0 && marks.get(i) <= 100)) {
                throw new InvalidMarkException("Invalid mark at index " + i + ": " + marks.get(i));
            }
        }

        this.marks = new ArrayList<>(marks);
    }

    public float calculateAverage() {
        int sum = 0;

        for (int mark: this.marks) {
            sum += mark;
        }

        return (float) sum / this.marks.size();
    }

    public String calculateGrade() {
        float avg = calculateAverage();
        int category = (int) avg / 10;

        switch (category) {
            case 10:
            case 9:
                return "A";
            case 8:
            case 7:
                return "B";
            case 6:
                return "C";
            default:
                return "F";
        }
    }

    public void printReport() {
        float avg = calculateAverage();
        String grade = calculateGrade();

        System.out.println("Student Report");
        System.out.println("--------------");
        System.out.println("Name: " + name);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
