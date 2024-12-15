package ru.mirea.task11.no2;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input date in format yyyy-mm-dd: ");
        String user = sc.nextLine();

        Date userDate = java.sql.Date.valueOf(user);
        Date currentDate = new Date();

        System.out.println(currentDate);

        if (currentDate.before(userDate)) {
            System.out.println("current date is earlier than input date");
        } else if (currentDate.after(userDate)) {
            System.out.println("current date is later than input date");
        } else {
            System.out.println("dates are the same");
        }
    }
}
