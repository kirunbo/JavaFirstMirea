package ru.mirea.task18.no2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try{
            Scanner sc = new Scanner( System.in);
            System.out.print( "enter an integer ");
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            if(i ==0){
                throw new ArithmeticException("division by zero");
            }
            System.out.println( 2/i );
        }
        catch (NumberFormatException e){
            System.out.println("incorrect input. input must be an integer");
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}

class Main{
    public static void main(String[] args) {
        Exception2 exception = new Exception2();
        exception.exceptionDemo();
    }
}