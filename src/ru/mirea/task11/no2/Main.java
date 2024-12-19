package ru.mirea.task11.no2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;
        do {
            System.out.println("input date in format yyyy-mm-dd: ");
            user = sc.nextLine();
        }while (!isLegit(user));

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

    static boolean isLegit(String user){
        String[] strings = user.split("-");
        int month = Integer.parseInt(strings[1]);
        int day = Integer.parseInt(strings[2]);
        switch (month){
            case 2:
                if (day > 29){
                    System.out.println("incorrect input");
                    return false;
                }
            case 4:
                if (day > 30){
                    System.out.println("incorrect input");
                    return false;
                }
            case 6:
                if (day > 30){
                    System.out.println("incorrect input");
                    return false;
                }
            case 9:
                if (day > 30){
                    System.out.println("incorrect input");
                    return false;
                }
            case 11:
                if (day > 30){
                    System.out.println("incorrect input");
                    return false;
                }
        }
        return true;
    }
}
