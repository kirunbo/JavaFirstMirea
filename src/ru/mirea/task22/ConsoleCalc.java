package ru.mirea.task22;

import java.util.Stack;
import java.util.Scanner;

public class ConsoleCalc {
    public static double evaluate(String expression) {
        String[] tokens = expression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double b = stack.pop();
                double a = stack.pop();
                double result = performOperation(a, b, token);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double performOperation(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException("division by zero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("unknown operator: " + operator);
        }
    }

    public static void main(String[] args) {
        System.out.println("input the equation with spaces: ");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        double result = evaluate(expression);
        System.out.println("result: " + result);
    }
}
