package main.java.com.sergdalm.patterns.behavioral_pattern.observer;

public interface Magazine {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void publishNewNumber();
    void notifyAllSubscribers();

}
