package main.java.com.sergdalm.patterns.behavioral_pattern.chain;

import java.util.HashMap;
import java.util.Map;

public class MiddleSpecialist implements TechnicalSupportSpecialist {
    private final Map<String, String> answers = new HashMap<>();
    private final TechnicalSupportSpecialist nextSpecialist;

    public MiddleSpecialist(TechnicalSupportSpecialist nextSpecialist) {
        this.nextSpecialist = nextSpecialist;
        answers.put("Complicated technical question", "Answer to complicated technical question");
    }

    @Override
    public String getAnswer(String question) {
        if(answers.containsKey(question)) {
            System.out.println("Middle specialist answered the question");
            return answers.get(question);
        }
        System.out.println("Middle specialist can't answer this question. The call is transferred to the next specialist..");
        return nextSpecialist.getAnswer(question);
    }
}
