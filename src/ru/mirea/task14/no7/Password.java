package ru.mirea.task14.no7;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Password {
    public static boolean isPasswordSecure(String password) {
        if (password.length() < 8) {
            return false;
        }

        Pattern upperCasePattern = Pattern.compile("[A-Z]");
        Matcher hasUpperCase = upperCasePattern.matcher(password);

        Pattern lowerCasePattern = Pattern.compile("[a-z]");
        Matcher hasLowerCase = lowerCasePattern.matcher(password);

        Pattern digitPattern = Pattern.compile("[0-9]");
        Matcher hasDigit = digitPattern.matcher(password);

        return hasUpperCase.find() && hasLowerCase.find() && hasDigit.find();
    }

    public static void main(String[] args) {
        String password1 = "A007..";
        String password2 = "F032_Password";
        String password3 = "TrySpy1.";

        if (isPasswordSecure(password1)) {
            System.out.println(password1 + " is secure.");
        } else {
            System.out.println(password1 + " is not secure.");
        }


        if (isPasswordSecure(password2)) {
            System.out.println(password2 + " is secure.");
        } else {
            System.out.println(password2 + " is not secure.");
        }


        if (isPasswordSecure(password3)) {
            System.out.println(password3 + " is secure.");
        } else {
            System.out.println(password3 + " is not secure.");
        }
    }
}
