package main.java.com.sergdalm.patterns.behavioral_pattern.chain;

public class TechnicalSupportDemo {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        TechnicalSupportSpecialist technicalSupportSpecialist = new Robot(new JuniorSpecialist(new MiddleSpecialist(new TeamLead(null))));
        System.out.println("User 1 asking a question");
        user1.askQuestion(technicalSupportSpecialist, "Prices");

        System.out.println("\nUser 2 asking a question");
        user2.askQuestion(technicalSupportSpecialist, "Simple technical question");

        System.out.println("\nUser 3 asking a question");
        user3.askQuestion(technicalSupportSpecialist, "Very difficult technical question");

    }
}
