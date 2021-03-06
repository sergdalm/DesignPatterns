package main.java.com.sergdalm.patterns.structural_pattern.prototype;

public class RobotFactory {
    Robot robot;

    public RobotFactory(Robot robot) {
        this.robot = robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    Robot cloneRobot() {
        return (Robot) robot.clone();
    }
}
