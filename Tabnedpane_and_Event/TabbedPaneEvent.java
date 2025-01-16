package Tabnedpane_and_Event;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class TabbedPaneEvent {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("TabbedPane Event Example");
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

        // Add a change listener to the tabbed pane
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                System.out.println("Selected tab: " + selectedIndex);
            }
        });

        // Add the tabbed pane to the frame
        frame.getContentPane().add(tabbedPane);

        // Set the frame size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}