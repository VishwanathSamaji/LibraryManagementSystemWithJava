// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

import javax.swing.AbstractButton;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JOptionPane;
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
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.GridBagConstraints;

public class NewMember implements Gui
{
    int value;
    
    NewMember() {
        this.value = 0;
        this.gui();
    }
    
    @Override
    public void gui() {
        final GridBagConstraints c = new GridBagConstraints();
        final JRadioButton s = new JRadioButton("Student");
        final JRadioButton f = new JRadioButton("Faculty");
        final ButtonGroup g = new ButtonGroup();
        final JPasswordField pwd = new JPasswordField();
        c.insets = new Insets(20, 20, 20, 20);
        (NewMember.p[6] = new JPanel(new GridBagLayout())).setBackground(Color.green);
        NewMember.l[3] = new JLabel("Name :");
        NewMember.l[4] = new JLabel("Id :");
        NewMember.l[5] = new JLabel("Password :");
        NewMember.l[6] = new JLabel("EmailId ");
        NewMember.t[2] = new JTextField("");
        NewMember.t[3] = new JTextField("");
        NewMember.t[5] = new JTextField("");
        NewMember.b[9] = new JButton("Submit");
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                NewMember.this.value = 1;
            }
        });
        f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                NewMember.this.value = 2;
            }
        });
        NewMember.b[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                if (NewMember.this.value == 0 || Gui.t[2].getText().equals("") || Gui.t[3].getText().equals("") || pwd.getText().equals("") || Gui.t[5].getText().equals("")) {
                    JOptionPane.showMessageDialog(null, " EMPTY FIELD !!! ");
                }
                else {
                    if (NewMember.this.value == 1) {
                        final LibraryManagementSystem d = Gui.d;
                        ++d.sno;
                        Gui.d.s[Gui.d.sno] = new Student(Gui.t[2].getText(), Gui.t[3].getText(), pwd.getText(), Gui.t[5].getText());
                    }
                    else {
                        final LibraryManagementSystem d2 = Gui.d;
                        ++d2.fno;
                        Gui.d.f[Gui.d.fno] = new Faculty(Gui.t[2].getText(), Gui.t[3].getText(), pwd.getText(), Gui.t[5].getText());
                    }
                    JOptionPane.showMessageDialog(null, " NEW MEMBER  ADDED SUCCESSFULLY ");
                    Gui.j.remove(Gui.p[6]);
                    final Dashboard dashboard = new Dashboard();
                }
            }
        });
        NewMember.l[3].setOpaque(true);
        NewMember.l[3].setHorizontalAlignment(0);
        NewMember.l[3].setBackground(Color.DARK_GRAY);
        NewMember.l[3].setPreferredSize(new Dimension(300, 40));
        NewMember.l[3].setFont(new Font("Arial", 1, 20));
        NewMember.l[3].setForeground(Color.green);
        NewMember.t[2].setHorizontalAlignment(0);
        NewMember.t[2].setPreferredSize(new Dimension(400, 40));
        NewMember.t[2].setFont(new Font("Arial", 1, 20));
        NewMember.t[2].setForeground(Color.darkGray);
        NewMember.l[4].setOpaque(true);
        NewMember.l[4].setHorizontalAlignment(0);
        NewMember.l[4].setBackground(Color.DARK_GRAY);
        NewMember.l[4].setPreferredSize(new Dimension(300, 40));
        NewMember.l[4].setFont(new Font("Arial", 1, 20));
        NewMember.l[4].setForeground(Color.green);
        NewMember.t[3].setHorizontalAlignment(0);
        NewMember.t[3].setPreferredSize(new Dimension(400, 40));
        NewMember.t[3].setFont(new Font("Arial", 1, 20));
        NewMember.t[3].setForeground(Color.darkGray);
        NewMember.l[5].setOpaque(true);
        NewMember.l[5].setHorizontalAlignment(0);
        NewMember.l[5].setBackground(Color.DARK_GRAY);
        NewMember.l[5].setPreferredSize(new Dimension(300, 40));
        NewMember.l[5].setFont(new Font("Arial", 1, 20));
        NewMember.l[5].setForeground(Color.green);
        pwd.setHorizontalAlignment(0);
        pwd.setPreferredSize(new Dimension(400, 40));
        pwd.setFont(new Font("Arial", 1, 20));
        pwd.setForeground(Color.darkGray);
        NewMember.l[6].setOpaque(true);
        NewMember.l[6].setHorizontalAlignment(0);
        NewMember.l[6].setBackground(Color.DARK_GRAY);
        NewMember.l[6].setPreferredSize(new Dimension(300, 40));
        NewMember.l[6].setFont(new Font("Arial", 1, 20));
        NewMember.l[6].setForeground(Color.green);
        NewMember.t[5].setHorizontalAlignment(0);
        NewMember.t[5].setPreferredSize(new Dimension(400, 40));
        NewMember.t[5].setFont(new Font("Arial", 1, 20));
        NewMember.t[5].setForeground(Color.darkGray);
        NewMember.b[9].setBackground(Color.YELLOW);
        NewMember.b[9].setPreferredSize(new Dimension(400, 50));
        NewMember.b[9].setFont(new Font("Arial", 1, 20));
        NewMember.b[9].setForeground(Color.darkGray);
        (NewMember.l[7] = new JLabel("Member Type :")).setOpaque(true);
        NewMember.l[7].setHorizontalAlignment(0);
        NewMember.l[7].setBackground(Color.DARK_GRAY);
        NewMember.l[7].setPreferredSize(new Dimension(300, 40));
        NewMember.l[7].setFont(new Font("Arial", 1, 20));
        NewMember.l[7].setForeground(Color.green);
        s.setHorizontalAlignment(0);
        s.setBackground(Color.ORANGE);
        s.setPreferredSize(new Dimension(400, 40));
        s.setFont(new Font("Arial", 1, 20));
        s.setForeground(Color.darkGray);
        f.setHorizontalAlignment(0);
        f.setBackground(Color.ORANGE);
        f.setPreferredSize(new Dimension(400, 40));
        f.setFont(new Font("Arial", 1, 20));
        f.setForeground(Color.darkGray);
        c.gridx = 0;
        c.gridy = 0;
        NewMember.p[6].add(NewMember.l[3], c);
        c.gridx = 1;
        c.gridy = 0;
        NewMember.p[6].add(NewMember.t[2], c);
        c.gridx = 0;
        c.gridy = 1;
        NewMember.p[6].add(NewMember.l[4], c);
        c.gridx = 1;
        c.gridy = 1;
        NewMember.p[6].add(NewMember.t[3], c);
        c.gridx = 0;
        c.gridy = 2;
        NewMember.p[6].add(NewMember.l[5], c);
        c.gridx = 1;
        c.gridy = 2;
        NewMember.p[6].add(pwd, c);
        c.gridx = 0;
        c.gridy = 3;
        NewMember.p[6].add(NewMember.l[6], c);
        c.gridx = 1;
        c.gridy = 3;
        NewMember.p[6].add(NewMember.t[5], c);
        c.gridx = 0;
        c.gridy = 4;
        NewMember.p[6].add(NewMember.l[7], c);
        c.gridx = 1;
        c.gridy = 4;
        NewMember.p[6].add(s, c);
        g.add(s);
        c.gridx = 1;
        c.gridy = 5;
        NewMember.p[6].add(f, c);
        g.add(f);
        c.gridx = 1;
        c.gridy = 6;
        NewMember.p[6].add(NewMember.b[9], c);
        NewMember.j.add(NewMember.p[6]);
        NewMember.j.setVisible(true);
        NewMember.j.setExtendedState(6);
        NewMember.j.setDefaultCloseOperation(3);
    }
}
