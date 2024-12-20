package ru.mirea.task20.no2;

public class GenericClass <T, V, K>{
    private T first;
    private V second;
    private K third;

    public GenericClass(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void print() {
        System.out.println("first variable type: " + first.getClass().getName());
        System.out.println("second variable type: " + second.getClass().getName());
        System.out.println("third variable type: " + third.getClass().getName());
    }
}

class Main{
    public static void main(String[] args) {
        GenericClass<String, Integer, Boolean> genericClass = new GenericClass<>("qwerty", 13, false);
        System.out.println("first variable: " + genericClass.getFirst());
        System.out.println("second variable: " + genericClass.getSecond());
        System.out.println("third variable: " + genericClass.getThird());
        System.out.println();
        genericClass.print();
    }
}
