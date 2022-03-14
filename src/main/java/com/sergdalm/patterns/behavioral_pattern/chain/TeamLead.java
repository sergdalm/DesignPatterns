package main.java.com.sergdalm.patterns.behavioral_pattern.chain;

import java.util.HashMap;
import java.util.Map;

public class TeamLead implements TechnicalSupportSpecialist {
    private final Map<String, String> answers = new HashMap<>();
    private final TechnicalSupportSpecialist nextSpecialist;

    public TeamLead(TechnicalSupportSpecialist nextSpecialist) {
        this.nextSpecialist = nextSpecialist;
        answers.put("Very difficult technical question", "Answer to a very difficult technical question");
    }

    @Override
    public String getAnswer(String question) {
        if(answers.containsKey(question)) {
            System.out.println("TeamLead answered the question");
            return answers.get(question);
        }
        System.out.println("Even team lead can't answer this question.");
        return null;
    }
}
