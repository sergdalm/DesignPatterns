package main.java.com.sergdalm.patterns.behavioral_pattern.chain;

import java.util.HashMap;
import java.util.Map;

public class JuniorSpecialist implements TechnicalSupportSpecialist {
    private final Map<String, String> answers = new HashMap<>();
    private final TechnicalSupportSpecialist nextSpecialist;

    public JuniorSpecialist(TechnicalSupportSpecialist nextSpecialist) {
        this.nextSpecialist = nextSpecialist;
        answers.put("Simple technical question", "Answer to simple technical question");
    }

    @Override
    public String getAnswer(String question) {
        if(answers.containsKey(question)) {
            System.out.println("Junior specialist answered the question");
            return answers.get(question);
        }
        System.out.println("Junior specialist can't answer this question. The call is transferred to the next specialist..");
        return nextSpecialist.getAnswer(question);
    }
}

