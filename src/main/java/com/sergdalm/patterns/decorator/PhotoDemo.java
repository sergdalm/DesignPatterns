package main.java.com.sergdalm.patterns.decorator;

public class PhotoDemo {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone(7569483);
        Telephone momPhone = new Telephone(8570384);
        SmartPhone friendPhone = new SmartPhone(9580394, "Samsung");


        myPhone.call(momPhone);
        momPhone.call(myPhone);

        myPhone.sendMassage(friendPhone, "Hi! How are you?");
        friendPhone.sendMassage(myPhone,"Hi! I'm OK thanks");

        friendPhone.takePhoto();
    }
}
