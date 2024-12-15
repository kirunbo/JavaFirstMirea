package ru.mirea.task12.no1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.PINK);
        frame.setVisible(true);
    }
}

class MyPanel extends JPanel {
    Shape [] shapes = new Shape[20];
    MyPanel(){
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int x = rand.nextInt(10, 400);
            int y = rand.nextInt(10, 400);
            if(rand.nextBoolean()){
                shapes[i] = new Circle(x, y, rand.nextInt(50, 200), color);
            } else{
                shapes[i] = new Rectangle(x, y, rand.nextInt(50, 200), rand.nextInt(50), color);
            }
        }
    }
    public void paintComponent(Graphics g) {
        for(Shape s: shapes){
            s.draw(g);
        }
    }
}

abstract class Shape {
    Color color;
    int x, y;

    public Shape(int x, int y, Color color) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    public int radius;

    public Circle(int x, int y, int radius, Color color){
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, radius, radius);
    }
}

class Rectangle extends Shape {
    public int width, height;

    public Rectangle(int x, int y, int width, int length, Color color){
        super(x, y, color);
        this.width = width;
        this.height = length;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawRect(x, y, width, height);
    }
}
