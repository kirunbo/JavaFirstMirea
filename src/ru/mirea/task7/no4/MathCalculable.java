package ru.mirea.task7.no4;

public interface MathCalculable {
    double pow(double base, double power);
    double imAbs(double re, double im);

    double pi = 3.141592653589793;
}

class MathFunc implements MathCalculable {

    @Override
    public double pow(double base, double power) {
        return Math.pow(base, power);
    }

    @Override
    public double imAbs(double re, double im) {
        return Math.sqrt(re * re + im * im);
    }

    public double circumference(double radius){
        return 2 * pi * radius;
    }
}

class Main{
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        System.out.println("4.5 in power of pi = " + mathFunc.pow(4.5, MathFunc.pi));
        System.out.println("modulus of complex number 23.5 - i*88 = " + mathFunc.imAbs(23.5, 88));
        System.out.println("circumference of a circle with radius = 2 equals " + mathFunc.circumference(2));
    }
}