package main.java.com.sergdalm.patterns.creational_pattern.factory;

public class SubaruFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Subaru();
    }
}
