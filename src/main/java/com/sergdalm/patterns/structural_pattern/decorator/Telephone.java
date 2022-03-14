package main.java.com.sergdalm.patterns.structural_pattern.decorator;

public class Telephone implements Phone {
    private int number;

    public Telephone(int number) {
        this.number = number;
    }

    @Override
    public void call(Phone phone) {
        System.out.println("Number " + this.getNumber() + " calling the number " + phone.getNumber() + "..");
        phone.getCall();
    }

    @Override
    public void getCall() {
        System.out.println( "Number " + this.getNumber() + " receiving a call from someone...");
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
