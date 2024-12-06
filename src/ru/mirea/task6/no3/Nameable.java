package ru.mirea.task6.no3;

public interface Nameable {
    String getName();
}

class Animal implements Nameable{

    String name;

    Animal(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return "animal's name: '" + name + "'\n";
    }
}

class Car implements Nameable{

    String name;

    Car(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return "car's make: '" + name + "'\n";
    }
}

class Planet implements Nameable{

    String name;

    Planet(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return "planet's name: '" + name + "'\n";
    }
}

class Main{
    public static void main(String[] args) {
        Nameable[] nameable = new Nameable[5];

        nameable[0] = new Animal("cat");
        nameable[1] = new Car("Tesla");
        nameable[2] = new Car("Audi");
        nameable[3] = new Planet("Saturn");
        nameable[4] = new Planet("Mars");

        for (Nameable item : nameable) {
            System.out.print(item.getName());
        }
    }
}