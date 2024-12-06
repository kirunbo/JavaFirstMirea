package ru.mirea.task6.no1;

public interface Movable {
    void moveRight();
    void moveLeft();
    void moveUp();
    void moveDown();
}

class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "the point is in ( " + this.x + " : " + this.y + " ) coordinates\n" +
                "xSpeed equals " + xSpeed + "\n" +
                "ySpeed equals " + ySpeed + "\n";
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveUp() {
        this.y += ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "the center is in ( " + center.x + " : " + center.y + " ) coordinates\n" +
                "radius equals " + this.radius + "\n" +
                "xSpeed equals " + center.xSpeed + "\n" +
                "ySpeed equals " + center.ySpeed + "\n";
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }
}

class Main{
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        MovableCircle circle = new MovableCircle(0, 0, 2, 3, 2);
        point.moveDown();
        point.moveLeft();
        System.out.println(point.toString());
        circle.moveRight();
        circle.moveUp();
        System.out.println(circle.toString());
    }
}
