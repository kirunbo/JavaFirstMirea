package ru.mirea.task26.no2_3;

public interface MyList<T> {
    void add(T element);
    T get(int index);
    int size();
    MyIterator<T> iterator();
}

