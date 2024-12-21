package ru.mirea.task26.no2_3;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyListClass<>();
        myList.add("element 1");
        myList.add("element 2");
        myList.add("element 3");

        MyIterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}