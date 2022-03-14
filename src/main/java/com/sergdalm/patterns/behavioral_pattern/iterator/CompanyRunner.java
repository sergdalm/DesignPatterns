package main.java.com.sergdalm.patterns.behavioral_pattern.iterator;

public class CompanyRunner {
    public static void main(String[] args) {
        String[] departments = {"Administrative department", "Sales department",
                "Low department", "HR department", "Production department", "Accounting department",
                "Marketing department", "IT department", "Control department"};

        Company company = new Company("CJ", departments);
        Iterator<String> iterator = company.getIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
