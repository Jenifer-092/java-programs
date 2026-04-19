package swingprograms;

import javax.swing.*;
import java.awt.*;

public class ColorTabs {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Tabs");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}