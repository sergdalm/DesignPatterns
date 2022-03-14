package main.java.com.sergdalm.patterns.creational_pattern.abstractfactory;

public class ClothesChanger {

    public Clothes changeClothesToCasual(Clothes clothes) {
        return changeClothes(new CasualClothesFactory(), clothes);
    }

    public Clothes changeClothesToOffice(Clothes clothes) {
        return changeClothes(new OfficeClothesFactory(), clothes);
    }

    public Clothes changeClothesToParty(Clothes clothes) {
        return changeClothes(new PartyClothesFactory(), clothes);
    }

    public Clothes changeClothesToHome(Clothes clothes) {
        return changeClothes(new HomeClothesFactory(), clothes);
    }

    private Clothes changeClothes(ClothesFactory clothesFactory, Clothes clothes) {
        if (clothes instanceof Shirt) {
            return clothesFactory.createShirt();
        }

        if (clothes instanceof Dress) {
            return clothesFactory.createDress();
        }

        if (clothes instanceof Skirt) {
           return clothesFactory.createSkirt();
        }

        if (clothes instanceof  Pants) {
            return clothesFactory.createPants();
        }

        else {
            throw new RuntimeException("There is no such clothes as " + clothes);
        }
    }
}
