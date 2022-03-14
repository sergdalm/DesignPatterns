package main.java.com.sergdalm.patterns.behavioral_pattern.chain;

public class User {
    private int id;
    private static int idCount;

    public User() {
        this.id = idCount++;
    }

    public void askQuestion(TechnicalSupportSpecialist specialist, String question) {
        specialist.getAnswer(question);
    }
}
