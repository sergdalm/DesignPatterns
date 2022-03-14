package main.java.com.sergdalm.patterns.decorator;

public interface Phone {
    void call(Phone phone);
    void getCall();
    void setNumber(int number);
    int getNumber();
}
