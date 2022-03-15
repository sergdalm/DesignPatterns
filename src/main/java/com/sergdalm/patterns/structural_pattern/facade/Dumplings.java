package main.java.com.sergdalm.patterns.structural_pattern.facade;

import java.util.HashMap;
import java.util.Map;

public class Dumplings implements Product {
    private final String productName = "Dumplings";
    private final Map<RowMaterials, Integer> calculation;
    private int volume;


    //, DUMPLINGS, FRIED_BROCCOLI;
    private Dumplings() {
        calculation = new HashMap<>();
        calculation.put(RowMaterials.PORK, 30);
        calculation.put(RowMaterials.ONION, 10);
        calculation.put(RowMaterials.FLOUR, 200);
        calculation.put(RowMaterials.SPICES, 50);
        calculation.put(RowMaterials.PACKAGES, 10);
        volume = 0;
    }

    @Override
    public Map<RowMaterials, Integer> getCalculation() {
        return calculation;
    }

    @Override
    public void makeProduct(Map<RowMaterials, Integer> rowMaterials, int volume) {
        for (Map.Entry material : rowMaterials.entrySet()) {
            if(this.calculation.containsKey(material.getKey())) {
                Integer calculationValue = this.calculation.get(material.getKey());
                Integer value = (Integer) material.getValue();
                Integer newValue = value - calculationValue;
                if(newValue < 0) {
                    throw new RuntimeException("Row materials are not enough to make a " +
                            value + " kg of " + this.productName);
                }
                material.setValue(newValue);
            }
        }
        this.volume = volume;
    }

    @Override
    public String toString() {
        return productName + " : " + volume + " kg";
    }
}
