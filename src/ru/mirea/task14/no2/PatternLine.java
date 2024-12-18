package ru.mirea.task14.no2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternLine {
     public static void main(String[] args) {
         String regex = "abcdefghijklmnopqrstuv18340";

         String input1 = "abcdefghijklmnopqrstuv18340";
         String input2 = "abcdefghijklmnoasdfasdpqrstuv18340";

         Pattern pattern = Pattern.compile(regex);
         Matcher matcher1 = pattern.matcher(input1);
         Matcher matcher2 = pattern.matcher(input2);

         if (matcher1.matches()) {
             System.out.println("The string " + input1 + " is a match.");
         } else {
             System.out.println("The string " + input1 + " is not a match.");
         }

         if (matcher2.matches()) {
             System.out.println("The string " + input2 + " is a match.");
         } else {
             System.out.println("The string " + input2 + " is not a match.");
         }
    }
}
