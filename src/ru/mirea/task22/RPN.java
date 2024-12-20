package ru.mirea.task22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class RPN extends JFrame {
    JTextField result = new JTextField();
    JButton[] numberButtons = new JButton[10];
    JButton dotButton = new JButton(".");
    JButton addButton = new JButton("+");
    JButton subButton = new JButton("-");
    JButton multButton = new JButton("*");
    JButton divButton = new JButton("/");
    JButton resButton = new JButton("=");
    JButton spaceButton = new JButton(" ");
    JPanel pnl = new JPanel(new GridLayout(4, 1));
    JPanel panel = new JPanel(new GridLayout(4, 4, 10, 10));
    JPanel pnl2 = new JPanel(new GridLayout(1, 1));

    RPN() {
        super("RPN Calculator");
        setLayout(new FlowLayout());
        result.setHorizontalAlignment(JTextField.CENTER);
        pnl.add(result, BorderLayout.CENTER);
        result.setPreferredSize(new Dimension(400, 100));

        pnl2.add(spaceButton);
        spaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                result.setText(result.getText() + " ");
            }
        });

        for (int i = 0; i < 10; i++) {
            int index = i;
            numberButtons[i] = new JButton(String.valueOf(i));
            panel.add(numberButtons[i]);
            numberButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    result.setText(result.getText() + index);
                }
            });
        }

        panel.add(dotButton);
        dotButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                result.setText(result.getText() + ".");
            }
        });

        panel.add(addButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                result.setText(result.getText() + "+");
            }
        });

        panel.add(subButton);
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                result.setText(result.getText() + "-");
            }
        });

        panel.add(multButton);
        multButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                result.setText(result.getText() + "*");
            }
        });

        panel.add(divButton);
        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                result.setText(result.getText() + "/");
            }
        });

        panel.add(resButton);
        resButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    String expression = result.getText().trim();
                    double result = evaluate(expression);
                    JOptionPane.showMessageDialog(null, "Result = " + result, "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
        });

        pnl.add(panel, BorderLayout.CENTER);
        pnl.add(pnl2, BorderLayout.SOUTH);
        add(pnl);
        setSize(450, 350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public double evaluate(String expression) {
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

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private double performOperation(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException("Can not divide by zero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }

    public static void main(String[] args) {
        new RPN();
    }
}