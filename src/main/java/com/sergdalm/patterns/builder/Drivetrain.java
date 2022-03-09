package main.java.com.sergdalm.patterns.builder;

public enum Drivetrain {
    FRONT ("Front Wheel Drive"),
    BACK ("Back Wheel Drive"),
    ALL ("All Wheel Drive");
    private String description;

    Drivetrain(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
