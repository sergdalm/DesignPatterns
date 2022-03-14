package main.java.com.sergdalm.patterns.factory;

public class HondaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Honda();
    }
}
