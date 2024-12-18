package ru.mirea.task14.no4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckNum {
    public static void main(String[] args) {
        String input1 = "6 / 5 – 2 * 9";
        String input2 = "(1 + 8) – 9 / 4";
        Pattern pattern = Pattern.compile("\\b\\d+\\b(\\s*\\+)");
        Matcher matcher1 = pattern.matcher(input1);
        Matcher matcher2 = pattern.matcher(input2);

        System.out.println(input1 + " : " + matcher1.find());
        System.out.println(input2 + " : " + matcher2.find());
    }
}