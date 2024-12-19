package ru.mirea.task16.no3;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PasswordCheckApp extends JFrame {
    private JTextField serviceField;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public PasswordCheckApp() {
        setTitle("password check");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel serviceLabel = new JLabel("service:");
        serviceField = new JTextField();

        JLabel usernameLabel = new JLabel("user name:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("password:");
        passwordField = new JPasswordField();

        JButton checkButton = new JButton("check");

        add(serviceLabel);
        add(serviceField);
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(checkButton);

        checkButton.addActionListener(e -> checkCredentials());

        setVisible(true);
    }

    private void checkCredentials() {
        String service = serviceField.getText();
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (service.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "please fill in all fields", "error", JOptionPane.ERROR_MESSAGE);
        } else {
            if(new Random().nextBoolean()){
                JOptionPane.showMessageDialog(this, "login is successful:\n" +
                        "service: " + service +
                        "\nuser name: " + username +
                        "\npassword: " + password,
                        "success", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(this, "user name or password are incorrect:\n" +
                                "service: " + service +
                                "\nuser name: " + username +
                                "\npassword: " + password,
                        "access denied", JOptionPane.CANCEL_OPTION);
            }

        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PasswordCheckApp::new);
    }
}