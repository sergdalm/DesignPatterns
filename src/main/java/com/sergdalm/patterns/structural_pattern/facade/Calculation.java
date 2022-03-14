package main.java.com.sergdalm.patterns.structural_pattern.facade;

import java.util.Map;

public abstract class Calculation {
    abstract Map<RowMaterials, Integer> getCalculation();
}
