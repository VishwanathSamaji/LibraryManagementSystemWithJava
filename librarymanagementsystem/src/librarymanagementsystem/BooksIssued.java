// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.GridBagConstraints;

public class BooksIssued implements Gui
{
    int value;
    int i;
    int k;
    int found;
    
    BooksIssued() {
        this.value = 0;
        this.gui();
    }
    
    @Override
    public void gui() {
        final GridBagConstraints c = new GridBagConstraints();
        final JRadioButton s = new JRadioButton("Student");
        final JRadioButton f = new JRadioButton("Faculty");
        final ButtonGroup g = new ButtonGroup();
        c.insets = new Insets(20, 20, 20, 20);
        (BooksIssued.p[8] = new JPanel(new GridBagLayout())).setBackground(Color.green);
        BooksIssued.l[3] = new JLabel("Name or Id");
        BooksIssued.l[4] = new JLabel("Type ");
        BooksIssued.t[2] = new JTextField("");
        BooksIssued.t[3] = new JTextField("");
        BooksIssued.b[1] = new JButton("Search");
        c.gridx = 0;
        c.gridy = 0;
        BooksIssued.p[8].add(BooksIssued.l[3], c);
        c.gridx = 1;
        c.gridy = 0;
        BooksIssued.p[8].add(BooksIssued.t[2], c);
        c.gridx = 0;
        c.gridy = 1;
        BooksIssued.p[8].add(BooksIssued.l[4], c);
        c.gridx = 1;
        c.gridy = 1;
        BooksIssued.p[8].add(s, c);
        g.add(s);
        c.gridx = 1;
        c.gridy = 2;
        BooksIssued.p[8].add(f, c);
        g.add(f);
        c.gridx = 1;
        c.gridy = 3;
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                BooksIssued.this.value = 1;
            }
        });
        f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                BooksIssued.this.value = 2;
            }
        });
        BooksIssued.p[8].add(BooksIssued.b[1], c);
        BooksIssued.b[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                if (BooksIssued.this.value == 0 || Gui.t[2].getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "EMPTY FIELD");
                    Gui.j.remove(Gui.p[8]);
                    final Dashboard dashboard = new Dashboard();
                }
                else {
                    if (BooksIssued.this.value == 1) {
                        if (Gui.d.sno != -1) {
                            BooksIssued.this.i = 0;
                            while (BooksIssued.this.i <= Gui.d.sno) {
                                if (Gui.d.s[BooksIssued.this.i].name.equals(Gui.t[2].getText()) || Gui.d.s[BooksIssued.this.i].userId.equals(Gui.t[2].getText())) {
                                    BooksIssued.this.found = 1;
                                    if (Gui.d.s[BooksIssued.this.i].temp != -1) {
                                        Gui.j.remove(Gui.p[8]);
                                        final BooksIssuedList list = new BooksIssuedList(BooksIssued.this.i, BooksIssued.this.value);
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null, "NO BOOK ISSUED");
                                        Gui.j.remove(Gui.p[8]);
                                        final Dashboard dashboard2 = new Dashboard();
                                    }
                                }
                                final BooksIssued this$0 = BooksIssued.this;
                                ++this$0.i;
                            }
                            if (BooksIssued.this.found == 0) {
                                JOptionPane.showMessageDialog(null, " STUDENT DETAILS NOT FOUND");
                                Gui.j.remove(Gui.p[8]);
                                final Dashboard dashboard3 = new Dashboard();
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, " NO STUDENT MEMBER AVAILABLE ");
                            Gui.j.remove(Gui.p[8]);
                            final Dashboard dashboard4 = new Dashboard();
                        }
                    }
                    BooksIssued.this.found = 0;
                    if (BooksIssued.this.value == 2) {
                        if (Gui.d.fno != -1) {
                            BooksIssued.this.i = 0;
                            while (BooksIssued.this.i <= Gui.d.fno) {
                                if (Gui.d.f[BooksIssued.this.i].name.equals(Gui.t[2].getText()) || Gui.d.f[BooksIssued.this.i].userId.equals(Gui.t[2].getText())) {
                                    BooksIssued.this.found = 1;
                                    if (Gui.d.f[BooksIssued.this.i].temp != -1) {
                                        Gui.j.remove(Gui.p[8]);
                                        final BooksIssuedList list2 = new BooksIssuedList(BooksIssued.this.i, BooksIssued.this.value);
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null, "NO BOOK ISSUED");
                                        Gui.j.remove(Gui.p[8]);
                                        final Dashboard dashboard5 = new Dashboard();
                                    }
                                }
                                final BooksIssued this$2 = BooksIssued.this;
                                ++this$2.i;
                            }
                            if (BooksIssued.this.found == 0) {
                                JOptionPane.showMessageDialog(null, " FACULTY DETAILS NOT FOUND");
                                Gui.j.remove(Gui.p[8]);
                                final Dashboard dashboard6 = new Dashboard();
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, " NO FACULTY MEMBER AVAILABLE ");
                            Gui.j.remove(Gui.p[8]);
                            final Dashboard dashboard7 = new Dashboard();
                        }
                    }
                }
            }
        });
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
        BooksIssued.l[3].setOpaque(true);
        BooksIssued.l[3].setHorizontalAlignment(0);
        BooksIssued.l[3].setBackground(Color.DARK_GRAY);
        BooksIssued.l[3].setPreferredSize(new Dimension(300, 40));
        BooksIssued.l[3].setFont(new Font("Arial", 1, 20));
        BooksIssued.l[3].setForeground(Color.green);
        BooksIssued.l[4].setOpaque(true);
        BooksIssued.l[4].setHorizontalAlignment(0);
        BooksIssued.l[4].setBackground(Color.DARK_GRAY);
        BooksIssued.l[4].setPreferredSize(new Dimension(300, 40));
        BooksIssued.l[4].setFont(new Font("Arial", 1, 20));
        BooksIssued.l[4].setForeground(Color.green);
        BooksIssued.t[2].setHorizontalAlignment(0);
        BooksIssued.t[2].setPreferredSize(new Dimension(400, 40));
        BooksIssued.t[2].setFont(new Font("Arial", 1, 20));
        BooksIssued.t[2].setForeground(Color.darkGray);
        BooksIssued.b[1].setBackground(Color.YELLOW);
        BooksIssued.b[1].setPreferredSize(new Dimension(400, 40));
        BooksIssued.b[1].setFont(new Font("Arial", 1, 20));
        BooksIssued.b[1].setForeground(Color.darkGray);
        BooksIssued.j.add(BooksIssued.p[8]);
        BooksIssued.j.setVisible(true);
        BooksIssued.j.setExtendedState(6);
        BooksIssued.j.setDefaultCloseOperation(3);
    }
}
