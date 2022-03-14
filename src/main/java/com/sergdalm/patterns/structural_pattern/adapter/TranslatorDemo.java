package main.java.com.sergdalm.patterns.structural_pattern.adapter;

public class TranslatorDemo {
    public static void main(String[] args) {
        Boss boss = new Boss("mister Kim");
        Manager manager = new Manager("Alexander");
        Translator translator = new Translator("Alex", boss);

        WorkReportInRussian workReportInRussian = manager.writeWorkReport("Здравствуйте. Всё идёт в рабочем порядке. Никаких проблем нет");
        manager.sendWorkReportToBoss(translator, workReportInRussian);
    }
}
