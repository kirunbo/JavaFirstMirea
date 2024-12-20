package ru.mirea.task21.no2;

import java.util.ArrayList;
import java.util.List;

public class GenericArray <T>{
    private List<T> elements;

    public GenericArray() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public T get(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        return elements.get(index);
    }

    public int size() {
        return elements.size();
    }

    public void printElements() {
        for (T element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GenericArray<Integer> intArray = new GenericArray<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        System.out.println("Integer array elements:");
        intArray.printElements();

        GenericArray<String> stringArray = new GenericArray<>();
        stringArray.add("Hello");
        stringArray.add("World");
        System.out.println("String array elements:");
        stringArray.printElements();

        GenericArray<Double> doubleArray = new GenericArray<>();
        doubleArray.add(1.1);
        doubleArray.add(2.2);
        doubleArray.add(3.3);
        System.out.println("Double array elements:");
        doubleArray.printElements();
    }
}
