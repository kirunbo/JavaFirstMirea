package ru.mirea.task13.no5;

public class PhoneNumber {
    public static void changeNumber(String number) {
        System.out.println("old number: " + number);
        StringBuilder newNumber = new StringBuilder();
        if (number.startsWith("8")) {
            number = "+7" + number.substring(1);
        }
        for (int i=0; i < number.length(); i++) {
            if (i == 5 || i == 8) {
                newNumber.append("–");
            }
            newNumber.append(number.charAt(i));
        }
        System.out.println("new number: " + newNumber);
    }

    public static void main(String[] args) {
        String exampleString1 = "89175655655";
        changeNumber(exampleString1);
        System.out.println();

        String exampleString2 = "+10428965221";
        changeNumber(exampleString2);
        System.out.println();

        String exampleString3 = "+79175655655";
        changeNumber(exampleString3);
    }
}
