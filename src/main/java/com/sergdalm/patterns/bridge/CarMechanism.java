package main.java.com.sergdalm.patterns.bridge;

public interface CarMechanism {
    void drive();
    void stop();
    boolean isStaying();
    void changeTiresDirection(int direction);
    void setSpeed();
    int getSpeed();
    int getDirection();

}
