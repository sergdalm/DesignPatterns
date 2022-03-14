package main.java.com.sergdalm.patterns.creational_pattern.abstractfactory;

public class HomeClothesFactory implements ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new HomeShirt();
    }

    @Override
    public Dress createDress() {
        return new HomeDress();
    }

    @Override
    public Skirt createSkirt() {
        return new HomeSkirt();
    }

    @Override
    public Pants createPants() {
        return new HomePants();
    }
}
