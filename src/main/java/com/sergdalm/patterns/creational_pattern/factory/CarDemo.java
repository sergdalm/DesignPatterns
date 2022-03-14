package main.java.com.sergdalm.patterns.creational_pattern.factory;

// Example of using pattern Factory.

public class CarDemo {
    public static void main(String[] args) {
        CarFactory carFactory = createCarByModel(Brands.SKODA);
        Car car = carFactory.createCar();

        car.drive();
    }

    static CarFactory createCarByModel(Brands model) {
        switch(model) {
            case HONDA:
                return new HondaFactory();
            case SUBARU:
                return new SubaruFactory();
            case SKODA:
                return new SkodaFactory();
            default:
                return null;
        }
    }
}
