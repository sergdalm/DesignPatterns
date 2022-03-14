package main.java.com.sergdalm.patterns.structural_pattern.flyweight;

public class Student {
    private String firstName;
    private int id;
    private static int idCount;
    private int yearOfBirth;
    private UniversityAndMajor universityAndMajor;

    public Student(String firstName, int yearOfBirth, UniversityAndMajor universityAndMajor) {
        this.firstName = firstName;
        this.id = idCount++;
        this.yearOfBirth = yearOfBirth;
        this.universityAndMajor = universityAndMajor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName: " + firstName +
                ", id: " + id +
                ", yearOfBirth: " + yearOfBirth +
                universityAndMajor +
                '}';
    }
}
