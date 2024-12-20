package ru.mirea.task23.no1;

public class Main {
    public static void main(String[] args) {
        // ArrayQueueModule
        {
            System.out.println("ArrayQueueModule testing:");
            ArrayQueueModule queue = new ArrayQueueModule();
            System.out.println("\nenqueue test:");
            for (int i = 0; i < 5; i++) {
                queue.enqueue(i);
                System.out.println("added: " + i);
            }
            System.out.println("\nsize: " + queue.size());
            System.out.println("\nfirst element: " + queue.element());
            System.out.println("\ndeque test:");
            while (!queue.isEmpty()) {
                System.out.println("removed: " + queue.dequeue());
            }
            System.out.println("\nqueue is empty: " + queue.isEmpty());
            queue.enqueue(1);
            System.out.println("\nadded: " + 1);
            queue.enqueue(2);
            System.out.println("added: " + 2);
            queue.clear();
            System.out.println("queue is emptied");
            System.out.println("queue is empty: " + queue.isEmpty());
        }

        System.out.println("-----------------------");

        // ArrayQueueADT
        {
            System.out.println("ArrayQueueADT testing:");
            ArrayQueueADT queue = new ArrayQueueADT();
            System.out.println("\nenqueue testing:");
            for (int i = 0; i < 5; i++) {
                queue.enqueue(queue, i);
                System.out.println("added: " + i);
            }
            System.out.println("\nqueue size: " + queue.size(queue));
            System.out.println("\nfirst element: " + queue.element(queue));
            System.out.println("\ndequeue testing:");
            while (!queue.isEmpty(queue)) {
                System.out.println("removed: " + queue.dequeue(queue));
            }
            System.out.println("\nqueue is empty: " + queue.isEmpty(queue));
            queue.enqueue(queue,1);
            System.out.println("\nadded: " + 1);
            queue.enqueue(queue,2);
            System.out.println("added: " + 2);
            queue.clear();
            System.out.println("queue is emptied.");
            System.out.println("queue is empty: " + queue.isEmpty(queue));
        }

        System.out.println("-----------------------");

        // ArrayQueue
        {
            System.out.println("ArrayQueue testing:");
            ArrayQueue queue = new ArrayQueue();
            System.out.println("\nenqueue testing:");
            for (int i = 0; i < 5; i++) {
                queue.enqueue(i);
                System.out.println("added: " + i);
            }
            System.out.println("\nqueue size: " + queue.size());
            System.out.println("\nfirst element: " + queue.element());
            System.out.println("\ndequeue testing:");
            while (!queue.isEmpty()) {
                System.out.println("removed: " + queue.dequeue());
            }
            System.out.println("\nqueue is empty: " + queue.isEmpty());
            queue.enqueue(1);
            System.out.println("\nadded: " + 1);
            queue.enqueue(2);
            System.out.println("added: " + 2);
            queue.clear();
            System.out.println("queue is emptied");
            System.out.println("queue is empty: " + queue.isEmpty());
        }
    }
}
