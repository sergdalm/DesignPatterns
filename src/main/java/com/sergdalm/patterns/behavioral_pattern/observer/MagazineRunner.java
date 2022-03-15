package main.java.com.sergdalm.patterns.behavioral_pattern.observer;

public class MagazineRunner {
    public static void main(String[] args) {
        Magazine newYourTimes = new NewYorkTimes();

        Observer subscriber1 = new Subscriber("Vladimir");
        Observer subscriber2 = new Subscriber("Alex");
        Observer subscriber3 = new Subscriber("Eugenue");

        newYourTimes.addSubscriber(subscriber1);
        newYourTimes.addSubscriber(subscriber2);
        newYourTimes.addSubscriber(subscriber3);

        newYourTimes.publishNewNumber();
    }
}
