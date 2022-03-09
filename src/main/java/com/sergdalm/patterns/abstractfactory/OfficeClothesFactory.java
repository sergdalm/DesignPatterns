package main.java.com.sergdalm.patterns.abstractfactory;

public class OfficeClothesFactory implements ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new OfficeShirt();
    }

    @Override
    public Dress createDress() {
        return new OfficeDress();
    }

    @Override
    public Skirt createSkirt() {
        return new OfficeSkirt();
    }

    @Override
    public Pants createPants() {
        return new OfficePants();
    }
}
