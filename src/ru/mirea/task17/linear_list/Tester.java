package ru.mirea.task17.linear_list;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Scanner sc = new Scanner(System.in);
        String option;
        do {
            System.out.println("choose an option:\n" +
                    "to add an item input 'add'\n" +
                    "to remove item input 'remove'\n" +
                    "to print items input 'print'\n" +
                    "to clear the warehouse input 'clear'\n" +
                    "to check if the warehouse is empty input 'check'\n" +
                    "to exit input 'exit'\n");
            option = sc.nextLine();
            switch (option) {
                case "add":
                    warehouse.addItem();
                    break;
                case "remove":
                    System.out.print("input the name of an item you wish to remove: ");
                    String name = sc.nextLine();
                    warehouse.removeItem(name);
                    break;
                case "print":
                    warehouse.printItems();
                    break;
                case "clear":
                    warehouse.clearWarehouse();
                    break;
                case "check":
                    if (warehouse.isEmpty()) {
                        System.out.println("warehouse is empty");
                    } else {
                        System.out.println("there are items in warehouse");
                    }
                    break;
                default:
                    if(!option.equals("exit")){
                        System.out.println("incorrect input");
                    }
                    break;
            }
        }while (!option.equals("exit"));
    }
}
