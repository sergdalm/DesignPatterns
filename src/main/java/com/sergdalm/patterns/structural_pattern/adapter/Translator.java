package main.java.com.sergdalm.patterns.structural_pattern.adapter;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Translator implements RussianSpeakingEmployee {
    String name;
    KoreanSpeakingEmployee koreanSpeakingEmployee;
    WorkReportInRussian workReportInRussian;

    Map<String, String> RusKorDic = new HashMap<>();

    public Translator(String name, KoreanSpeakingEmployee koreanSpeakingEmployee) {
        this.name = name;
        this.koreanSpeakingEmployee = koreanSpeakingEmployee;
        RusKorDic.put("Здравствуйте", "안녕하세요");
        RusKorDic.put("Всё идёт в рабочем порядке", "업무가 정상적으로 진행 중입니다");
        RusKorDic.put("Никаких проблем нет", "아무 문제가 없습니다");
    }

    @Override
    public WorkReportInRussian writeWorkReport(String text) {
        return null;
    }

    @Override
    public void readWorkReport(WorkReportInRussian workReportInRussian) {
        this.workReportInRussian = workReportInRussian;
        koreanSpeakingEmployee.readWorkReport(translateFromRussianToKorean());
    }



    private WorkReportInKorean translateFromRussianToKorean() {
        System.out.println(name + " is translating from Korean to Russian..");
        String[] russianText = workReportInRussian.getText().split(Pattern.quote(". "));
        String result = "";
        for(int i = 0; i < russianText.length; i++) {
            result = String.join(". ", result,  RusKorDic.get(russianText[i]));
        }
        System.out.println(name + " is sending translated report to " + koreanSpeakingEmployee.getName());
        return new WorkReportInKorean(result);
    }

    @Override
    public String getName() {
        return name;
    }
}
