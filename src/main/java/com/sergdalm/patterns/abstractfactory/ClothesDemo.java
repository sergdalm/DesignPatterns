package main.java.com.sergdalm.patterns.abstractfactory;

public class ClothesDemo {
    public static void main(String[] args) {
        Person casey = new Person("Casey");

        ClothesFactory clothesFactory = new CasualClothesFactory();
        ClothesChanger clothesChanger = new ClothesChanger();

        Shirt shirt = clothesFactory.createShirt();
        Dress dress = clothesFactory.createDress();
        Pants pants = clothesFactory.createPants();
        Skirt skirt = clothesFactory.createSkirt();

        casey.goToWalk();
        casey.wear(pants);
        casey.wear(shirt);

        System.out.println();

        casey.goToWork();
        casey.wear(clothesChanger.changeClothesToOffice(skirt));
        casey.wear(clothesChanger.changeClothesToOffice(shirt));

        System.out.println();

        casey.goToParty();
        casey.wear(clothesChanger.changeClothesToParty(dress));

        System.out.println();

        casey.goHome();
        casey.wear(clothesChanger.changeClothesToHome(pants));
        casey.wear(clothesChanger.changeClothesToHome(shirt));

    }
}
