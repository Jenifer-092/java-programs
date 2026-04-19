package swingprograms;

import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming");
        label.setFont(new Font("Arial", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}