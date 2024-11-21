package ru.mirea.task4;

public abstract class Shape {
    public abstract String getType();
    public abstract double getArea();
    public abstract double getPerimeter();
    protected String color;
    protected boolean filled;

    public Shape(){}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "type of shape is: " + this.getType() + "\narea equals: " + this.getArea()
                + "\nperimeter equals: " + this.getPerimeter() + "\n";
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;

        this.color = color;
        this.filled = filled;
        // ?? super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
        return super.toString() + "radius equals: " + radius + "\n";
    }
}

class Rectangle extends Shape{
    private double width, length;

    public Rectangle(){}

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;

        this.color = color;
        this.filled = filled;
        //super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getType() {
        return "rectangle";
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString(){
        return super.toString() + "width equals: " + width
                + "\nlength equals " + length + "\n";
    }
}

class Square extends Rectangle{

    public Square(){}

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    @Override
    public String getType() {
        return "square";
    }
}

class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Rectangle rectangle = new Rectangle(3.4, 2.1);
        Square square = new Square(4);

        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
        System.out.println();
        System.out.println(square);
    }
}