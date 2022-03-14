package main.java.com.sergdalm.patterns.decorator;

public class SmartPhone extends MobilePhone {
    private String smartphoneName;

    public SmartPhone(int number, String smartphoneName) {
        super(number);
        this.smartphoneName = smartphoneName;
    }

    public void takePhoto() {
        System.out.println("Smartphone " + smartphoneName + " is taking a photo..");
    }

    public String getSmartphoneName() {
        return smartphoneName;
    }

    public void setSmartphoneName(String smartphoneName) {
        this.smartphoneName = smartphoneName;
    }
}
