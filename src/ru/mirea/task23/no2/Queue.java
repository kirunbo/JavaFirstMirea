package ru.mirea.task23.no2;

public interface Queue <T>{
    int size();
    boolean isEmpty();
    T dequeue();
    void enqueue(T element);
    void clear();
}
