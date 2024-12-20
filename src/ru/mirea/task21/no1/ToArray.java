package ru.mirea.task21.no1;

import java.util.ArrayList;
import java.util.List;

public class ToArray {
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();

        for (T element : array) {
            list.add(element);
        }

        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"hi", "I'm", "tired"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("String array: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("Integer list: " + intList);
    }
}



