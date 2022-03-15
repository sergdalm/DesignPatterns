package main.java.com.sergdalm.patterns.structural_pattern.facade;

public enum Equipment {
    DUMPLING_SHAPER(false),
    PELMENI_SHAPER(false),
    SHOCK_FREEZER(false),
    PACKAGING_EQUIPMENT(false),
    DOUGH_MIXER(false),
    VEGETABLE_WASHER(false),
    MEAT_GRINDER(false);

    private boolean isClean;

    Equipment(boolean isClean) {
        this.isClean = isClean;
    }

    public void clean() {
        this.isClean = true;
    }

    public void useEquipment() {
        this.isClean = false;
    }

}
