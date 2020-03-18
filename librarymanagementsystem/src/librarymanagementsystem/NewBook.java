// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

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
import java.awt.GridBagConstraints;

public class NewBook implements Gui
{
    NewBook() {
        this.gui();
    }
    
    @Override
    public void gui() {
        final GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(20, 20, 20, 20);
        (NewBook.p[4] = new JPanel(new GridBagLayout())).setBackground(Color.green);
        NewBook.l[3] = new JLabel("Title");
        NewBook.l[4] = new JLabel("Author");
        NewBook.l[5] = new JLabel("ISBN");
        NewBook.l[6] = new JLabel("Price");
        NewBook.t[2] = new JTextField("");
        NewBook.t[3] = new JTextField("");
        NewBook.t[4] = new JTextField("");
        NewBook.t[5] = new JTextField("");
        (NewBook.b[9] = new JButton("Submit")).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                if (Gui.t[2].getText().equals("") || Gui.t[3].getText().equals("") || Gui.t[4].getText().equals("") || Gui.t[5].getText().equals("")) {
                    JOptionPane.showMessageDialog(null, " EMPTY FIELD !!! ");
                }
                else {
                    final LibraryManagementSystem d = Gui.d;
                    ++d.bno;
                    Gui.d.bk[Gui.d.bno] = new Book(Gui.t[2].getText(), Gui.t[5].getText(), Gui.t[4].getText(), Double.parseDouble(Gui.t[5].getText()));
                    JOptionPane.showMessageDialog(null, " NEW BOOK  ADDED SUCCESSFULLY ");
                    Gui.j.remove(Gui.p[4]);
                    final Dashboard dashboard = new Dashboard();
                }
            }
        });
        NewBook.l[3].setOpaque(true);
        NewBook.l[3].setHorizontalAlignment(0);
        NewBook.l[3].setBackground(Color.DARK_GRAY);
        NewBook.l[3].setPreferredSize(new Dimension(300, 40));
        NewBook.l[3].setFont(new Font("Arial", 1, 20));
        NewBook.l[3].setForeground(Color.green);
        NewBook.t[2].setHorizontalAlignment(0);
        NewBook.t[2].setPreferredSize(new Dimension(400, 40));
        NewBook.t[2].setFont(new Font("Arial", 1, 20));
        NewBook.t[2].setForeground(Color.darkGray);
        NewBook.l[4].setOpaque(true);
        NewBook.l[4].setHorizontalAlignment(0);
        NewBook.l[4].setBackground(Color.DARK_GRAY);
        NewBook.l[4].setPreferredSize(new Dimension(300, 40));
        NewBook.l[4].setFont(new Font("Arial", 1, 20));
        NewBook.l[4].setForeground(Color.green);
        NewBook.t[3].setHorizontalAlignment(0);
        NewBook.t[3].setPreferredSize(new Dimension(400, 40));
        NewBook.t[3].setFont(new Font("Arial", 1, 20));
        NewBook.t[3].setForeground(Color.darkGray);
        NewBook.l[5].setOpaque(true);
        NewBook.l[5].setHorizontalAlignment(0);
        NewBook.l[5].setBackground(Color.DARK_GRAY);
        NewBook.l[5].setPreferredSize(new Dimension(300, 40));
        NewBook.l[5].setFont(new Font("Arial", 1, 20));
        NewBook.l[5].setForeground(Color.green);
        NewBook.t[4].setHorizontalAlignment(0);
        NewBook.t[4].setPreferredSize(new Dimension(400, 40));
        NewBook.t[4].setFont(new Font("Arial", 1, 20));
        NewBook.t[4].setForeground(Color.darkGray);
        NewBook.l[6].setOpaque(true);
        NewBook.l[6].setHorizontalAlignment(0);
        NewBook.l[6].setBackground(Color.DARK_GRAY);
        NewBook.l[6].setPreferredSize(new Dimension(300, 40));
        NewBook.l[6].setFont(new Font("Arial", 1, 20));
        NewBook.l[6].setForeground(Color.green);
        NewBook.t[5].setHorizontalAlignment(0);
        NewBook.t[5].setPreferredSize(new Dimension(400, 40));
        NewBook.t[5].setFont(new Font("Arial", 1, 20));
        NewBook.t[5].setForeground(Color.darkGray);
        NewBook.b[9].setBackground(Color.YELLOW);
        NewBook.b[9].setPreferredSize(new Dimension(200, 40));
        NewBook.b[9].setFont(new Font("Arial", 1, 20));
        NewBook.b[9].setForeground(Color.darkGray);
        c.gridx = 0;
        c.gridy = 0;
        NewBook.p[4].add(NewBook.l[3], c);
        c.gridx = 1;
        c.gridy = 0;
        NewBook.p[4].add(NewBook.t[2], c);
        c.gridx = 0;
        c.gridy = 1;
        NewBook.p[4].add(NewBook.l[4], c);
        c.gridx = 1;
        c.gridy = 1;
        NewBook.p[4].add(NewBook.t[3], c);
        c.gridx = 0;
        c.gridy = 2;
        NewBook.p[4].add(NewBook.l[5], c);
        c.gridx = 1;
        c.gridy = 2;
        NewBook.p[4].add(NewBook.t[4], c);
        c.gridx = 0;
        c.gridy = 3;
        NewBook.p[4].add(NewBook.l[6], c);
        c.gridx = 1;
        c.gridy = 3;
        NewBook.p[4].add(NewBook.t[5], c);
        c.gridx = 1;
        c.gridy = 4;
        NewBook.p[4].add(NewBook.b[9], c);
        NewBook.j.add(NewBook.p[4]);
        NewBook.j.setVisible(true);
        NewBook.j.setExtendedState(6);
        NewBook.j.setDefaultCloseOperation(3);
    }
}
