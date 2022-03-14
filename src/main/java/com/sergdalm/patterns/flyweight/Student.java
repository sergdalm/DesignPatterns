package main.java.com.sergdalm.patterns.flyweight;

public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private int idCount;
    private int dateOfBirth;
    private UniversityAndMajor universityAndMajor;

    public Student(String firstName, String lastName, int dateOfBirth, UniversityAndMajor universityAndMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = idCount++;
        this.dateOfBirth = dateOfBirth;
        this.universityAndMajor = universityAndMajor;
    }
}
