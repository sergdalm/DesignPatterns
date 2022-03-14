package main.java.com.sergdalm.patterns.bridge;

public interface Vehicle {
    void drive();
    void addSpeed();
    void reduceSpeed();
    void stop();
    boolean isStaying();
    void changeTiresDirection(int direction);
    void setSpeed(int speed);
    int getSpeed();
    int getDirection();
    String getVehicleType();
}
