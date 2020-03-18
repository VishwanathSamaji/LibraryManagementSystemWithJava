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

public class IssueBook implements Gui
{
    int value;
    int i;
    int k;
    int found;
    
    IssueBook() {
        this.value = 1;
        this.gui();
    }
    
    @Override
    public void gui() {
        final GridBagConstraints c = new GridBagConstraints();
        final JRadioButton s = new JRadioButton("Student");
        final JRadioButton f = new JRadioButton("Faculty");
        final ButtonGroup g = new ButtonGroup();
        c.insets = new Insets(20, 20, 20, 20);
        (IssueBook.p[7] = new JPanel(new GridBagLayout())).setBackground(Color.green);
        IssueBook.l[3] = new JLabel("Name or Id");
        IssueBook.l[4] = new JLabel("Type ");
        IssueBook.l[5] = new JLabel("Title or ISBN");
        IssueBook.l[6] = new JLabel("Member Details Found");
        IssueBook.t[2] = new JTextField("");
        IssueBook.t[3] = new JTextField("");
        IssueBook.b[9] = new JButton("Verify");
        IssueBook.b[10] = new JButton("Find Book");
        IssueBook.b[11] = new JButton("Issue Book");
        c.gridx = 0;
        c.gridy = 0;
        IssueBook.p[7].add(IssueBook.l[3], c);
        c.gridx = 1;
        c.gridy = 0;
        IssueBook.p[7].add(IssueBook.t[2], c);
        c.gridx = 0;
        c.gridy = 1;
        IssueBook.p[7].add(IssueBook.l[4], c);
        c.gridx = 1;
        c.gridy = 1;
        IssueBook.p[7].add(s, c);
        g.add(s);
        c.gridx = 1;
        c.gridy = 2;
        IssueBook.p[7].add(f, c);
        g.add(f);
        c.gridx = 0;
        c.gridy = 3;
        IssueBook.p[7].add(IssueBook.l[5], c);
        c.gridx = 1;
        c.gridy = 3;
        IssueBook.p[7].add(IssueBook.t[3], c);
        c.gridx = 1;
        c.gridy = 5;
        IssueBook.p[7].add(IssueBook.b[11], c);
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                IssueBook.this.value = 1;
            }
        });
        f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                IssueBook.this.value = 2;
            }
        });
        IssueBook.b[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                if (IssueBook.this.value == 1) {
                    if (Gui.d.sno != -1) {
                        if (IssueBook.this.value == 0 || Gui.t[2].getText().equals("") || Gui.t[3].getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
                            Gui.j.remove(Gui.p[7]);
                            final Dashboard dashboard = new Dashboard();
                        }
                        else {
                            IssueBook.this.i = 0;
                            while (IssueBook.this.i <= Gui.d.sno) {
                                if (Gui.t[2].getText().equals(Gui.d.s[IssueBook.this.i].name) || Gui.t[2].getText().equals(Gui.d.s[IssueBook.this.i].userId)) {
                                    if (Gui.d.bno != -1) {
                                        IssueBook.this.k = 0;
                                        while (IssueBook.this.k <= Gui.d.bno) {
                                            if (Gui.d.bk[IssueBook.this.k].title.equals(Gui.t[3].getText()) || Gui.d.bk[IssueBook.this.k].ISBN.equals(Gui.t[3].getText())) {
                                                IssueBook.this.found = 1;
                                                if (Gui.d.s[IssueBook.this.i].temp != 5) {
                                                    final Student student = Gui.d.s[IssueBook.this.i];
                                                    ++student.temp;
                                                    Gui.d.s[IssueBook.this.i].bookIssuedNo[Gui.d.s[IssueBook.this.i].temp] = IssueBook.this.k;
                                                    JOptionPane.showMessageDialog(null, "BOOK SUCCESSFULLY ISSUED ");
                                                    Gui.j.remove(Gui.p[7]);
                                                    final Dashboard dashboard2 = new Dashboard();
                                                }
                                                else {
                                                    JOptionPane.showMessageDialog(null, "MAXIMUM ONLY 6 BOOKS CAN BE ISSUED");
                                                    Gui.j.remove(Gui.p[7]);
                                                    final Dashboard dashboard3 = new Dashboard();
                                                }
                                            }
                                            final IssueBook this$0 = IssueBook.this;
                                            ++this$0.k;
                                        }
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null, "NO BOOK AVAILABLE !!!");
                                        Gui.j.remove(Gui.p[7]);
                                        final Dashboard dashboard4 = new Dashboard();
                                    }
                                }
                                final IssueBook this$2 = IssueBook.this;
                                ++this$2.i;
                            }
                            if (IssueBook.this.found == 0) {
                                JOptionPane.showMessageDialog(null, "MEMBER DETAILS NOT FOUND !!!");
                                Gui.j.remove(Gui.p[7]);
                                final Dashboard dashboard5 = new Dashboard();
                            }
                        }
                    }
                    else if (Gui.d.sno == -1) {
                        JOptionPane.showMessageDialog(null, " NO STUDENT MEMBER AVAILABLE !!! ");
                        Gui.j.remove(Gui.p[7]);
                        final Dashboard dashboard6 = new Dashboard();
                    }
                }
                IssueBook.this.found = 2;
                if (IssueBook.this.value == 2) {
                    if (Gui.d.fno != -1) {
                        if (IssueBook.this.value == 0 || Gui.t[2].getText().equals("") || Gui.t[3].getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "EMPTY FIELD");
                            Gui.j.remove(Gui.p[7]);
                            final Dashboard dashboard7 = new Dashboard();
                        }
                        else {
                            IssueBook.this.i = 0;
                            while (IssueBook.this.i <= Gui.d.fno) {
                                if (Gui.t[2].getText().equals(Gui.d.f[IssueBook.this.i].name) || Gui.t[2].getText().equals(Gui.d.f[IssueBook.this.i].userId)) {
                                    if (Gui.d.bno != -1) {
                                        IssueBook.this.k = 0;
                                        while (IssueBook.this.k <= Gui.d.bno) {
                                            if (Gui.d.bk[IssueBook.this.k].title.equals(Gui.t[3].getText()) || Gui.d.bk[IssueBook.this.k].ISBN.equals(Gui.t[3].getText())) {
                                                IssueBook.this.found = 1;
                                                if (Gui.d.f[IssueBook.this.i].temp != 5) {
                                                    final Faculty faculty = Gui.d.f[IssueBook.this.i];
                                                    ++faculty.temp;
                                                    Gui.d.f[IssueBook.this.i].bookIssuedNo[Gui.d.f[IssueBook.this.i].temp] = IssueBook.this.k;
                                                    JOptionPane.showMessageDialog(null, "BOOK SUCCESSFULLY ISSUED ");
                                                    Gui.j.remove(Gui.p[7]);
                                                    final Dashboard dashboard8 = new Dashboard();
                                                }
                                                else {
                                                    JOptionPane.showMessageDialog(null, "MAXIMUM ONLY 6 BOOKS CAN BE ISSUED");
                                                    Gui.j.remove(Gui.p[7]);
                                                    final Dashboard dashboard9 = new Dashboard();
                                                }
                                            }
                                            final IssueBook this$3 = IssueBook.this;
                                            ++this$3.k;
                                        }
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null, "NO BOOK AVAILABLE !!!");
                                        Gui.j.remove(Gui.p[7]);
                                        final Dashboard dashboard10 = new Dashboard();
                                    }
                                }
                                final IssueBook this$4 = IssueBook.this;
                                ++this$4.i;
                            }
                            if (IssueBook.this.found == 0) {
                                JOptionPane.showMessageDialog(null, "MEMBER DETAILS NOT FOUND !!!");
                                Gui.j.remove(Gui.p[7]);
                                final Dashboard dashboard11 = new Dashboard();
                            }
                        }
                    }
                    else if (Gui.d.fno == -1) {
                        JOptionPane.showMessageDialog(null, " NO FACULTY MEMBER AVAILABLE !!! ");
                        Gui.j.remove(Gui.p[7]);
                        final Dashboard dashboard12 = new Dashboard();
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
        IssueBook.l[3].setOpaque(true);
        IssueBook.l[3].setHorizontalAlignment(0);
        IssueBook.l[3].setBackground(Color.DARK_GRAY);
        IssueBook.l[3].setPreferredSize(new Dimension(300, 40));
        IssueBook.l[3].setFont(new Font("Arial", 1, 20));
        IssueBook.l[3].setForeground(Color.green);
        IssueBook.t[2].setHorizontalAlignment(0);
        IssueBook.t[2].setPreferredSize(new Dimension(400, 40));
        IssueBook.t[2].setFont(new Font("Arial", 1, 20));
        IssueBook.t[2].setForeground(Color.darkGray);
        IssueBook.l[4].setOpaque(true);
        IssueBook.l[4].setHorizontalAlignment(0);
        IssueBook.l[4].setBackground(Color.DARK_GRAY);
        IssueBook.l[4].setPreferredSize(new Dimension(300, 40));
        IssueBook.l[4].setFont(new Font("Arial", 1, 20));
        IssueBook.l[4].setForeground(Color.green);
        IssueBook.t[3].setHorizontalAlignment(0);
        IssueBook.t[3].setPreferredSize(new Dimension(400, 40));
        IssueBook.t[3].setFont(new Font("Arial", 1, 20));
        IssueBook.t[3].setForeground(Color.darkGray);
        IssueBook.l[5].setOpaque(true);
        IssueBook.l[5].setHorizontalAlignment(0);
        IssueBook.l[5].setBackground(Color.DARK_GRAY);
        IssueBook.l[5].setPreferredSize(new Dimension(300, 40));
        IssueBook.l[5].setFont(new Font("Arial", 1, 20));
        IssueBook.l[5].setForeground(Color.green);
        IssueBook.t[2].setHorizontalAlignment(0);
        IssueBook.t[2].setPreferredSize(new Dimension(400, 40));
        IssueBook.t[2].setFont(new Font("Arial", 1, 20));
        IssueBook.t[2].setForeground(Color.darkGray);
        IssueBook.l[2].setOpaque(true);
        IssueBook.l[6].setHorizontalAlignment(0);
        IssueBook.l[6].setBackground(Color.DARK_GRAY);
        IssueBook.l[6].setPreferredSize(new Dimension(300, 40));
        IssueBook.l[6].setFont(new Font("Arial", 1, 20));
        IssueBook.l[6].setForeground(Color.green);
        IssueBook.t[3].setHorizontalAlignment(0);
        IssueBook.t[3].setPreferredSize(new Dimension(400, 40));
        IssueBook.t[3].setFont(new Font("Arial", 1, 20));
        IssueBook.t[3].setForeground(Color.darkGray);
        IssueBook.b[9].setBackground(Color.YELLOW);
        IssueBook.b[9].setPreferredSize(new Dimension(400, 40));
        IssueBook.b[9].setFont(new Font("Arial", 1, 20));
        IssueBook.b[9].setForeground(Color.darkGray);
        IssueBook.b[10].setBackground(Color.YELLOW);
        IssueBook.b[10].setPreferredSize(new Dimension(200, 40));
        IssueBook.b[10].setFont(new Font("Arial", 1, 20));
        IssueBook.b[10].setForeground(Color.darkGray);
        IssueBook.b[11].setBackground(Color.YELLOW);
        IssueBook.b[11].setPreferredSize(new Dimension(400, 40));
        IssueBook.b[11].setFont(new Font("Arial", 1, 20));
        IssueBook.b[11].setForeground(Color.darkGray);
        IssueBook.l[0].setOpaque(true);
        IssueBook.l[0].setHorizontalAlignment(0);
        IssueBook.l[0].setBackground(Color.DARK_GRAY);
        IssueBook.l[0].setPreferredSize(new Dimension(300, 40));
        IssueBook.l[0].setFont(new Font("Arial", 1, 20));
        IssueBook.l[0].setForeground(Color.green);
        IssueBook.l[1].setOpaque(true);
        IssueBook.l[1].setHorizontalAlignment(0);
        IssueBook.l[1].setBackground(Color.DARK_GRAY);
        IssueBook.l[1].setPreferredSize(new Dimension(300, 40));
        IssueBook.l[1].setFont(new Font("Arial", 1, 20));
        IssueBook.l[1].setForeground(Color.green);
        IssueBook.l[2].setOpaque(true);
        IssueBook.l[2].setHorizontalAlignment(0);
        IssueBook.l[2].setBackground(Color.DARK_GRAY);
        IssueBook.l[2].setPreferredSize(new Dimension(300, 40));
        IssueBook.l[2].setFont(new Font("Arial", 1, 20));
        IssueBook.l[2].setForeground(Color.green);
        IssueBook.j.add(IssueBook.p[7]);
        IssueBook.j.setVisible(true);
        IssueBook.j.setExtendedState(6);
        IssueBook.j.setDefaultCloseOperation(3);
    }
}
