package ru.mirea.task11.no3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date birth;

    public Student(String name, String surname, String birth) {
        this.name = name;
        this.surname = surname;
        this.birth = java.sql.Date.valueOf(birth);
    }

    @Override
    public String toString() {
        return "student's name: " + name + " " + surname + ", birth date: " + formatDate(birth, "dd/MM/yyyy");
    }

    public String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}

class Main{
    public static void main(String[] args) {
        Student student = new Student("Adam", "Jensen", "1993-09-03");
        System.out.println(student);
    }
}