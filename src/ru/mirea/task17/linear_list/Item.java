package ru.mirea.task17.linear_list;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Item {
    private double price;
    private String name;

    public String getName() {
        return name;
    }

    public void itemInput(){
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.println("input item's name");
                name = sc.nextLine();
                if (name.isEmpty()){
                    throw new IllegalArgumentException("name can't be empty");
                }
                break;
            }
            catch (Exception e){
                System.out.println("incorrect input");
            }
        }
        while (true){
            try{
                System.out.println("input item's price");
                price = sc.nextDouble();
                if (price <= 0){
                    throw new IllegalArgumentException("price can't be negative or equal 0");
                }
                break;
            }
            catch (IllegalArgumentException e){
                System.out.println("error: " + e.getMessage());
            }
            catch (InputMismatchException e){
                System.out.println("incorrect input");
            }
            sc.nextLine();
        }
    }

    public void itemPrint() {
        System.out.println("\nitem's name: " + name + " , item's price = " + price);
    }
}
