package main.java.com.sergdalm.patterns.decorator;

public class MobilePhone extends PhoneDecorator {

    public MobilePhone(int number) {
        super(number);
    }

    public void sendMassage(MobilePhone mobilePhone, String text) {
        System.out.println("Number " + this.getNumber() +
                " sending a massage \"" + text + "\" to number " +
                mobilePhone.getNumber());
        mobilePhone.getMessage(this, text);
    }

    @Override
    public void getCall() {
        super.getCall();
    }

    public void getMessage(MobilePhone mobilePhone, String text) {
        System.out.println("Number " + this.getNumber() +
                " got a message from number " + mobilePhone.getNumber() +
                ": " + text);
    }
}
