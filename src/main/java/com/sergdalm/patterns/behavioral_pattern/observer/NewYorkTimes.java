package main.java.com.sergdalm.patterns.behavioral_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NewYorkTimes implements Magazine {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void publishNewNumber() {
        System.out.println("New umber of NewYourTimes is published.\n");
        notifyAllSubscribers();
    }

    @Override
    public void notifyAllSubscribers() {
        for(Observer observer: subscribers) {
            String notification = "Dear " + observer.getName() + ",\n"
                    + " new number of NewYorkTimes has been published!\n";
            observer.getNotification(notification);
        }
    }
}
