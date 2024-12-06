package ru.mirea.task8.no5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digitSum(n));
    }

    public static int digitSum(int n){
        if(n == 0){
            return 0;
        }

        return digitSum(n / 10) + (n % 10);
    }
}
