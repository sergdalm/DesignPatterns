package main.java.com.sergdalm.patterns.structural_pattern.adapter;

public interface RussianSpeakingEmployee {
    WorkReportInRussian writeWorkReport(String text);
    void readWorkReport(WorkReportInRussian workReportInRussian);
    String getName();
}
