package ru.mirea.task2;

class Dog {
    private int age;
    private String name;

    Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int toHumanAge(int age){
        return 7 * age;
    }

    @Override
    public String toString(){
        return "dog's name: " + this.name +
                "\ndog's age: " + this.age +
                "\ndog's age in human years: " + this.toHumanAge(this.getAge()) + "\n";
    }
}

public class DogKennel{

    static Dog[] dogKennel = new Dog[10];

    public static void addDog(Dog dog){
        boolean freeSpace = false;
        int index = 0;

        for (int i = 0; i < dogKennel.length; i++){
            if (dogKennel[i] == null){
                freeSpace = true;
                index = i;
                break;
            }
        }

        if(freeSpace){
            dogKennel[index] = dog;
            System.out.println("new dog successfully added to the kennel");
        } else {
            System.out.println("no free space in kennel");
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < dogKennel.length; i++) {
            addDog(new Dog(i + 1, String.format("dog %d", i + 1)));
            System.out.println(dogKennel[i].toString());
        }
        addDog(new Dog(3, "qwerty"));
    }
}
