package main.java.com.sergdalm.patterns.structural_pattern.prototype;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot("N21", 165);

        System.out.println(robot);

        RobotFactory factory = new RobotFactory(robot);
        Robot robotClone = factory.cloneRobot();

        System.out.println(robotClone);
    }

}
