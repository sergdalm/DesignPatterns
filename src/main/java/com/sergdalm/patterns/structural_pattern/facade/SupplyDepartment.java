package main.java.com.sergdalm.patterns.structural_pattern.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SupplyDepartment {
    List<RowMaterials> rowMaterials;

    public SupplyDepartment() {
        rowMaterials = new ArrayList<>();
    }

    void purchaseRowMaterials(Product product, int volume) {
        Map<RowMaterials, Integer> calculation = product.getCalculation();
    }
}
