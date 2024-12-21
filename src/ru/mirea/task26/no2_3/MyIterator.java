package ru.mirea.task26.no2_3;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private MyListClass<T> list;
    private int currentIndex;

    public MyIterator(MyListClass<T> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return list.get(currentIndex++);
    }
}