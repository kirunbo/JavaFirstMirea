package ru.mirea.task21.no3;

public class Index {
    public static <T> T getIndex(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        return array[index];
    }

    public static void main(String[] args) {
        String[] stringArray = {"hi", "hello", "hey"};
        int in = 1;
        String element = getIndex(stringArray, in);
        System.out.println("element found by index " + in + ": " + element);

        Integer[] integerArray = {1, 2, 3};
        int d = 0;
        Integer intElement = getIndex(integerArray, d);
        System.out.println("element found by index " + d + ": " + intElement);
    }
}
