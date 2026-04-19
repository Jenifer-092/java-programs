package swingprograms;

import javax.swing.*;
import java.awt.*;

public class ImageButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Button");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        JButton clockBtn = new JButton("Digital Clock", clockIcon);
        JButton hourglassBtn = new JButton("Hour Glass", hourglassIcon);

        JLabel label = new JLabel("Click a button");

        clockBtn.addActionListener(e -> label.setText("Digital Clock is pressed"));
        hourglassBtn.addActionListener(e -> label.setText("Hour Glass is pressed"));

        frame.add(clockBtn);
        frame.add(hourglassBtn);
        frame.add(label);

        frame.setVisible(true);
    }
}