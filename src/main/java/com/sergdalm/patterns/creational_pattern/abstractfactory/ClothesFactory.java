package main.java.com.sergdalm.patterns.creational_pattern.abstractfactory;

public interface ClothesFactory {
    Shirt createShirt();
    Dress createDress();
    Skirt createSkirt();
    Pants createPants();
}
