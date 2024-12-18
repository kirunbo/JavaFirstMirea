package ru.mirea.task15.no3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");

        buttonPanel.add(button1);
        buttonPanel.add(button2);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        JTextArea jta = new JTextArea();
        frame.add(new JScrollPane(jta));

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("file");
        JMenuItem save = new JMenuItem("save");
        JMenuItem exit = new JMenuItem("exit");

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "file is saved");
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(save);
        fileMenu.add(exit);

        JMenu editMenu = new JMenu("edit");
        JMenuItem copy = new JMenuItem("copy");
        JMenuItem paste = new JMenuItem("paste");
        JMenuItem cut = new JMenuItem("cut");

        copy.addActionListener(e -> jta.copy());
        paste.addActionListener(e -> jta.paste());
        cut.addActionListener(e -> jta.cut());

        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.add(cut);

        JMenu helpMenu = new JMenu("help");
        JMenuItem about = new JMenuItem("about");

        about.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "this is menu program");
        });

        helpMenu.add(about);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}