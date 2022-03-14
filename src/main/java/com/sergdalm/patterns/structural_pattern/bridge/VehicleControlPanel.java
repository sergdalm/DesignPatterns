package main.java.com.sergdalm.patterns.structural_pattern.bridge;

public interface VehicleControlPanel {
    void pushGas();
    void pushBreak();
    void turnToTheLeft();
    void turnToTheRight();
    void showSpeed();
    void showDirection();
}
