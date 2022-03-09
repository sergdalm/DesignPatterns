package main.java.com.sergdalm.patterns.prototype;

public class Robot implements Prototype {
    private int id;
    private static int idCount = 0;
    private String name;
    private int height;

    public Robot(String name, int height) {
        this.id = idCount++;
        this.name = name;
        this.height = height;
    }

    private Robot(Robot robot) {
        this.name = robot.name;
        this.height = robot.height;
        this.id = robot.id;
    }

    @Override
    public Object clone() {
        return new Robot(this);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
