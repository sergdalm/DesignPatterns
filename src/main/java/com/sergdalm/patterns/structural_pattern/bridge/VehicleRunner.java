package main.java.com.sergdalm.patterns.structural_pattern.bridge;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle car = new Car();
        VehicleControlPanel controlPanel = new SimpleControlPanel(car);
        controlPanel.pushGas();
        controlPanel.pushGas();
        controlPanel.turnToTheLeft();
        controlPanel.pushBreak();
        controlPanel.turnToTheRight();
        controlPanel.pushBreak();
    }
}
