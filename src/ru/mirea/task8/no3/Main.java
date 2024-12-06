package ru.mirea.task8.no3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        printNumbers(a, b);
    }

    public static void printNumbers(int a, int b){
        if (a < b){
            System.out.print(a + " ");
            printNumbers(a + 1, b);
        }
        else if (a > b){
            System.out.print(a + " ");
            printNumbers(a - 1, b);
        }
        else{
            System.out.print(a + " ");
        }
    }
}

