package ru.mirea.task23.no1;

public class ArrayQueueModule {
    private static Object[] elements = new Object[5];
    private static int head = 0;
    private static int tail = 0;
    private static int size = 0;

    // Инвариант: size не превышаем размер массива
    public static void enqueue(Object element) {
        // Предусловие: size < elements.length
        if (size == elements.length) {
            throw new IllegalStateException("queue is overflow");
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
        // Постусловие: size увеличен на 1
    }

    public static Object element() {
        // Предусловие: очередь не пустая
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty");
        }
        return elements[head];
        // Постусловие: возвращен первый элемент
    }

    public static Object dequeue() {
        // Предусловие: очередь не пустая
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty");
        }
        Object result = elements[head];
        elements[head] = null; // Удаляем ссылку
        head = (head + 1) % elements.length;
        size--;
        // Постусловие: размер уменьшен на 1
        return result;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}
