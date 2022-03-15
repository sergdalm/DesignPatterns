package main.java.com.sergdalm.patterns.structural_pattern.facade;

import java.util.List;

public class ProductionMaker {
    SupplyDepartment supplyDepartment = new SupplyDepartment();
    ProductionDepartment productionDepartment = new ProductionDepartment();
    CleaningTeam cleaningTeam = new CleaningTeam();

    public Pelmeni makePelmeni(int volume) {
        supplyDepartment.purchaseRowMaterials(new Pelmeni(), volume);
//        List<RowMaterials> rowMaterials = supplyDepartment.getRowMaterials(Pelmeni, volume);
//        productionDepartment.takeRowMatereals(rowMaterials);
//        cleaningTeam.CleanEquipment(Equipment.DOUGH_MIXER, Equipment.MEAT_GRINDER, Equipment.PELMENI_SHAPER,
//                Equipment.SHOCK_FREEZER, Equipment.PACKAGING_EQUIPMENT);


        return null;
    }

    public Dumplings makeDumplings(int volume) {
        return null;
    }

    public FriedBroccoli makeFriedBroccoli(int volume) {
        return null;
    }
}
