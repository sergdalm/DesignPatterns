package main.java.com.sergdalm.patterns.factory;

public class SubaruFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Subaru();
    }
}
