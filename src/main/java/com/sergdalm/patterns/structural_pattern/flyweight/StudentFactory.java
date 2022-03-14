package main.java.com.sergdalm.patterns.structural_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class StudentFactory {
    static Map<String, UniversityAndMajor> majorMap = new HashMap<>();

    public static UniversityAndMajor getMajor(String name, String university, String major) {
        UniversityAndMajor result = majorMap.get(name);
        if(result == null) {
            result = new UniversityAndMajor(university, major);
            majorMap.put(name, result);
            System.out.println("Added new university and major: " + university + ", " + major);
        }
        return result;
    }

    public static Student addStudent(String name, String university, String major, int yearOfBirth) {
        UniversityAndMajor universityAndMajor = StudentFactory.getMajor(university.concat(major) , university, major);
        Student student = new Student(name,yearOfBirth,universityAndMajor);
        System.out.println("Added new student: " + student);
        return student;

    }

}
