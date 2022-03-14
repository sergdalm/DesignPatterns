package main.java.com.sergdalm.patterns.structural_pattern.adapter;

public class Boss implements KoreanSpeakingEmployee {
    String name;

    public Boss(String name) {
        this.name = name;
    }

    @Override
    public WorkReportInKorean writeWorkReport(String text) {
        return new WorkReportInKorean(text);
    }

    @Override
    public void readWorkReport(WorkReportInKorean workReportInKorean) {
        System.out.println(name + " is reading work report: " + workReportInKorean.getText());
    }

    @Override
    public String getName() {
        return name;
    }
}
