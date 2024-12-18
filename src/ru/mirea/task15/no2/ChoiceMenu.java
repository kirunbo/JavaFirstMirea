package ru.mirea.task15.no2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("countries");
        String[] countries = {"Australia", "China", "England", "Russia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);

        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countryInfo((String) countryComboBox.getSelectedItem());
            }
        });

        frame.add(countryComboBox);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void countryInfo(String country){
        switch (country){
            case "Australia":
                JOptionPane.showMessageDialog(null, "The smallest continent and one of the largest countries on Earth, lying between the Pacific and Indian oceans in the Southern Hemisphere.\nAustralia’s capital is Canberra.", "Australia", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "China":
                JOptionPane.showMessageDialog(null, "China is a country of East Asia.\nIt is the largest of all Asian countries and has one of the largest populations of any country in the world.","China", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "England":
                JOptionPane.showMessageDialog(null, "Laced by great rivers and small streams, England is a fertile land,\nand the generosity of its soil has supported a thriving agricultural economy for millennia.", "England", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Russia":
                JOptionPane.showMessageDialog(null, "Russia is a land of superlatives.\nBy far the world's largest country, it covers nearly twice the territory of Canada, the second largest.", "Russia", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
