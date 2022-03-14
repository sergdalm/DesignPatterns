package main.java.com.sergdalm.patterns.behavioral_pattern.iterator;

public class Company implements Collection<String> {
    private String name;
    private String[]departments;

    public Company(String name, String[] departments) {
        this.name = name;
        this.departments = departments;
    }

    @Override
    public Iterator<String> getIterator() {
        return new DepartmentIterator();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDepartments() {
        return departments;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    private class DepartmentIterator implements Iterator<String> {
        int index;

        @Override
        public boolean hasNext() {
            if (index < departments.length) {
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            return departments[index++];
        }
    }
}
