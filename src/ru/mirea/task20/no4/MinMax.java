package ru.mirea.task20.no4;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T getMin() {
        if (array == null || array.length == 0) {
            throw new NullPointerException("array can't be null or empty");
        }

        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public T getMax() {
        if (array == null || array.length == 0) {
            throw new NullPointerException("array can't be null or empty");
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

class Calculator {
    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtraction(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("division by zero");
        }
        return a.doubleValue() / b.doubleValue();
    }
}

class Main {
    public static void main(String[] args) {
        try {
            Integer[] intArray = {1, 2, 3, 4, 5};
            MinMax<Integer> minMaxInt = new MinMax<>(intArray);
            System.out.println("minimum: " + minMaxInt.getMin());
            System.out.println("maximum: " + minMaxInt.getMax());

            Double[] doubleArray = {1.5, 2.3, 4.7, 3.8};
            MinMax<Double> minMaxDouble = new MinMax<>(doubleArray);
            System.out.println("minimum: " + minMaxDouble.getMin());
            System.out.println("maximum: " + minMaxDouble.getMax());

            System.out.println("addition: " + Calculator.sum(10, 25.5));
            System.out.println("subtraction: " + Calculator.subtraction(10.5, 4));
            System.out.println("multiplication: " + Calculator.multiply(6, 7.5));
            System.out.println("division: " + Calculator.divide(15, 3));
        } catch (Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}