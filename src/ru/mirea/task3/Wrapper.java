package ru.mirea.task3;

import java.util.Random;

public class Wrapper {
    public static void main(String[] args) {
        Double d = Double.valueOf(3.14);
        Double ds = Double.parseDouble("42.54");
        String sd = Double.toString(d);
        System.out.printf("%.2f %.2f %s",d, ds, sd);
        System.out.println();
        Random rand = new Random();
        Double r = rand.nextDouble(10);
        double double_r = r;
        int int_r = (int) double_r;
        long long_r = (long) double_r;
        float float_r = (float) double_r;
        byte byte_r = (byte) double_r;
        short short_r = (short) double_r;
        System.out.printf("%s %s %s %s %s %s %s",r, double_r, int_r, long_r,
                float_r, byte_r, short_r);
    }
}
