package ru.mirea.task9;



public class QuickSort {
    public static void quickSort(Comparable[] list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);

            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }


    private static int partition(Comparable[] list, int low, int high) {
        Comparable pivot = list[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list[j].compareTo(pivot) < 0) {
                i++;


                Comparable temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }


        Comparable temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;


        return i + 1;
    }
}
