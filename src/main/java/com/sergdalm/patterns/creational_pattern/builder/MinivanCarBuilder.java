package main.java.com.sergdalm.patterns.creational_pattern.builder;

public class MinivanCarBuilder extends CarBuilder {
    @Override
    void createCar(Color color) {
        super.createCar(color);
    }

    @Override
    void setName() {
        car.setName("Honda Odyssey");
    }

    @Override
    void setModel() {
        car.setModel("Minivan");
    }

    @Override
    void buildDoors() {
        car.setDoors(4);
    }

    @Override
    void buildSeats() {
        car.setSeats(8);
    }

    @Override
    void buildEngine() {
        car.setEngine(Engine.MINIVAN_ENGINE);
    }

    @Override
    void setLength() {
        car.setLength(202.1);
    }

    @Override
    void setHeight() {
        car.setHeight(68.8);
    }

    @Override
    void setDrivetrain() {
        car.setDrivetrain(Drivetrain.FRONT);
    }

    @Override
    Car getCar() {
        return super.getCar();
    }

    @Override
    void setPrice() {
        car.setPrice(29_905);
    }
}
