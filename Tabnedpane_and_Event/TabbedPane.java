package Tabnedpane_and_Event;

import javax.swing.*;
import java.awt.*;

public class TabbedPane {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("TabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create two panels
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("This is panel 1"));
        panel1.setBackground(Color.RED);

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("This is panel 2"));
        panel2.setBackground(Color.GREEN);

        // Add the panels to the tabbed pane
        tabbedPane.addTab("Panel 1", panel1);
        tabbedPane.addTab("Panel 2", panel2);

        // Add the tabbed pane to the frame
        frame.getContentPane().add(tabbedPane);

        // Set the frame size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}