package main.java.com.sergdalm.patterns.creational_pattern.abstractfactory;

public class CasualClothesFactory implements ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new CasualShirt();
    }

    @Override
    public Dress createDress() {
        return new CasualDress();
    }

    @Override
    public Skirt createSkirt() {
        return new CasualSkirt();
    }

    @Override
    public Pants createPants() {
        return new CasualPants();
    }
}
