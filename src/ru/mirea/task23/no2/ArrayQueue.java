package ru.mirea.task23.no2;

public class ArrayQueue<T> extends AbstractQueue<T> {
    private static final int MAX_SIZE = 5;
    private Object[] elements;
    private static int head = 0;
    private static int tail = 0;

    public ArrayQueue() {
        elements = new Object[MAX_SIZE];
        head = 0;
        tail = 0;
        size = 0;
    }

    @Override
    public void enqueue(Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("queue is overflow");
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty");
        }
        return (T) elements[head];
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty");
        }
        T result = (T) elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return result;
    }
}
