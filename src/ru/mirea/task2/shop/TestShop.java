package ru.mirea.task2.shop;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        System.out.println("please, input 10 models of computers");
        System.out.println(">>");

        Scanner sc = new Scanner(System.in);
        String[] computers = new String[10];

        for (int i = 0; i < 10; i++) {
            computers[i] = sc.next();
        }

        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(computers[i]);
        }
        */
        
        Shop shop = new Shop(computers);
        String command, model;
        do{
            System.out.println("if you want to add a computer, type 'add'");
            System.out.println("if you want to find a computer, type 'find'");
            System.out.println("if you want to delete a computer, type 'delete'");
            System.out.println("if you want to quit, type 'quit'");
            command = sc.next();

            if(command.equals("add")){
                System.out.println("please, input the name of a model");
                System.out.println(">>");
                model = sc.next();
                shop.addComputer(model);
            } else if (command.equals("find")) {
                System.out.println("please, input the name of a model");
                System.out.println(">>");
                model = sc.next();
                shop.findComputer(model);
            } else if (command.equals("delete")) {
                System.out.println("please input the index of a model you wish to delete");
                System.out.println(">>");
                if(sc.hasNextInt()) {
                    int index = sc.nextInt();
                    if ((index >= 0) && (index <= 9)){
                        shop.deleteComputer(index);
                    }
                    else{
                        System.out.println("index out of range");
                    }
                } else{
                    System.out.println("incorrect input");
                }
            }else{
                if(!command.equals("quit")){
                    System.out.println("incorrect input");
                }
            }
        }while(!command.equals("quit"));
    }
}
