package main.java.com.sergdalm.patterns.creational_pattern.factory;

public class HondaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Honda();
    }
}
