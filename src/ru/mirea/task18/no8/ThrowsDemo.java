package ru.mirea.task18.no8;

public class ThrowsDemo {
    public void getKey(String key) {
        try {
            if(key == null){
                throw new NullPointerException("key can't be empty");
            }
            printDetails(key);
        }
        catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) {
        return "data for " + key;
    }
}

class Main{
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getKey(null);
    }
}
