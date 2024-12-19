package ru.mirea.task17.doubly_linked_list;

import ru.mirea.task17.linear_list.Item;

class Node{
    Item item;
    Node next;
    Node prev;

    Node(Item item){
        this.item = item;
        this.next = null;
        this.prev = null;
    }
}

public class Warehouse {
    private Node head;
    private Node tail;

    Warehouse(){
        head = null;
        tail = null; // current
    }

    public void addItem(){
        Item newItem = new Item();
        newItem.itemInput();
        Node newNode = new Node(newItem);

        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
    }

    public void removeItem(String name){
        if (head == null){
            return;
        }

        if (name.equals(head.item.getName())){
            head = head.next;
            System.out.println("item removed");
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null){
            if(currentNode.next.item.getName().equals(name)){
                currentNode.next = currentNode.next.next;
                currentNode.next.prev = currentNode;
                System.out.println("item removed");
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void printItems(){
        Node currentNode = head;
        while (currentNode != null){
            currentNode.item.itemPrint();
            System.out.print(" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void clearWarehouse(){
        head = null;
        tail = null;
        System.out.println("warehouse is emptied");
    }

    public boolean isEmpty(){
        return head == null;
    }
}
