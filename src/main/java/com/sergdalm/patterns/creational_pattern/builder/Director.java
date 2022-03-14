package main.java.com.sergdalm.patterns.creational_pattern.builder;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public void buildCar(Color color) {
        builder.createCar(color);
        builder.setName();
        builder.buildDoors();
        builder.buildEngine();
        builder.buildSeats();
        builder.setLength();
        builder.setHeight();
        builder.setDrivetrain();
        builder.setModel();
        builder.setPrice();
    }

    public Car getCar() {
        return builder.getCar();
    }


}
