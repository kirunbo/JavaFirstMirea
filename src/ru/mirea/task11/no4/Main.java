package ru.mirea.task11.no4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input year: ");
        int year = sc.nextInt();

        System.out.print("input month (1-12): ");
        int month = sc.nextInt() - 1;

        System.out.print("input day: ");
        int day = sc.nextInt();

        System.out.print("input hours: ");
        int hours = sc.nextInt();

        System.out.print("input minutes: ");
        int minutes = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day, hours, minutes);
        Date date = cal.getTime();

        System.out.println("calendar: " + cal.getTime());
        System.out.println("date: " + date);
    }
}
