package main.java.com.sergdalm.patterns.creational_pattern.factory;

public class SkodaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Skoda();
    }
}
