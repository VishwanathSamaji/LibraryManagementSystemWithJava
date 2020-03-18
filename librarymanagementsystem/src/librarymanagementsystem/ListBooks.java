// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
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

public class ListBooks implements Gui
{
    ListBooks() {
        this.gui();
    }
    
    @Override
    public void gui() {
        final GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(20, 20, 20, 20);
        (ListBooks.p[5] = new JPanel(new GridBagLayout())).setBackground(Color.green);
        (ListBooks.b[10] = new JButton("Dashboard")).setBackground(Color.YELLOW);
        ListBooks.b[10].setPreferredSize(new Dimension(300, 60));
        ListBooks.b[10].setFont(new Font("Arial", 1, 30));
        ListBooks.b[10].setForeground(Color.darkGray);
        c.gridx = 0;
        c.gridy = 0;
        ListBooks.p[5].add(ListBooks.b[10], c);
        int k = 7;
        int m = 1;
        for (int i = 0; i <= ListBooks.d.bno; ++i) {
            (ListBooks.l[k] = new JLabel("Title :")).setOpaque(true);
            ListBooks.l[k].setHorizontalAlignment(0);
            ListBooks.l[k].setBackground(Color.darkGray);
            ListBooks.l[k].setPreferredSize(new Dimension(300, 40));
            ListBooks.l[k].setFont(new Font("Arial", 1, 20));
            ListBooks.l[k].setForeground(Color.green);
            c.gridx = 0;
            c.gridy = m;
            ListBooks.p[5].add(ListBooks.l[k], c);
            (ListBooks.l[k + 1] = new JLabel(ListBooks.d.bk[i].title)).setOpaque(true);
            ListBooks.l[k + 1].setHorizontalAlignment(0);
            ListBooks.l[k + 1].setBackground(Color.WHITE);
            ListBooks.l[k + 1].setPreferredSize(new Dimension(400, 40));
            ListBooks.l[k + 1].setFont(new Font("Arial", 1, 20));
            ListBooks.l[k + 1].setForeground(Color.darkGray);
            c.gridx = 1;
            c.gridy = m;
            ListBooks.p[5].add(ListBooks.l[k + 1], c);
            (ListBooks.l[k + 2] = new JLabel("Author :")).setOpaque(true);
            ListBooks.l[k + 2].setHorizontalAlignment(0);
            ListBooks.l[k + 2].setBackground(Color.DARK_GRAY);
            ListBooks.l[k + 2].setPreferredSize(new Dimension(300, 40));
            ListBooks.l[k + 2].setFont(new Font("Arial", 1, 20));
            ListBooks.l[k + 2].setForeground(Color.GREEN);
            c.gridx = 0;
            c.gridy = m + 1;
            ListBooks.p[5].add(ListBooks.l[k + 2], c);
            (ListBooks.l[k + 3] = new JLabel(ListBooks.d.bk[i].author)).setOpaque(true);
            ListBooks.l[k + 3].setHorizontalAlignment(0);
            ListBooks.l[k + 3].setBackground(Color.WHITE);
            ListBooks.l[k + 3].setPreferredSize(new Dimension(400, 40));
            ListBooks.l[k + 3].setFont(new Font("Arial", 1, 20));
            ListBooks.l[k + 3].setForeground(Color.darkGray);
            c.gridx = 1;
            c.gridy = m + 1;
            ListBooks.p[5].add(ListBooks.l[k + 3], c);
            (ListBooks.l[k + 4] = new JLabel("ISBN :")).setOpaque(true);
            ListBooks.l[k + 4].setHorizontalAlignment(0);
            ListBooks.l[k + 4].setBackground(Color.darkGray);
            ListBooks.l[k + 4].setPreferredSize(new Dimension(300, 40));
            ListBooks.l[k + 4].setFont(new Font("Arial", 1, 20));
            ListBooks.l[k + 4].setForeground(Color.GREEN);
            c.gridx = 0;
            c.gridy = m + 2;
            ListBooks.p[5].add(ListBooks.l[k + 4], c);
            (ListBooks.l[k + 5] = new JLabel(ListBooks.d.bk[i].ISBN)).setOpaque(true);
            ListBooks.l[k + 5].setHorizontalAlignment(0);
            ListBooks.l[k + 5].setBackground(Color.WHITE);
            ListBooks.l[k + 5].setPreferredSize(new Dimension(400, 40));
            ListBooks.l[k + 5].setFont(new Font("Arial", 1, 20));
            ListBooks.l[k + 5].setForeground(Color.darkGray);
            c.gridx = 1;
            c.gridy = m + 2;
            ListBooks.p[5].add(ListBooks.l[k + 5], c);
            (ListBooks.l[k + 6] = new JLabel("Price :")).setOpaque(true);
            ListBooks.l[k + 6].setHorizontalAlignment(0);
            ListBooks.l[k + 6].setBackground(Color.DARK_GRAY);
            ListBooks.l[k + 6].setPreferredSize(new Dimension(300, 40));
            ListBooks.l[k + 6].setFont(new Font("Arial", 1, 20));
            ListBooks.l[k + 6].setForeground(Color.green);
            c.gridx = 0;
            c.gridy = m + 3;
            ListBooks.p[5].add(ListBooks.l[k + 6], c);
            (ListBooks.l[k + 7] = new JLabel(Double.toString(ListBooks.d.bk[i].price))).setOpaque(true);
            ListBooks.l[k + 7].setHorizontalAlignment(0);
            ListBooks.l[k + 7].setBackground(Color.WHITE);
            ListBooks.l[k + 7].setPreferredSize(new Dimension(400, 40));
            ListBooks.l[k + 7].setFont(new Font("Arial", 1, 20));
            ListBooks.l[k + 7].setForeground(Color.darkGray);
            c.gridx = 1;
            c.gridy = m + 3;
            ListBooks.p[5].add(ListBooks.l[k + 7], c);
            (ListBooks.l[k + 8] = new JLabel()).setOpaque(true);
            ListBooks.l[k + 8].setHorizontalAlignment(0);
            ListBooks.l[k + 8].setBackground(Color.GREEN);
            ListBooks.l[k + 8].setPreferredSize(new Dimension(300, 5));
            ListBooks.l[k + 8].setFont(new Font("Arial", 1, 20));
            ListBooks.l[k + 8].setForeground(Color.darkGray);
            c.gridx = 0;
            c.gridy = m + 4;
            ListBooks.p[5].add(ListBooks.l[k + 8], c);
            (ListBooks.l[k + 9] = new JLabel()).setOpaque(true);
            ListBooks.l[k + 9].setHorizontalAlignment(0);
            ListBooks.l[k + 9].setBackground(Color.GREEN);
            ListBooks.l[k + 9].setPreferredSize(new Dimension(400, 5));
            ListBooks.l[k + 9].setFont(new Font("Arial", 1, 20));
            ListBooks.l[k + 9].setForeground(Color.darkGray);
            c.gridx = 1;
            c.gridy = m + 4;
            ListBooks.p[5].add(ListBooks.l[k + 9], c);
            ListBooks.p[5].setBackground(Color.green);
            m += 5;
            ++k;
        }
        m = 1;
        final JScrollPane pane = new JScrollPane(ListBooks.p[5], 22, 31);
        ListBooks.b[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                pane.remove(Gui.p[5]);
                Gui.j.remove(pane);
                final Dashboard d = new Dashboard();
            }
        });
        ListBooks.j.add(pane);
        ListBooks.j.setVisible(true);
        ListBooks.j.setExtendedState(6);
        ListBooks.j.setDefaultCloseOperation(3);
    }
}
