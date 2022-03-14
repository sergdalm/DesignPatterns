package main.java.com.sergdalm.patterns.structural_pattern.adapter;

public interface KoreanSpeakingEmployee {
    WorkReportInKorean writeWorkReport(String text);
    void readWorkReport(WorkReportInKorean workReportInKorean);
    String getName();
}
