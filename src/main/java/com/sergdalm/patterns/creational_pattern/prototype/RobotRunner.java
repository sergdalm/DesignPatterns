package main.java.com.sergdalm.patterns.creational_pattern.prototype;

public class RobotRunner {
    public static void main(String[] args) throws InterruptedException {
        Robot robot1 = new Robot("K1");
        Thread.sleep(2000);
        Robot robot2 = new Robot("T2");


        System.out.println("Robot 1: " + robot1);
        System.out.println("Robot 2: " + robot2);
        System.out.print("\n");

        System.out.println("Cloning Robot 1 into Robot 3\n");
        Robot robot3 = robot1.clone();
        Thread.sleep(2000);

        System.out.println("Changing Robot 1's name");
        robot1.changeName("K55");
        System.out.print("\n");

        System.out.println("Robot 1: " + robot1);
        System.out.println("Robot 2: " + robot2);
        System.out.println("Robot 3: " + robot3);


    }
}
