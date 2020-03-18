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

public class ReturnBook implements Gui
{
    int value;
    int i;
    int m;
    int n;
    int k;
    int x;
    int found1;
    int found2;
    
    ReturnBook() {
        this.value = 1;
        this.found1 = 0;
        this.found2 = 0;
        this.gui();
    }
    
    @Override
    public void gui() {
        final GridBagConstraints c = new GridBagConstraints();
        final JRadioButton s = new JRadioButton("Student");
        final JRadioButton f = new JRadioButton("Faculty");
        final ButtonGroup g = new ButtonGroup();
        c.insets = new Insets(20, 20, 20, 20);
        (ReturnBook.p[8] = new JPanel(new GridBagLayout())).setBackground(Color.green);
        ReturnBook.l[3] = new JLabel("Name or Id");
        ReturnBook.l[4] = new JLabel("Type ");
        ReturnBook.l[5] = new JLabel("Title or ISBN");
        ReturnBook.l[6] = new JLabel("Member Details Found");
        ReturnBook.t[2] = new JTextField("");
        ReturnBook.t[3] = new JTextField("");
        ReturnBook.b[9] = new JButton("Verify");
        ReturnBook.b[10] = new JButton("Find Book");
        ReturnBook.b[11] = new JButton("RETURN BOOK");
        c.gridx = 0;
        c.gridy = 0;
        ReturnBook.p[8].add(ReturnBook.l[3], c);
        c.gridx = 1;
        c.gridy = 0;
        ReturnBook.p[8].add(ReturnBook.t[2], c);
        c.gridx = 0;
        c.gridy = 1;
        ReturnBook.p[8].add(ReturnBook.l[4], c);
        c.gridx = 1;
        c.gridy = 1;
        ReturnBook.p[8].add(s, c);
        g.add(s);
        c.gridx = 1;
        c.gridy = 2;
        ReturnBook.p[8].add(f, c);
        g.add(f);
        c.gridx = 0;
        c.gridy = 3;
        ReturnBook.p[8].add(ReturnBook.l[5], c);
        c.gridx = 1;
        c.gridy = 3;
        ReturnBook.p[8].add(ReturnBook.t[3], c);
        c.gridx = 1;
        c.gridy = 5;
        ReturnBook.p[8].add(ReturnBook.b[11], c);
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                ReturnBook.this.value = 1;
            }
        });
        f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                ReturnBook.this.value = 2;
            }
        });
        ReturnBook.b[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                if (ReturnBook.this.value == 0 || Gui.t[2].getText().equals("") || Gui.t[3].getText().equals("")) {
                    JOptionPane.showMessageDialog(null, " EMPTY FIELD ");
                }
                else {
                    if (ReturnBook.this.value == 1) {
                        if (Gui.d.sno != -1) {
                            ReturnBook.this.i = 0;
                            while (ReturnBook.this.i <= Gui.d.sno) {
                                if (Gui.d.s[ReturnBook.this.i].name.equals(Gui.t[2].getText()) || Gui.d.s[ReturnBook.this.i].userId.equals(Gui.t[2].getText())) {
                                    ReturnBook.this.found2 = 1;
                                    if (Gui.d.s[ReturnBook.this.i].temp != -1) {
                                        ReturnBook.this.m = 0;
                                        while (ReturnBook.this.m <= Gui.d.bno) {
                                            if (Gui.d.bk[ReturnBook.this.m].title.equals(Gui.t[3].getText()) || Gui.d.bk[ReturnBook.this.m].ISBN.equals(Gui.t[3].getText())) {
                                                ReturnBook.this.found1 = 1;
                                                ReturnBook.this.k = 0;
                                                while (ReturnBook.this.k <= Gui.d.s[ReturnBook.this.i].temp) {
                                                    if (Gui.d.s[ReturnBook.this.i].bookIssuedNo[ReturnBook.this.k] == ReturnBook.this.m) {
                                                        if (ReturnBook.this.k != 5) {
                                                            ReturnBook.this.x = ReturnBook.this.k;
                                                            while (ReturnBook.this.x <= Gui.d.s[ReturnBook.this.i].temp) {
                                                                Gui.d.s[ReturnBook.this.i].bookIssuedNo[ReturnBook.this.x] = Gui.d.s[ReturnBook.this.i].bookIssuedNo[ReturnBook.this.x + 1];
                                                                final ReturnBook this$0 = ReturnBook.this;
                                                                ++this$0.x;
                                                            }
                                                        }
                                                        else {
                                                            Gui.d.s[ReturnBook.this.i].bookIssuedNo[5] = 0;
                                                        }
                                                    }
                                                    final ReturnBook this$2 = ReturnBook.this;
                                                    ++this$2.k;
                                                }
                                                final Student student = Gui.d.s[ReturnBook.this.i];
                                                --student.temp;
                                                JOptionPane.showMessageDialog(null, "BOOK SUCCESSFULLY RETURNED ");
                                                Gui.j.remove(Gui.p[8]);
                                                final Dashboard dashboard = new Dashboard();
                                            }
                                            final ReturnBook this$3 = ReturnBook.this;
                                            ++this$3.m;
                                        }
                                        if (ReturnBook.this.found1 == 0) {
                                            JOptionPane.showMessageDialog(null, " BOOK NOT FOUND !!! ");
                                            Gui.j.remove(Gui.p[8]);
                                            final Dashboard dashboard2 = new Dashboard();
                                        }
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null, " NO BOOK ISSUED !!! ");
                                        Gui.j.remove(Gui.p[8]);
                                        final Dashboard dashboard3 = new Dashboard();
                                    }
                                }
                                final ReturnBook this$4 = ReturnBook.this;
                                ++this$4.i;
                            }
                            if (ReturnBook.this.found2 == 0) {
                                JOptionPane.showMessageDialog(null, " STUDENT DETAILS NOT FOUND ");
                                Gui.j.remove(Gui.p[8]);
                                final Dashboard dashboard4 = new Dashboard();
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, " STUDENT MEMBER NOT AVAILABLE");
                            Gui.j.remove(Gui.p[8]);
                            final Dashboard dashboard5 = new Dashboard();
                        }
                    }
                    ReturnBook.this.found1 = 0;
                    ReturnBook.this.found2 = 0;
                    if (ReturnBook.this.value == 2) {
                        if (Gui.d.fno != -1) {
                            ReturnBook.this.i = 0;
                            while (ReturnBook.this.i <= Gui.d.fno) {
                                if (Gui.d.f[ReturnBook.this.i].name.equals(Gui.t[2].getText()) || Gui.d.f[ReturnBook.this.i].userId.equals(Gui.t[2].getText())) {
                                    ReturnBook.this.found2 = 1;
                                    if (Gui.d.f[ReturnBook.this.i].temp != -1) {
                                        ReturnBook.this.m = 0;
                                        while (ReturnBook.this.m <= Gui.d.bno) {
                                            if (Gui.d.bk[ReturnBook.this.m].title.equals(Gui.t[3].getText()) || Gui.d.bk[ReturnBook.this.m].ISBN.equals(Gui.t[3].getText())) {
                                                ReturnBook.this.found1 = 1;
                                                ReturnBook.this.k = 0;
                                                while (ReturnBook.this.k <= Gui.d.f[ReturnBook.this.i].temp) {
                                                    if (Gui.d.f[ReturnBook.this.i].bookIssuedNo[ReturnBook.this.k] == ReturnBook.this.m) {
                                                        if (ReturnBook.this.k != 5) {
                                                            ReturnBook.this.x = ReturnBook.this.k;
                                                            while (ReturnBook.this.x <= Gui.d.f[ReturnBook.this.i].temp) {
                                                                Gui.d.f[ReturnBook.this.i].bookIssuedNo[ReturnBook.this.x] = Gui.d.f[ReturnBook.this.i].bookIssuedNo[ReturnBook.this.x + 1];
                                                                final ReturnBook this$5 = ReturnBook.this;
                                                                ++this$5.x;
                                                            }
                                                        }
                                                        else {
                                                            Gui.d.f[ReturnBook.this.i].bookIssuedNo[5] = 0;
                                                        }
                                                    }
                                                    final ReturnBook this$6 = ReturnBook.this;
                                                    ++this$6.k;
                                                }
                                                final Faculty faculty = Gui.d.f[ReturnBook.this.i];
                                                --faculty.temp;
                                                JOptionPane.showMessageDialog(null, "BOOK  RETURNED SUCCESSFULLY ");
                                                Gui.j.remove(Gui.p[8]);
                                                final Dashboard dashboard6 = new Dashboard();
                                            }
                                            final ReturnBook this$7 = ReturnBook.this;
                                            ++this$7.m;
                                        }
                                        if (ReturnBook.this.found1 == 0) {
                                            JOptionPane.showMessageDialog(null, " BOOK NOT FOUND !!! ");
                                            Gui.j.remove(Gui.p[8]);
                                            final Dashboard dashboard7 = new Dashboard();
                                        }
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null, " NO BOOK ISSUED !!! ");
                                        Gui.j.remove(Gui.p[8]);
                                        final Dashboard dashboard8 = new Dashboard();
                                    }
                                }
                                final ReturnBook this$8 = ReturnBook.this;
                                ++this$8.i;
                            }
                            if (ReturnBook.this.found2 == 0) {
                                JOptionPane.showMessageDialog(null, " FACULTY DETAILS NOT FOUND ");
                                Gui.j.remove(Gui.p[8]);
                                final Dashboard dashboard9 = new Dashboard();
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, " FACULTY MEMBER NOT AVAILABLE");
                            Gui.j.remove(Gui.p[8]);
                            final Dashboard dashboard10 = new Dashboard();
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
        ReturnBook.l[3].setOpaque(true);
        ReturnBook.l[3].setHorizontalAlignment(0);
        ReturnBook.l[3].setBackground(Color.DARK_GRAY);
        ReturnBook.l[3].setPreferredSize(new Dimension(300, 40));
        ReturnBook.l[3].setFont(new Font("Arial", 1, 20));
        ReturnBook.l[3].setForeground(Color.green);
        ReturnBook.t[2].setHorizontalAlignment(0);
        ReturnBook.t[2].setPreferredSize(new Dimension(400, 40));
        ReturnBook.t[2].setFont(new Font("Arial", 1, 20));
        ReturnBook.t[2].setForeground(Color.darkGray);
        ReturnBook.l[4].setOpaque(true);
        ReturnBook.l[4].setHorizontalAlignment(0);
        ReturnBook.l[4].setBackground(Color.DARK_GRAY);
        ReturnBook.l[4].setPreferredSize(new Dimension(300, 40));
        ReturnBook.l[4].setFont(new Font("Arial", 1, 20));
        ReturnBook.l[4].setForeground(Color.green);
        ReturnBook.t[3].setHorizontalAlignment(0);
        ReturnBook.t[3].setPreferredSize(new Dimension(400, 40));
        ReturnBook.t[3].setFont(new Font("Arial", 1, 20));
        ReturnBook.t[3].setForeground(Color.darkGray);
        ReturnBook.l[5].setOpaque(true);
        ReturnBook.l[5].setHorizontalAlignment(0);
        ReturnBook.l[5].setBackground(Color.DARK_GRAY);
        ReturnBook.l[5].setPreferredSize(new Dimension(300, 40));
        ReturnBook.l[5].setFont(new Font("Arial", 1, 20));
        ReturnBook.l[5].setForeground(Color.green);
        ReturnBook.t[2].setHorizontalAlignment(0);
        ReturnBook.t[2].setPreferredSize(new Dimension(400, 40));
        ReturnBook.t[2].setFont(new Font("Arial", 1, 20));
        ReturnBook.t[2].setForeground(Color.darkGray);
        ReturnBook.l[2].setOpaque(true);
        ReturnBook.l[6].setHorizontalAlignment(0);
        ReturnBook.l[6].setBackground(Color.DARK_GRAY);
        ReturnBook.l[6].setPreferredSize(new Dimension(300, 40));
        ReturnBook.l[6].setFont(new Font("Arial", 1, 20));
        ReturnBook.l[6].setForeground(Color.green);
        ReturnBook.t[3].setHorizontalAlignment(0);
        ReturnBook.t[3].setPreferredSize(new Dimension(400, 40));
        ReturnBook.t[3].setFont(new Font("Arial", 1, 20));
        ReturnBook.t[3].setForeground(Color.darkGray);
        ReturnBook.b[9].setBackground(Color.YELLOW);
        ReturnBook.b[9].setPreferredSize(new Dimension(400, 40));
        ReturnBook.b[9].setFont(new Font("Arial", 1, 20));
        ReturnBook.b[9].setForeground(Color.darkGray);
        ReturnBook.b[10].setBackground(Color.YELLOW);
        ReturnBook.b[10].setPreferredSize(new Dimension(200, 40));
        ReturnBook.b[10].setFont(new Font("Arial", 1, 20));
        ReturnBook.b[10].setForeground(Color.darkGray);
        ReturnBook.b[11].setBackground(Color.YELLOW);
        ReturnBook.b[11].setPreferredSize(new Dimension(400, 40));
        ReturnBook.b[11].setFont(new Font("Arial", 1, 20));
        ReturnBook.b[11].setForeground(Color.darkGray);
        ReturnBook.l[0].setOpaque(true);
        ReturnBook.l[0].setHorizontalAlignment(0);
        ReturnBook.l[0].setBackground(Color.DARK_GRAY);
        ReturnBook.l[0].setPreferredSize(new Dimension(300, 40));
        ReturnBook.l[0].setFont(new Font("Arial", 1, 20));
        ReturnBook.l[0].setForeground(Color.green);
        ReturnBook.l[1].setOpaque(true);
        ReturnBook.l[1].setHorizontalAlignment(0);
        ReturnBook.l[1].setBackground(Color.DARK_GRAY);
        ReturnBook.l[1].setPreferredSize(new Dimension(300, 40));
        ReturnBook.l[1].setFont(new Font("Arial", 1, 20));
        ReturnBook.l[1].setForeground(Color.green);
        ReturnBook.l[2].setOpaque(true);
        ReturnBook.l[2].setHorizontalAlignment(0);
        ReturnBook.l[2].setBackground(Color.DARK_GRAY);
        ReturnBook.l[2].setPreferredSize(new Dimension(300, 40));
        ReturnBook.l[2].setFont(new Font("Arial", 1, 20));
        ReturnBook.l[2].setForeground(Color.green);
        ReturnBook.j.add(ReturnBook.p[8]);
        ReturnBook.j.setVisible(true);
        ReturnBook.j.setExtendedState(6);
        ReturnBook.j.setDefaultCloseOperation(3);
    }
}
