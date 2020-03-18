// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;

public class Dashboard implements Gui
{
    Dashboard() {
        this.gui();
    }
    
    @Override
    public void gui() {
        final GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(20, 20, 20, 20);
        (Dashboard.p[3] = new JPanel(new GridBagLayout())).setBackground(Color.green);
        Dashboard.b[1] = new JButton("Add a new book");
        Dashboard.b[2] = new JButton("List of all the books in library");
        Dashboard.b[3] = new JButton("Add a new member");
        Dashboard.b[4] = new JButton("List of all the members");
        Dashboard.b[5] = new JButton("Issue a book");
        Dashboard.b[6] = new JButton("Return a book");
        Dashboard.b[7] = new JButton("List of Books issued to a member");
        Dashboard.b[8] = new JButton("Exit");
        Dashboard.b[1].setBackground(Color.yellow);
        Dashboard.b[1].setPreferredSize(new Dimension(400, 40));
        Dashboard.b[1].setFont(new Font("Arial", 1, 20));
        Dashboard.b[1].setForeground(Color.darkGray);
        Dashboard.b[2].setBackground(Color.yellow);
        Dashboard.b[2].setPreferredSize(new Dimension(400, 40));
        Dashboard.b[2].setFont(new Font("Arial", 1, 20));
        Dashboard.b[2].setForeground(Color.darkGray);
        Dashboard.b[3].setBackground(Color.yellow);
        Dashboard.b[3].setPreferredSize(new Dimension(400, 40));
        Dashboard.b[3].setFont(new Font("Arial", 1, 20));
        Dashboard.b[3].setForeground(Color.darkGray);
        Dashboard.b[4].setBackground(Color.yellow);
        Dashboard.b[4].setPreferredSize(new Dimension(400, 40));
        Dashboard.b[4].setFont(new Font("Arial", 1, 20));
        Dashboard.b[4].setForeground(Color.darkGray);
        Dashboard.b[5].setBackground(Color.yellow);
        Dashboard.b[5].setPreferredSize(new Dimension(400, 40));
        Dashboard.b[5].setFont(new Font("Arial", 1, 20));
        Dashboard.b[5].setForeground(Color.darkGray);
        Dashboard.b[6].setBackground(Color.yellow);
        Dashboard.b[6].setPreferredSize(new Dimension(400, 40));
        Dashboard.b[6].setFont(new Font("Arial", 1, 20));
        Dashboard.b[6].setForeground(Color.darkGray);
        Dashboard.b[7].setBackground(Color.yellow);
        Dashboard.b[7].setPreferredSize(new Dimension(400, 40));
        Dashboard.b[7].setFont(new Font("Arial", 1, 20));
        Dashboard.b[7].setForeground(Color.darkGray);
        Dashboard.b[8].setBackground(Color.yellow);
        Dashboard.b[8].setPreferredSize(new Dimension(400, 40));
        Dashboard.b[8].setFont(new Font("Arial", 1, 20));
        Dashboard.b[8].setForeground(Color.darkGray);
        c.gridx = 0;
        c.gridy = 0;
        Dashboard.p[3].add(Dashboard.b[1], c);
        c.gridx = 0;
        c.gridy = 1;
        Dashboard.p[3].add(Dashboard.b[2], c);
        c.gridx = 0;
        c.gridy = 2;
        Dashboard.p[3].add(Dashboard.b[3], c);
        c.gridx = 0;
        c.gridy = 3;
        Dashboard.p[3].add(Dashboard.b[4], c);
        c.gridx = 0;
        c.gridy = 4;
        Dashboard.p[3].add(Dashboard.b[5], c);
        c.gridx = 0;
        c.gridy = 5;
        Dashboard.p[3].add(Dashboard.b[6], c);
        c.gridx = 0;
        c.gridy = 6;
        Dashboard.p[3].add(Dashboard.b[7], c);
        c.gridx = 0;
        c.gridy = 7;
        Dashboard.p[3].add(Dashboard.b[8], c);
        Dashboard.b[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                Gui.j.remove(Gui.p[3]);
                final NewBook nb = new NewBook();
            }
        });
        Dashboard.b[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent a) {
                if (Gui.d.bno != -1) {
                    Gui.j.remove(Gui.p[3]);
                    final ListBooks listBooks = new ListBooks();
                }
                else {
                    JOptionPane.showMessageDialog(null, "NO BOOKs AVAILABLE !!!");
                }
            }
        });
        Dashboard.b[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Gui.j.remove(Gui.p[3]);
                final NewMember nm = new NewMember();
            }
        });
        Dashboard.b[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (Gui.d.sno != -1 || Gui.d.fno != -1) {
                    Gui.j.remove(Gui.p[3]);
                    final ListMembers listMembers = new ListMembers();
                }
                else {
                    JOptionPane.showMessageDialog(null, "NO MEMBER AVAILABLE !!!");
                }
            }
        });
        Dashboard.b[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (Gui.d.sno != -1 || Gui.d.fno != -1) {
                    if (Gui.d.bno == -1) {
                        JOptionPane.showMessageDialog(null, "NO BOOKS AVAILABLE !!!");
                    }
                    else {
                        Gui.j.remove(Gui.p[3]);
                        final IssueBook issueBook = new IssueBook();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "NO MEMBER AVAILABLE !!!");
                }
            }
        });
        Dashboard.b[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (Gui.d.sno != -1 || Gui.d.fno != -1) {
                    if (Gui.d.bno == -1) {
                        JOptionPane.showMessageDialog(null, "NO BOOKS AVAILABLE !!!");
                    }
                    else {
                        Gui.j.remove(Gui.p[3]);
                        final ReturnBook returnBook = new ReturnBook();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "NO MEMBER AVAILABLE !!!");
                }
            }
        });
        Dashboard.b[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (Gui.d.sno != -1 || Gui.d.fno != -1) {
                    if (Gui.d.bno == -1) {
                        JOptionPane.showMessageDialog(null, "NO BOOKS AVAILABLE !!!");
                    }
                    else {
                        Gui.j.remove(Gui.p[3]);
                        final BooksIssued booksIssued = new BooksIssued();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "NO MEMBER AVAILABLE !!!");
                }
            }
        });
        Dashboard.b[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                Gui.j.dispose();
            }
        });
        Dashboard.j.add(Dashboard.p[3]);
        Dashboard.j.setExtendedState(6);
        Dashboard.j.setVisible(true);
        Dashboard.j.setDefaultCloseOperation(3);
    }
}
