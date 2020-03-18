// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

public interface Gui
{
    public static final JFrame j = new JFrame("Library Management System");
    public static final JPanel[] p = new JPanel[20];
    public static final JButton[] b = new JButton[20];
    public static final JLabel[] l = new JLabel[500];
    public static final JTextField[] t = new JTextField[20];
    public static final JPasswordField pwd = new JPasswordField();
    public static final LibraryManagementSystem d = new LibraryManagementSystem();
    
    void gui();
}
