package ru.mirea.task23.no2;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }
}
