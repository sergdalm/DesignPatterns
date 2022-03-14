package main.java.com.sergdalm.patterns.creational_pattern.builder;

public class CarBuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SVVCarBuilder());
        director.buildCar(Color.RED);
        Car car = director.getCar();
        System.out.println(car);
    }
}
