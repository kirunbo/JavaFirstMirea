package ru.mirea.task8.no17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findMax(sc, 0));
    }

    public static int findMax(Scanner sc, int current){
        int n = sc.nextInt();

        if(n == 0){
            return current;
        }

        if(n > current){
            return findMax(sc, n);
        }
        else {
            return findMax(sc, current);
        }
    }
}
