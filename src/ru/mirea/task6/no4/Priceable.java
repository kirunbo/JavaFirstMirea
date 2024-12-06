package ru.mirea.task6.no4;

public interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "product's name = '" + name + "'";
    }
}

class Service implements Priceable {
    private String name;
    private double pricePerHour;
    private int hours;

    public Service(String name, double pricePerHour, int hours) {
        this.name = name;
        this.pricePerHour = pricePerHour;
        this.hours = hours;
    }

    @Override
    public double getPrice() {
        return pricePerHour * hours;
    }

    @Override
    public String toString() {
        return "service's name = '" + name +
                "'\nprice per hour = " + pricePerHour +
                "\nhours = " + hours;
    }
}

class Main {
    public static void main(String[] args) {
        Priceable[] priceable = new Priceable[4];

        priceable[0] = new Product("laptop", 999.99);
        priceable[1] = new Product("smartphone", 499.99);

        priceable[2] = new Service("web design", 50.0, 10);
        priceable[3] = new Service("consulting", 100.0, 3);

        for (Priceable item : priceable) {
            System.out.println(item.toString());
            System.out.println("Price: " + item.getPrice() + "\n");
        }
    }
}