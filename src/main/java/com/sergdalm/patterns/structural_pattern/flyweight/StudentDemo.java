package main.java.com.sergdalm.patterns.structural_pattern.flyweight;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = StudentFactory.addStudent("Michle", "University of San Diego", "Economics", 1990);
        Student student2 = StudentFactory.addStudent("SeonYoung", "Seoul National University", "Gender studies", 1993);
        Student student3 = StudentFactory.addStudent("Devin", "Seoul National University", "Gender studies", 1989);
        Student student4 = StudentFactory.addStudent("ThaeYoung", "Seoul National University", "Gender studies", 1998);
        Student student5 = StudentFactory.addStudent("BeomJoo", "Seoul National University", "Gender studies", 1996);
    }
}
