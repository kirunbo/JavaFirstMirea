package ru.mirea.task1.opt3;
//import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        //3
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            s += array[i];
        }
        System.out.println(s);
        System.out.println((double) s / array.length);

        //5
        for(String str : args){
            System.out.println(str);
        }

        //6
        for (int i = 1; i <= 10; i++) {
            System.out.printf("1/%s ", i);
        }

    }
}
