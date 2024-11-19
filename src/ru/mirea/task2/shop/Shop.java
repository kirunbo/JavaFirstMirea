package ru.mirea.task2.shop;

import java.util.Scanner;

public class Shop {
    String[] computers = new String[10];
    public Shop(String[] computers){
        this.computers = computers;
    }

    public void addComputer(String model){
        int index = -1;
        for (int i = 0; i < 10; i++){
            if (computers[i].equals("-1")){
                index = i;
                break;
            }
        }
        if (index != -1) {
            computers[index] = model;
            System.out.println("computer successfully added");
        } else {
            System.out.println("no space available");
        }
    }

    public void deleteComputer(int index){
        computers[index] = "-1";
        System.out.println("item is successfully deleted");
    }

    public void findComputer(String model){
        Scanner sc = new Scanner(System.in);
        int index = -1;
        for (int i = 0; i < 10; i++) {
            if (computers[i].equals(model)){
                index = i;
                System.out.println("item found. index = " + index);
                do{
                    System.out.println("do you want to purchase this item? y/n?");
                    String ans;
                    ans = sc.next();
                    if (ans.equals("y")){
                        this.deleteComputer(index);
                        System.out.println("item is successfully deleted");
                        break;
                    } else if (ans.equals("n")) {
                        break;
                    }
                    else{
                        System.out.println("incorrect input");
                    }
                }while (true);
            }
        }
        if (index == -1){
            System.out.println("no item found");
        }
    }
}
