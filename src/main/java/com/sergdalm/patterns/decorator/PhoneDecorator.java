package main.java.com.sergdalm.patterns.decorator;

public class PhoneDecorator implements Phone {
    public Phone phone;

    public PhoneDecorator(int number) {
        phone = new Telephone(number);
    }

    @Override
    public void call(Phone phone) {
        phone.call(phone);
    }

    @Override
    public void getCall() {
        phone.getCall();

    }

    @Override
    public void setNumber(int number) {
        phone.setNumber(number);
    }

    @Override
    public int getNumber() {
        return phone.getNumber();
    }
}
