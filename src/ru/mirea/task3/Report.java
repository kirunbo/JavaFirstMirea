package ru.mirea.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Report {
    static void generateReport(Employee[] array){
        for (int i = 0; i < array.length; i++) {
            String s = String.format("%.2f", array[i].salary);
            System.out.printf("Employee %s has next salary: %10s $\n", array[i].fullname, s);
        }
    }
}

class Employee{
    String fullname;
    double salary;
    public Employee(String fullname, double salary){
        this.fullname = fullname;
        this.salary = salary;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] array = new Employee[5];
        for (int i = 0; i < 5; i++) {
            array[i] = new Employee(sc.next(), sc.nextDouble());
        }
        Report.generateReport(array);
    }
}