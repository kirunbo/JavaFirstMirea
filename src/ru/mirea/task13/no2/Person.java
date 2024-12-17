package ru.mirea.task13.no2;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Person(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String getFullName() {
        StringBuilder fullNameBuilder = new StringBuilder(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            fullNameBuilder.append(" ").append(firstName.charAt(0)).append(".");
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            fullNameBuilder.append(" ").append(patronymic.charAt(0)).append(".");
        }

        return fullNameBuilder.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Булгаков", "Михаил", "Афанасьевич");
        Person person2 = new Person("Чехов", "Антон", null);
        Person person3 = new Person("Чайковский", null, "Ильич");
        Person person4 = new Person("Достоевский", null, null);

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
        System.out.println(person4.getFullName());
    }
}
