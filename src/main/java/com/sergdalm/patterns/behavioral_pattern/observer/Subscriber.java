package main.java.com.sergdalm.patterns.behavioral_pattern.observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void getNotification(String notification) {
        System.out.println(notification);
    }

    @Override
    public String getName() {
        return name;
    }
}
