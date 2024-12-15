package ru.mirea.task11.no5;

import java.util.ArrayList;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        int size = 1000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList adding time: " + (end - start) + " nanosecons");

        LinkedList<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList adding time: " + (end - start) + " nanosecons");

        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(i, size/2);
        }
        end = System.nanoTime();
        System.out.println("ArrayList insertion time: " + (end - start) + " nanosecons");

        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(i, size/2);
        }
        end = System.nanoTime();
        System.out.println("LinkedList insertion time: " + (end - start) + " nanosecons");

        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.remove(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList delete time: " + (end - start) + " nanosecons");

        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.remove(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList delete time: " + (end - start) + " nanosecons");

        start = System.nanoTime();
        boolean flag = arrayList.contains(8024);
        end = System.nanoTime();
        System.out.println("ArrayList search time: " + (end - start) + " nanosecons\nelement found: " + flag);

        start = System.nanoTime();
        flag = linkedList.contains(1000);
        end = System.nanoTime();
        System.out.println("LinkedList search time: " + (end - start) + " nanosecons\nelement found: " + flag);
    }
}
