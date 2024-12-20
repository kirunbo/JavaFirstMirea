package ru.mirea.task18.no5;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("the key is: " + key);
        }
        catch (Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}

class Main{
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getDetails(null);
    }
}
