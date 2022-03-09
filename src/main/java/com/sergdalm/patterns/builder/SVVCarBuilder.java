package main.java.com.sergdalm.patterns.builder;

public class SVVCarBuilder extends CarBuilder {
    @Override
    void createCar(Color color) {
        super.createCar(color);
    }

    @Override
    void setName() {
        car.setName("Honda HR-V");
    }

    @Override
    void setModel() {
        car.setModel("SVV");
    }

    @Override
    void buildDoors() {
        car.setDoors(4);
    }

    @Override
    void buildSeats() {
        car.setSeats(5);
    }

    @Override
    void buildEngine() {
        car.setEngine(Engine.SVV_ENGINE);
    }

    @Override
    void setLength() {
        car.setLength(169.1);
    }

    @Override
    void setHeight() {
        car.setHeight(63.2);
    }

    @Override
    void setDrivetrain() {
        car.setDrivetrain(Drivetrain.ALL);
    }

    @Override
    Car getCar() {
        return super.getCar();
    }

    @Override
    void setPrice() {
        car.setPrice(21_315);
    }
}
