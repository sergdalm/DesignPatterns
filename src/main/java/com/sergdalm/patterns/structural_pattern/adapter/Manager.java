package main.java.com.sergdalm.patterns.structural_pattern.adapter;

public class Manager implements RussianSpeakingEmployee{
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public WorkReportInRussian writeWorkReport(String text) {
        return new WorkReportInRussian(text);
    }

    @Override
    public void readWorkReport(WorkReportInRussian workReportInRussian) {
        System.out.println(name + " is reading report: " + workReportInRussian.getText());
    }

    public void sendWorkReportToBoss(RussianSpeakingEmployee boss, WorkReportInRussian workReportInRussian) {
        System.out.println(name + " is sending a report to " + boss.getName() + ": " + workReportInRussian.getText());
        boss.readWorkReport(workReportInRussian);
    }

    @Override
    public String getName() {
        return name;
    }

}
