package ru.mirea.task32;

import java.util.Arrays;
import java.util.Scanner;

class MovableElement {
    public static int findElement(int[] permutation, int[] direction) {
        int index = -1;
        for (int i = 0; i < permutation.length; i++) {
            int nextElementIndex = i + direction[i];
            if (nextElementIndex >= 0 && nextElementIndex < permutation.length) {
                if (permutation[i] > permutation[nextElementIndex]) {
                    if (index == -1) {
                        index = i;
                    } else {
                        if (permutation[i] > permutation[index]) {
                            index = i;
                        }
                    }
                }
            }
        }
        return index;
    }
}

class Changer {
    public static void funcDirection(int[] permutation, int[] direction, int mobileElement) {
        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i] > mobileElement) {
                direction[i] = direction[i] * (-1);
            }
        }
    }
    public static void funcElement(int[] permutation, int[] direction, int i, int j) {
        int tempPermutation = permutation[i];
        permutation[i] = permutation[j];
        permutation[j] = tempPermutation;

        int tempDirection = direction[i];
        direction[i] = direction[j];
        direction[j] = tempDirection;
    }
    public static void permutation(int[] permutation, int[] direction) {
        int count = 0;
        System.out.println(Arrays.toString(permutation));
        count++;
        MovableElement movEl = new MovableElement();
        int mobileElementIndex = movEl.findElement(permutation, direction);
        while (mobileElementIndex != -1) {
            int mobileElement = permutation[mobileElementIndex];
            int nextIndex = mobileElementIndex + direction[mobileElementIndex];

            funcElement(permutation, direction, mobileElementIndex, nextIndex);
            funcDirection(permutation, direction, mobileElement);

            System.out.println(Arrays.toString(permutation));
            count++;
            mobileElementIndex = movEl.findElement(permutation, direction);
        }
        System.out.println("total number of permutations: " + count);
    }
}

public class Trotter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input a sequence of numbers with spaces: ");
        String inputNumbers = scanner.nextLine();

        System.out.print("input directions (1 for right direction, -1 for left direction) with spaces: ");
        String inputDirections = scanner.nextLine();

        String[] numbersStrings = inputNumbers.split(" ");
        String[] directionsStrings = inputDirections.split(" ");

        int n = numbersStrings.length;
        int[] permutation = new int[n];
        int[] direction = new int[n];

        for (int i = 0; i < n; i++) {
            permutation[i] = Integer.parseInt(numbersStrings[i]);
            direction[i] = Integer.parseInt(directionsStrings[i]);
        }
        Changer.permutation(permutation, direction);
    }
}
