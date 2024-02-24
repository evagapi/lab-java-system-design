package com.ironhack;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main( String[] args ) {
        Map<String, Student> students = new HashMap<>();
        Student student1 = new Student("Ada Lovelace", 90);
        Student student2 = new Student("Hedy Lamarr", 100);
        Student student3 = new Student("Brandon Sanderson", 60);
        Student student4 = new Student("Tomy", 10);

        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);
        students.put(student4.getName(), student4);

        Map<String, Student> updatedStudents = Student.increaseGrades(students);

        for (Map.Entry<String, Student> entry : updatedStudents.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}