package main.java.com.sergdalm.patterns.structural_pattern.adapter;

public class WorkReportInRussian {
    private final String text;

    public WorkReportInRussian(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
