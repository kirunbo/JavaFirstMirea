package ru.mirea.task3;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("array is a strictly increasing sequence");
        } else{
            System.out.println("array is not a strictly increasing sequence");
        }
    }
}
