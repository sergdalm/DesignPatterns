package main.java.com.sergdalm.patterns.bridge;

public class SimpleControlPanel implements VehicleControlPanel {
    Vehicle vehicle;
    String vehicleType;

    public SimpleControlPanel(Vehicle vehicle) {
        this.vehicle = vehicle;
        vehicleType = vehicle.getVehicleType();
    }

    @Override
    public void pushGas() {
        if(vehicle.isStaying()) {
            System.out.println(vehicleType + " starts moving");
            vehicle.drive();
        }
        else {
            vehicle.addSpeed();
        }
        showSpeed();
    }

    @Override
    public void pushBreak() {
        vehicle.reduceSpeed();
        if(vehicle.getSpeed() == 0)
            System.out.println(vehicleType + " stopped.");
        else
            showSpeed();
    }

    @Override
    public void turnToTheLeft() {
        vehicle.changeTiresDirection(-1);
        showDirection();
    }

    @Override
    public void turnToTheRight() {
        vehicle.changeTiresDirection(+1);
        showDirection();
    }

    @Override
    public void showSpeed() {
        System.out.println(vehicleType + " is going at a speed " + vehicle.getSpeed() + " km/hr.");
    }

    @Override
    public void showDirection() {
        int direction = vehicle.getDirection();
        if(direction == 0)
            System.out.println(vehicleType + " is going straight.");
        else if(direction < 0)
            System.out.println(vehicleType + " is going to the left.");
        else System.out.println(vehicleType + " is going to the right.");
    }
}
