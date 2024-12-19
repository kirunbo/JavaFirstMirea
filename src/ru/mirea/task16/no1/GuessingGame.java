package ru.mirea.task16.no1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class GuessingGame extends JFrame {
    private JTextField field;
    private JButton button;
    private JLabel label;
    private int randomNumber;
    private int attempts;

    public GuessingGame() {
        randomNumber = new Random().nextInt(0,21);
        attempts = 0;

        setTitle("guessing game");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        field = new JTextField(10);
        button = new JButton("guess");
        inputPanel.add(field);
        inputPanel.add(button);

        label = new JLabel("guess the number between 0 and 20");
        label.setBounds(50, 80, 200, 100);

        add(label, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.CENTER);

        button.addActionListener(e -> checkGuess());

//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                if (e.getSource() instanceof Component) {
//                    Component source = (Component) e.getSource();
//                    if (source.getBounds().contains(e.getX(), e.getY())) {
//                        if (source == GuessingGame.this) {
//                            showMessage("Добро пожаловать в ЦАО");
//                        }
//                    }
//                }
//            }
//        });
//
        createBorderAreas();
        setVisible(true);
    }

    private void createBorderAreas() {
        JPanel northPanel = new JPanel();
        northPanel.setPreferredSize(new Dimension(200, 50));
//        northPanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                showMessage("Добро пожаловать в САО");
//            }
//        });

        JPanel southPanel = new JPanel();
        southPanel.setPreferredSize(new Dimension(200, 50));
//        southPanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                showMessage("Добро пожаловать ЮАО");
//            }
//        });

        JPanel eastPanel = new JPanel();
        eastPanel.setPreferredSize(new Dimension(50, 100));
//        eastPanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                showMessage("Добро пожаловать в ВАО");
//            }
//        });

        JPanel westPanel = new JPanel();
        westPanel.setPreferredSize(new Dimension(50, 100));
//        westPanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                showMessage("Добро пожаловать в ЗАО");
//            }
//        });

        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        add(eastPanel, BorderLayout.EAST);
        add(westPanel, BorderLayout.WEST);
    }

    private void checkGuess() {
        String guess = field.getText();
        try {
            int guessedNumber = Integer.parseInt(guess);
            attempts++;
            if (guessedNumber == randomNumber) {
                showMessage("you've guessed!");
                System.exit(0);
            } else if (attempts >= 3) {
                showMessage("sorry, you've lost. the number was " + randomNumber + ".");
                System.exit(0);
            } else {
                String hint = guessedNumber < randomNumber ? "larger number" : "smaller number";
                label.setText("try " + hint + ". attempts: " + attempts);
            }
        } catch (NumberFormatException e) {
            label.setText("input a correct number.");
        }
        field.setText("");
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GuessingGame::new);
    }
}