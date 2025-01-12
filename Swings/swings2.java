package Swings;

import javax.swing.*;
import java.awt.*;

class SwingExample {
    SwingExample() {
        // Create the JFrame
        JFrame jf = new JFrame("My First GUI Program");
        jf.setLayout(new FlowLayout(FlowLayout.CENTER)); // Set layout manager for the frame

        // Create and configure components
        JLabel jl = new JLabel("Hyeee Buddies");
        JTextField tf = new JTextField(10); // Set preferred width
        JTextArea ta = new JTextArea(5, 15); // Set rows and columns
        JButton jb = new JButton("Click Me"); // Set button text

        // Add components to the frame
        jf.add(jl);
        jf.add(tf);
        jf.add(new JScrollPane(ta)); // Add JTextArea inside a JScrollPane
        jf.add(jb);

        // Configure the frame
        jf.setSize(300, 250); // Set frame size
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true); // Make the frame visible
    }
}

public class swings2 {
    public static void main(String[] args) {
        // Use the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> new SwingExample());
    }
}




/*
package Swings;

import javax.swing.*;
import java.awt.*;

class swing_example{
    swing_example(){
        JFrame jf = new JFrame("My First GUI Program");  
        
        JLabel jl = new JLabel();

        JTextField tf = new JTextField(5);
        
        JTextArea ta = new JTextArea(5, 5);

        JButton jb = new JButton();

        jb.setLayout(new FlowLayout(FlowLayout.CENTER));
        jf.setVisible(true);
        jf.setBounds(100,100,275,225);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jl.setText("Hyeee Buddies");
        
        jf.add(jl);
        jf.add(tf);
        jf.add(ta);
        jf.add(jb);

    }
}

public class swings2 {
    public static void main(String[] args) {
        swing_example eg = new swing_example();
    }
}

// Delegation event methods
// sources           Listners
// JButton           ActionListener
// JCheckBox         ItemListener
// JRadioButton      ItemListener
// JComboBox         ItemListener
// JList             ListSelectionListener
// JSlider           ChangeListener
// JSpinner          ChangeListener
// JTabbedPane       ChangeListener
// JTable            ListSelectionListener
// JTree             TreeSelectionListener
// JMenu             ActionListener
// JMenuItem         ActionListener
// JPopupMenu        ActionListener
// JMenuBar          ActionListener
// JScrollBar        AdjustmentListener
// JScrollBar        ChangeListener
// JScrollBar        ActionListener
// JScrollBar        ItemListener
// JScrollBar        TextListener
// JScrollBar        MouseListener
// JScrollBar        MouseMotionListener
// JScrollBar        MouseWheelListener
// JScrollBar        KeyListener
// JScrollBar        FocusListener
// JScrollBar        WindowListener
// JScrollBar        ComponentListener
// JScrollBar        ContainerListener
// JScrollBar        HierarchyListener
 */