// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;

public class Login implements Gui
{
    Login() {
        this.gui();
    }
    
    @Override
    public void gui() {
        final GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(30, 30, 30, 30);
        (Login.p[0] = new JPanel(new GridBagLayout())).setBackground(Color.green);
        Login.l[0] = new JLabel("Librarian Id");
        Login.l[1] = new JLabel("Password");
        Login.t[0] = new JTextField();
        (Login.b[0] = new JButton("Login")).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (Gui.t[0].getText().equals("lib") && Gui.pwd.getText().equals("123")) {
                    Gui.j.remove(Gui.p[0]);
                    final Dashboard dashboard = new Dashboard();
                }
                else {
                    JOptionPane.showMessageDialog(null, "ACCESS DENIED!!! TRY AGAIN");
                }
            }
        });
        Login.l[0].setOpaque(true);
        Login.l[0].setHorizontalAlignment(0);
        Login.l[0].setBackground(Color.DARK_GRAY);
        Login.l[0].setPreferredSize(new Dimension(150, 40));
        Login.l[0].setFont(new Font("Arial", 1, 20));
        Login.l[0].setForeground(Color.green);
        Login.l[1].setOpaque(true);
        Login.l[1].setHorizontalAlignment(0);
        Login.l[1].setBackground(Color.DARK_GRAY);
        Login.l[1].setPreferredSize(new Dimension(150, 40));
        Login.l[1].setFont(new Font("Arial", 1, 20));
        Login.l[1].setForeground(Color.green);
        Login.t[0].setHorizontalAlignment(0);
        Login.t[0].setPreferredSize(new Dimension(200, 40));
        Login.t[0].setFont(new Font("Arial", 1, 20));
        Login.t[0].setForeground(Color.darkGray);
        Login.pwd.setHorizontalAlignment(0);
        Login.pwd.setPreferredSize(new Dimension(200, 40));
        Login.pwd.setFont(new Font("Arial", 1, 20));
        Login.pwd.setForeground(Color.darkGray);
        Login.b[0].setBackground(Color.YELLOW);
        Login.b[0].setPreferredSize(new Dimension(160, 40));
        Login.b[0].setFont(new Font("Arial", 1, 20));
        Login.b[0].setForeground(Color.darkGray);
        c.gridx = 0;
        c.gridy = 2;
        Login.p[0].add(Login.l[0], c);
        c.gridx = 1;
        c.gridy = 2;
        Login.p[0].add(Login.t[0], c);
        c.gridx = 0;
        c.gridy = 3;
        Login.p[0].add(Login.l[1], c);
        c.gridx = 1;
        c.gridy = 3;
        Login.p[0].add(Login.pwd, c);
        c.gridx = 1;
        c.gridy = 4;
        Login.p[0].add(Login.b[0], c);
        Login.j.add(Login.p[0]);
        Login.j.setExtendedState(6);
        Login.j.setVisible(true);
        Login.j.setDefaultCloseOperation(3);
    }
}
