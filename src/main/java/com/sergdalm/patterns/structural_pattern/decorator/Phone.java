package main.java.com.sergdalm.patterns.structural_pattern.decorator;

public interface Phone {
    void call(Phone phone);
    void getCall();
    void setNumber(int number);
    int getNumber();
}
