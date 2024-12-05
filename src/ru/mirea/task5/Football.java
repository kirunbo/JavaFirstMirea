package ru.mirea.task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame{
    private int acm = 0;
    private int rm = 0;
    private int time = 0;
    Timer timer;
    JLabel result = new JLabel("Result: 0 X 0", JLabel.LEFT);
    JLabel scorer = new JLabel("Last scorer: N/A", JLabel.CENTER);
    JLabel winner = new JLabel("Winner: DRAW", JLabel.RIGHT);

    public Football(){


        this.setTitle("football");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);

        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setPreferredSize(new Dimension(300, 200));

        JButton ac_milan_button = new JButton("AC Milan");
        JButton real_madrid_button = new JButton("Real Madrid");
        ac_milan_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acm++;
                resultsUpdate("Last Scorer: AC Milan");
            }
        });
        real_madrid_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rm++;
                resultsUpdate("Last Scorer: Real Madrid");
            }
        });

        panel.add(ac_milan_button);
        panel.add(real_madrid_button);
        panel.add(result);
        panel.add(scorer);
        panel.add(winner);
        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time++;
                if(time>=5){
                    timer.stop();
                    ac_milan_button.setEnabled(false);
                    real_madrid_button.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "time's up! " + winner.getText());
                }
            }
        });
        timer.start();
    }

    private void resultsUpdate(String lastScorer){
        result.setText("Result: " + acm + " X " + rm);
        scorer.setText(lastScorer);
        if (acm > rm){
            winner.setText("Winner: AC Milan");
        } else if (rm > acm) {
            winner.setText("Winner: Real Madrid");
        } else{
            winner.setText("Winner: DRAW");
        }
    }
}

class Main{
    public static void main(String[] args) {
        new Football();
    }
}
