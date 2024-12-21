package ru.mirea.task26.no1;

import java.util.Stack;

public class ArrayInverter {
    public static void invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int element : array) {
            stack.push(element);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        invertArray(array);

        System.out.println("\ninverted array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}