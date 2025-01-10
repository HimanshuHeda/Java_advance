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

    }
}

public class swings2 {
    public static void main(String[] args) {
        new swing_example();
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
