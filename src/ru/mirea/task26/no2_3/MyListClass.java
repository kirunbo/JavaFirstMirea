package ru.mirea.task26.no2_3;

import java.util.Arrays;

public class MyListClass<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    public MyListClass() {
        elements = new Object[10];
        size = 0;
    }

    @Override
    public void add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        elements[size++] = element;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index + " out of bounds" + size);
        }
        return (T) elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyIterator<T> iterator() {
        return new MyIterator<>(this);
    }
}