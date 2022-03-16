package main.java.com.sergdalm.patterns.structural_pattern.facade;

import java.util.HashMap;
import java.util.Map;

public class SupplyDepartment {
    private Map<RowMaterials, Integer> rowMaterialsStock;

    public SupplyDepartment() {
        rowMaterialsStock = new HashMap();
    }

    // Purchase row materials and put them to row materials stock.
    public void purchaseRowMaterials(Product product, int volume) {
        Map<RowMaterials, Integer> calculation = product.getCalculation();

        // Purchasing row materials...

        // Put row materials to the row materials stock.
        for(Map.Entry entry : calculation.entrySet()) {
            if(rowMaterialsStock.containsKey(entry.getKey())) {
                Integer previousValue = rowMaterialsStock.get(entry.getKey());
                Integer newValue = previousValue + (Integer)entry.getValue();
                rowMaterialsStock.put((RowMaterials) entry.getKey(),newValue);
            }
            else {
                rowMaterialsStock.put((RowMaterials) entry.getKey(),(Integer) entry.getValue());
            }
        }
    }

    public Map<RowMaterials, Integer> getRowMaterials(Product product, int volume) {
        Map<RowMaterials, Integer> productCalculation = product.getCalculation();
        Map<RowMaterials, Integer> rowMaterialsForProduct = new HashMap<>();
        for(Map.Entry entry : productCalculation.entrySet()) {
            Integer currentStockVolume = rowMaterialsStock.get(entry.getKey());
            Integer newStockVolume = currentStockVolume - (Integer)entry.getValue();
            rowMaterialsStock.put((RowMaterials) entry.getKey(), newStockVolume);
            rowMaterialsForProduct.put((RowMaterials) entry.getKey(), (Integer) entry.getValue());
        }
        return rowMaterialsForProduct;
    }



}
