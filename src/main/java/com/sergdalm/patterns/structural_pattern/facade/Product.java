package main.java.com.sergdalm.patterns.structural_pattern.facade;

import java.util.Map;

public interface Product {
    Map<RowMaterials, Integer> getCalculation();
    void makeProduct(Map<RowMaterials, Integer> rowMaterials, int volume);
}

