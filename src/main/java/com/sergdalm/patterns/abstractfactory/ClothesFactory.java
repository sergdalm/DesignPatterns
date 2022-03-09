package main.java.com.sergdalm.patterns.abstractfactory;

public interface ClothesFactory {
    Shirt createShirt();
    Dress createDress();
    Skirt createSkirt();
    Pants createPants();
}
