package ru.mirea.task4;

public abstract class Shape {
    public abstract String getType();
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString(){
        return "type of shape is: " + this.getType() + "\narea equals: " + this.getArea()
                + "\nperimeter equals: " + this.getPerimeter() + "\n";
    }
}

class Circle extends Shape{
    double radius;
    int x, y;

    Circle(double radius, int x, int y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public String getType() {
        return "circle";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return super.toString() + "radius equals: " + radius
                + "\ncenter is in the point (" + x + " ; " + y + ")\n";
    }
}

class Rectangle extends Shape{
    double side_a, side_b;

    public Rectangle(double side_a, double side_b){
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public String getType() {
        return "rectangle";
    }

    @Override
    public double getArea() {
        return side_a * side_b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (side_a + side_b);
    }

    @Override
    public String toString(){
        return super.toString() + "first side's length equals: " + side_a
                + "\nsecond side's length equals " + side_b + "\n";
    }
}

class Square extends Rectangle{

    public Square(double side){
        super(side, side);
    }

    @Override
    public String getType() {
        return "square";
    }
}

class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, 1, 3);
        Rectangle rectangle = new Rectangle(3.4, 2.1);
        Square square = new Square(4);

        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
        System.out.println();
        System.out.println(square);
    }
}