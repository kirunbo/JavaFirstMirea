package ru.mirea.task2;

public class Ball {
    double x = 0.0;
    double y = 0.0;

    Ball(){}

    Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        this.setXY(this.getX() + xDisp, this.getY() + yDisp);
    }

    @Override
    public String toString(){
        return "the ball is in point ( " + this.getX() + " ; " + this.getY() + " )\n";
    }
}

class TestBall{
    public static void main(String[] args) {
        Ball ball = new Ball(2, 4.4);
        System.out.println(ball.toString());
        ball.setX(0);
        System.out.println(ball.toString());
        ball.move(2, 2);
        System.out.println(ball.toString());
    }
}
