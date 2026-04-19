package swingprograms;

import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Capitals");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "No single capital");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        JList<String> list = new JList<>(countries);

        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String country = list.getSelectedValue();
                System.out.println("Capital of " + country + " is " + capitals.get(country));
            }
        });

        frame.add(new JScrollPane(list));
        frame.setVisible(true);
    }
}