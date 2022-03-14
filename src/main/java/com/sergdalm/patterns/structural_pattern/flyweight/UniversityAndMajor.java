package main.java.com.sergdalm.patterns.structural_pattern.flyweight;

public class UniversityAndMajor {
    private String University;
    private String major;

    public UniversityAndMajor(String university, String major) {
        University = university;
        this.major = major;
    }

    @Override
    public String toString() {
        return " University: " + University +
                ", major: " + major + '\'' +
                '}';
    }
}
