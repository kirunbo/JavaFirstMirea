package ru.mirea.task17.circular_list;

import ru.mirea.task17.linear_list.Item;

class Node{
    Item item;
    Node next;

    Node(Item item){
        this.item = item;
        this.next = null;
    }
}

public class Warehouse {
    private Node head;

    Warehouse(){
        head = null;
    }

    public void addItem(){
        Item newItem = new Item();
        newItem.itemInput();
        Node newNode = new Node(newItem);

        if (head == null){
            head = newNode;
            head.next = head;
        }
        else{
            Node currentNode = head;
            while(currentNode.next != head){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = head;
        }
    }

    public void removeItem(String name){
        if (head == null){
            return;
        }

        Node currentNode = head;
        Node prev = null;
        do{
            if(currentNode.item.getName().equals(name)){
                if (prev == null) {
                    if(head.next == head){
                        head = null;
                    }
                    else{
                        Node last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    }
                }
                else{
                    prev.next = currentNode.next;
                }
                System.out.println("item removed");
                return;
            }
            prev = currentNode;
            currentNode = currentNode.next;
        }while (currentNode != head);
    }

    public void printItems(){
        Node currentNode = head;
        do{
            currentNode.item.itemPrint();
            System.out.print(" -> ");
            currentNode = currentNode.next;
        } while (currentNode != head);
    }

    public void clearWarehouse(){
        head = null;
        System.out.println("warehouse is emptied");
    }

    public boolean isEmpty(){
        return head == null;
    }
}

