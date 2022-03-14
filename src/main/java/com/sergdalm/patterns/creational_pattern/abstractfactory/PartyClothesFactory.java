package main.java.com.sergdalm.patterns.creational_pattern.abstractfactory;

public class PartyClothesFactory implements ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new PartyShirt();
    }

    @Override
    public Dress createDress() {
        return new PartyDress();
    }

    @Override
    public Skirt createSkirt() {
        return new PartySkirt();
    }

    @Override
    public Pants createPants() {
        return new PartyPants();
    }
}
