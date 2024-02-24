package com.ironhack;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        setName(name);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 100) {
            this.grade = 100;
        } else if (grade < 0) {
            this.grade = 0;
        }
        else {
            this.grade = grade;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, grade: %d", this.name, this.grade);
    }

    public static Map<String, Student> increaseGrades(Map<String, Student> students) {
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            Student student = entry.getValue();
            int newGrade = (int) (student.getGrade() * 1.10);
            student.setGrade(newGrade);
        }
        return students;
    }
}
