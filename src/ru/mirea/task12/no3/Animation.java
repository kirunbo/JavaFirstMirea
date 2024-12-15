package ru.mirea.task12.no3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Animation extends JPanel implements ActionListener{
    public static void main(String[] args) throws IOException {
        String imagePath = args[0];
        JFrame frame = new JFrame("Animation");
        Animation animationPanel = new Animation(imagePath);
        frame.add(animationPanel);
        frame.setSize(235, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    BufferedImage image;
    int height = 500;
    int width = 235;
    int currentFrame = 0;
    Timer timer = new Timer(150, this);

    Animation(String imagePath) throws IOException {
        image = ImageIO.read(new File(imagePath));
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentFrame++;
        if(currentFrame >= (image.getWidth()/width * image.getHeight()/height)){
            currentFrame = 0;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(image != null){
            int x = (currentFrame % (image.getWidth()/width)) * width;
            int y = (currentFrame % (image.getHeight()/height)) * height;

            g.drawImage(image, 0, 0,
                    0 + width, 0 + height,
                    x, y, x + width, y + height, null);
        }
    }
}