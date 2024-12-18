package ru.mirea.task15.no1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton("add");
    JButton button2 = new JButton("subtract");
    JButton button3 = new JButton("divide");
    JButton button4 = new JButton("multiply");
    Calculator()
    {
        super("Calculator");
        setLayout(new FlowLayout());
        setSize(200,210);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JLabel("1st number"));
        add(jta1);
        add(new JLabel("2nd number"));
        add(jta2);
        add(button);
        add(button2);
        add(button3);
        add(button4);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "result: " + (x1 + x2), "addition", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "incorrect input", "error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "result: " + (x1 - x2), "subtraction", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "incorrect input", "error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "result: " + (x1 / x2), "division", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "incorrect input", "error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "result: " + (x1 * x2), "multiplication", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "incorrect input", "error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
//        {
//            button.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae) {
//            try
//            {
//                    double x1 =
//                            Double.parseDouble(jta1.getText().trim());
//                    double x2 =
//                            Double.parseDouble(jta2.getText().trim());
//                    JOptionPane.showMessageDialog(null, "Result =  " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
//                }
//        catch(Exception e)
//                {
//                    JOptionPane.showMessageDialog(
//                            null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
//                }
//            }
//            });
//        }

//        {
//            button2.addActionListener(new ActionListener(){
//                public void actionPerformed(ActionEvent ae) {
//                    try
//                    {
//                        double x1 =
//                                Double.parseDouble(jta1.getText().trim());
//                        double x2 =
//                                Double.parseDouble(jta2.getText().trim());
//                        JOptionPane.showMessageDialog(null, "Result =  " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
//                    }
//                    catch(Exception e)
//                    {
//                        JOptionPane.showMessageDialog(
//                                null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
//                    }
//                }
//            });
//        }

//        {
//            button3.addActionListener(new ActionListener(){
//                public void actionPerformed(ActionEvent ae) {
//                    try
//                    {
//                        double x1 =
//                                Double.parseDouble(jta1.getText().trim());
//                        double x2 =
//                                Double.parseDouble(jta2.getText().trim());
//                        JOptionPane.showMessageDialog(null, "Result =  " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
//                    }
//                    catch(Exception e)
//                    {
//                        JOptionPane.showMessageDialog(
//                                null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
//                    }
//                }
//            });
//        }

//        {
//            button4.addActionListener(new ActionListener(){
//                public void actionPerformed(ActionEvent ae) {
//                    try
//                    {
//                        double x1 =
//                                Double.parseDouble(jta1.getText().trim());
//                        double x2 =
//                                Double.parseDouble(jta2.getText().trim());
//                        JOptionPane.showMessageDialog(null, "Result =  " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
//                    }
//                    catch(Exception e)
//                    {
//                        JOptionPane.showMessageDialog(
//                                null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
//                    }
//                }
//            });
//        }
    setVisible(true);
    }

    public static void main(String[]args) {
        new Calculator();
    }
}

