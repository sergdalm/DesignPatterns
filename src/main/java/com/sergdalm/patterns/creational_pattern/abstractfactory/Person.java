package main.java.com.sergdalm.patterns.creational_pattern.abstractfactory;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    void wear(Clothes clothes) {
        System.out.print(name + ": ");
        clothes.wear();
    }

    void goToWalk() {
        System.out.println(name + " goes to walk.");
    }

    void goToWork() {
        System.out.println(name + " goes to work.");
    }

    void goToParty() {
        System.out.println(name + " goes to party.");
    }

    void goHome() {
        System.out.println(name + " goes home.");
    }
}
