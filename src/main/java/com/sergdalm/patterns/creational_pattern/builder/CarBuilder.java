package main.java.com.sergdalm.patterns.creational_pattern.builder;

public abstract class CarBuilder {
    Car car;

    void createCar(Color color) {
        car = new Car();
        car.setColor(color);
    }

    abstract void setModel();
    abstract void setName();
    abstract void buildDoors();
    abstract void buildSeats();
    abstract void buildEngine();
    abstract void setLength();
    abstract void setHeight();
    abstract void setDrivetrain();
    abstract void setPrice();

    Car getCar() {
        return car;
    }
}
