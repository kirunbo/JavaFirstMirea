package ru.mirea.task11.no1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String name = "Bogatskaya";
        Calendar dateReceived = Calendar.getInstance();
        dateReceived.set(2024, 11, 7);
        Date dateSubmitted = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd hh:mm:ss z YYYY");

        System.out.println("name: " + name);
        System.out.println("date received: " + dateReceived.getTime());
        System.out.println("date submitted: " + dateFormat.format(dateSubmitted));
    }
}
