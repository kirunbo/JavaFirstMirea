package ru.mirea.task3;

import java.util.Arrays;
import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] array1 = new double[10];
        for(int i = 0; i < array1.length; i++){
            array1[i] = rand.nextDouble(10);
            System.out.printf("%.3f ", array1[i]);
        }
        System.out.println();
        Arrays.sort(array1);
        for (double v : array1) {
            System.out.printf("%.3f ", v);
        }

        System.out.println();
        System.out.println();
        double[] array2 = new double[10];
        for(int i = 0; i < array2.length; i++){
            array2[i] = Math.random();
            System.out.printf("%.3f ", array2[i]);
        }
        System.out.println();
        Arrays.sort(array2);
        for (double v : array2) {
            System.out.printf("%.3f ", v);
        }
    }
}
