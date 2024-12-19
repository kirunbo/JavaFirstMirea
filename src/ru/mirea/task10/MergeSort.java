package ru.mirea.task10;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(double [] array){
        if(array.length<2){
            return;
        }
        int mid = array.length/2;
        double [] l = new double[mid];
        double [] r = new double[array.length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            r[i - mid] = array[i];
        }

        mergeSort(l);
        mergeSort(r);

        merge(array, l, r);
    }

    public static void merge(double [] array, double [] l, double [] r){
        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length){
            if(l[i] <= r[j]){
                array[k++] = l[i++];
            }
            else{
                array[k++] = r[j++];
            }
        }
        while (i < l.length){
            array[k++] = l[i++];
        }
        while (j < r.length){
            array[k++] = r[j++];
        }
    }
}
