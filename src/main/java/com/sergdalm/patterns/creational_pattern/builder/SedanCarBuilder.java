package main.java.com.sergdalm.patterns.creational_pattern.builder;

public class SedanCarBuilder extends CarBuilder {
    @Override
    void createCar(Color color) {
        super.createCar(color);
    }

    @Override
    void setName() {
        car.setName("Honda Accord");
    }

    @Override
    void setModel() {
        car.setModel("Sedan");
    }

    @Override
    void buildDoors() {
        car.setDoors(2);
    }

    @Override
    void buildSeats() {
        car.setSeats(5);
    }

    @Override
    void buildEngine() {
        car.setEngine(Engine.SEDAN_ENGINE);
    }

    @Override
    void setLength() {
        car.setLength(190.9);
    }

    @Override
    void setHeight() {
        car.setHeight(56.4);
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
        car.setPrice(24_680);
    }
}
