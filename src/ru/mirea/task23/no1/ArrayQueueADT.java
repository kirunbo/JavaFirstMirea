package ru.mirea.task23.no1;

public class ArrayQueueADT {
    private static final int MAX_SIZE = 5;
    private Object[] elements;
    private static int head;
    private static int tail;
    private static int size;

    public ArrayQueueADT() {
        elements = new Object[MAX_SIZE];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Инвариант: size не превышаем размер массива
    public static void enqueue(ArrayQueueADT queue, Object element) {
        // Предусловие: queue.size < elements.length
        if (queue.size == queue.elements.length) {
            throw new IllegalStateException("queue is overflow");
        }
        queue.elements[tail] = element;
        queue.tail = (tail + 1) % queue.elements.length;
        queue.size++;
        // Постусловие: size увеличен на 1
    }

    public static Object element(ArrayQueueADT queue) {
        // Предусловие: очередь не пустая
        if (isEmpty(queue)) {
            throw new IllegalStateException("queue is empty");
        }
        return queue.elements[queue.head];
        // Постусловие: возвращен первый элемент
    }

    public static Object dequeue(ArrayQueueADT queue) {
        // Предусловие: очередь не пустая
        if (isEmpty(queue)) {
            throw new IllegalStateException("queue is empty");
        }
        Object result = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        // Постусловие: размер уменьшен на 1
        return result;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}
