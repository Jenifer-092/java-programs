package swingprograms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Button");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton indiaBtn = new JButton("India");
        JButton srilankaBtn = new JButton("Srilanka");
        JLabel label = new JLabel("Press a button");

        indiaBtn.addActionListener(e -> label.setText("India is pressed"));
        srilankaBtn.addActionListener(e -> label.setText("Srilanka is pressed"));

        frame.add(indiaBtn);
        frame.add(srilankaBtn);
        frame.add(label);

        frame.setVisible(true);
    }
}