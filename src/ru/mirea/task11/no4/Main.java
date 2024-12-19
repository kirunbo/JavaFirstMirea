package ru.mirea.task11.no4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        do {
            System.out.print("input year: ");
            year = sc.nextInt();
        }while (year < 0);

        int month;
        do {
            System.out.print("input month (1-12): ");
            month = sc.nextInt() - 1;
        }while (month<0 || month>=12);

        int day;
        do {
            System.out.print("input day: ");
            day = sc.nextInt();
        } while (!isLegit(month, day));

        int hours;
        do {
            System.out.print("input hours: ");
            hours = sc.nextInt();
        } while (hours < 0 || hours > 24);

        int minutes;
        do {
            System.out.print("input minutes: ");
            minutes = sc.nextInt();
        } while (minutes < 0 || minutes > 60);

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day, hours, minutes);
        Date date = cal.getTime();

        System.out.println("calendar: " + cal.getTime());
        System.out.println("date: " + date);
    }

    static boolean isLegit(int month, int day){
        month++;
        if (day < 1){
            return false;
        }
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if (day > 31){
                System.out.println("incorrect input");
                return false;
            }
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            if (day > 30){
                System.out.println("incorrect input");
                return false;
            }
        }
        else{
            if (day > 29){
                System.out.println("incorrect input");
                return false;
            }
        }
        return true;
    }
}
