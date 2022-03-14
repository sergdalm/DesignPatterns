package main.java.com.sergdalm.patterns.factory;

public class SkodaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Skoda();
    }
}
