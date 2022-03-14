package main.java.com.sergdalm.patterns.structural_pattern.composite;

public class Item implements Order {
    private int price;
    private String name;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
