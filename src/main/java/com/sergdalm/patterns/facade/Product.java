package main.java.com.sergdalm.patterns.facade;

import java.util.Map;

public interface Product {
    abstract Map<RowMaterials, Integer> getCalculation();
    Product makeProduct(Map<RowMaterials, Integer> rowMaterials, int volume);
}

