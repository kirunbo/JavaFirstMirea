package ru.mirea.task19.no1;

import java.util.Scanner;

class InvalidINNException extends Exception{
    InvalidINNException(String message){
        super(message);
    }
}

class Client{
    private String fullName;
    private String inn;

    public Client(String fullName, String inn) {
        this.fullName = fullName;
        this.inn = inn;
    }

    public String getFullName() {
        return fullName;
    }

    public String getInn() {
        return inn;
    }
}

public class INNCheck {
    public void check(String fullName, String inn){
        try {
            if (!isValid(inn)) {
                throw new InvalidINNException("inn " + inn + " is not valid");
            }
            Client client = new Client(fullName, inn);
            System.out.println("the order is placed in the name of " + client.getFullName() + " with INN: " + client.getInn());
        }
        catch (InvalidINNException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    private boolean isValid(String inn){
            return inn.matches("\\d{10}") || inn.matches("\\d{12}");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        INNCheck innCheck = new INNCheck();

        System.out.print("input your name: ");
        String fullName = scanner.nextLine();

        System.out.print("input INN: ");
        String inn = scanner.nextLine();

        innCheck.check(fullName, inn);
    }
}
