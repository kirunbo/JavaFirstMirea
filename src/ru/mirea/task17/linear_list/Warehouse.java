package ru.mirea.task17.linear_list;

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
        }
        else{
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
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
        System.out.println("warehouse is emptied");
    }

    public boolean isEmpty(){
        return head == null;
    }
}
