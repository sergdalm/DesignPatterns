package main.java.com.sergdalm.patterns.behavioral_pattern.chain;

import java.util.HashMap;
import java.util.Map;

public class Robot implements TechnicalSupportSpecialist {
    private final Map<String, String> answers = new HashMap<>();
    private final TechnicalSupportSpecialist nextSpecialist;

    Robot(TechnicalSupportSpecialist nextSpecialist) {
        answers.put("Working hours", "08:00~18:00");
        answers.put("Prices", "Products prices: ... ");
        answers.put("Location", "Location of our store: ...");
        this.nextSpecialist = nextSpecialist;
    }


    @Override
    public String getAnswer(String question) {
        if(answers.containsKey(question)) {
            System.out.println("Robot answered the question");
            return answers.get(question);
        }
        System.out.println("Robot can't answer this question. The call is transferred to the next specialist..");
        return nextSpecialist.getAnswer(question);
    }
}

