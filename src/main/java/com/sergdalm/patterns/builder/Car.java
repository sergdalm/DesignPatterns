package main.java.com.sergdalm.patterns.builder;

public class Car {
    private String name;
    private String model;
    private int doors;
    private int seats;
    private Engine engine;
    private double length;
    private double height;
    private Drivetrain drivetrain;
    private Color color;
    private int price;

    @Override
    public String toString() {
        return "Car " + name + " \n"+
                " model: " + model  +
                ", doors: " + doors +
                ", seats: "+ seats +
                "\n engine: " + engine +
                "\n length: " + length +
                ", height: " + height +
                ", drivetrain: " + drivetrain +
                ", color: " + color +
                "\n price: " + String.format("%,d", price) + " $";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(int door) {
        this.doors = door;
    }

    public void setSeats(int seat) {
        this.seats = seat;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDrivetrain(Drivetrain drivetrain) {
        this.drivetrain = drivetrain;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
