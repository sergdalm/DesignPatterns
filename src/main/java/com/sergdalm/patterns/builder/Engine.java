package main.java.com.sergdalm.patterns.builder;

public enum Engine {
    SVV_ENGINE(141.0, 1.8, 4),
    SEDAN_ENGINE(190.0, 2.4, 4),
    MINIVAN_ENGINE(244, 3.5, 6);

    private double hp;
    private double liters;
    private int cylinder;

    Engine(double hp, double liters, int cylinder) {
        this.hp = hp;
        this.liters = liters;
        this.cylinder = cylinder;
    }

    public String toString() {
        return hp+"-hp, " + liters + "-liter, "
                + cylinder + " Cylinder Engine(Gasoline Fuel)";
    }

}
