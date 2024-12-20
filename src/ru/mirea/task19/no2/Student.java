package ru.mirea.task19.no2;

public class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        if(name.trim().isEmpty() || name == null){
            throw new EmptyStringException("name can't be empty");
        }
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return name + " - " + gpa;
    }
}
