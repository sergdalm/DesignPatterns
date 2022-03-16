package main.java.com.sergdalm.patterns.structural_pattern.facade;

import java.util.List;
import java.util.Map;

public class ProductionMaker {
    SupplyDepartment supplyDepartment = new SupplyDepartment();
    ProductionDepartment productionDepartment = new ProductionDepartment();
    CleaningTeam cleaningTeam = new CleaningTeam();

    public Pelmeni makePelmeni(int volume) {
        Pelmeni pelmeni = new Pelmeni();
        supplyDepartment.purchaseRowMaterials(pelmeni, volume);
        Map<RowMaterials, Integer> rowMaterials = supplyDepartment.getRowMaterials(pelmeni, volume);
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
