package ru.mirea.task13.no1;

public class StringLine {
    public static void processString(String input) {
        System.out.println("the last symbol is: " + input.charAt(input.length() - 1));

        System.out.println("ends with '!!!': " + input.endsWith("!!!"));

        System.out.println("starts with 'I like': " + input.startsWith("I like"));

        System.out.println("contains 'Java': " + input.contains("Java"));

        System.out.println("index of substring 'Java': " + input.indexOf("Java"));

        String replacedString = input.replace('a', 'o');
        System.out.println("string after replacing 'a' with 'o': " + replacedString);

        String upperCaseString = input.toUpperCase();
        System.out.println("string in upper case: " + upperCaseString);

        String lowerCaseString = input.toLowerCase();
        System.out.println("string in lower case: " + lowerCaseString);

        String substringJava = input.substring(input.indexOf("Java"), input.indexOf("Java") + "Java".length());
        System.out.println("substring 'Java': " + substringJava);
    }

    public static void main(String[] args) {
        String exampleString = "I like Java!!!";
        processString(exampleString);
    }
}