package ru.mirea.task23.no1;

public class ArrayQueue {
    private ArrayQueueADT queue;

    public ArrayQueue() {
        queue = new ArrayQueueADT();
    }

    public void enqueue(Object element) {
        ArrayQueueADT.enqueue(queue, element);
    }

    public Object element() {
        return ArrayQueueADT.element(queue);
    }

    public Object dequeue() {
        return ArrayQueueADT.dequeue(queue);
    }

    public int size() {
        return ArrayQueueADT.size(queue);
    }

    public boolean isEmpty() {
        return ArrayQueueADT.isEmpty(queue);
    }

    public void clear() {
        ArrayQueueADT.clear();
    }
}
