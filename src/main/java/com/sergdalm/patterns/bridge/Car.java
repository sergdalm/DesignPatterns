package main.java.com.sergdalm.patterns.bridge;

public class Car implements Vehicle {
    private final String TYPE = "Car";
    private int speed;
    private boolean isStaying;
    private final int SPEED_INCREASING = 5;
    private final int SPEEP_DECREASING = 5;
    private final int MAX_SPEED = 200;
    private int direction;

    public Car() {
        speed = 0;
        isStaying = false;
    }

    @Override
    public void drive() {
        if(speed == 0)
        isStaying = false;
        this.speed += SPEED_INCREASING;
    }


    @Override
    public void stop() {
        this.speed = 0;
        isStaying = true;
    }

    @Override
    public boolean isStaying() {
        return isStaying;
    }

    // If direction is more than 0 - car goes to the right
    // If direction is less than 0 - car goes to the left
    @Override
    public void changeTiresDirection(int direction) {
        this.direction += direction;
    }

    @Override
    public void setSpeed(int speed) {
        if(speed > 200)
            this.speed = 200;
        else if(speed < 0)
            this.speed = 0;
        else
            this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getDirection() {
        return direction;
    }

    @Override
    public String getVehicleType() {
        return TYPE;
    }

    @Override
    public void addSpeed() {
        if(speed + SPEED_INCREASING == MAX_SPEED)
            speed = 200;
        else
            speed += SPEED_INCREASING;
    }

    @Override
    public void reduceSpeed() {
        if(speed - SPEEP_DECREASING <= 0)
            this.stop();
        else {
            speed -= SPEEP_DECREASING;
        }
    }
}
