// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;

public class ListMembers implements Gui
{
    ListMembers() {
        this.gui();
    }
    
    @Override
    public void gui() {
        final GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(20, 20, 20, 20);
        (ListMembers.p[6] = new JPanel(new GridBagLayout())).setBackground(Color.green);
        (ListMembers.b[10] = new JButton("Dashboard")).setBackground(Color.YELLOW);
        ListMembers.b[10].setPreferredSize(new Dimension(300, 60));
        ListMembers.b[10].setFont(new Font("Arial", 1, 30));
        ListMembers.b[10].setForeground(Color.darkGray);
        ListMembers.l[3] = new JLabel("STUDENT MEMBERS");
        ListMembers.l[4] = new JLabel("FACULTY MEMBERS");
        ListMembers.l[5] = new JLabel("NO STUDENT MEMBER");
        ListMembers.l[6] = new JLabel("NO FACULTY MEMBER");
        ListMembers.l[3].setOpaque(true);
        ListMembers.l[3].setHorizontalAlignment(0);
        ListMembers.l[3].setBackground(Color.CYAN);
        ListMembers.l[3].setPreferredSize(new Dimension(300, 40));
        ListMembers.l[3].setFont(new Font("Arial", 1, 20));
        ListMembers.l[3].setForeground(Color.DARK_GRAY);
        ListMembers.l[4].setOpaque(true);
        ListMembers.l[4].setHorizontalAlignment(0);
        ListMembers.l[4].setBackground(Color.CYAN);
        ListMembers.l[4].setPreferredSize(new Dimension(300, 40));
        ListMembers.l[4].setFont(new Font("Arial", 1, 20));
        ListMembers.l[4].setForeground(Color.DARK_GRAY);
        ListMembers.l[5].setOpaque(true);
        ListMembers.l[5].setHorizontalAlignment(0);
        ListMembers.l[5].setBackground(Color.orange);
        ListMembers.l[5].setPreferredSize(new Dimension(300, 40));
        ListMembers.l[5].setFont(new Font("Arial", 1, 20));
        ListMembers.l[5].setForeground(Color.darkGray);
        ListMembers.l[6].setOpaque(true);
        ListMembers.l[6].setHorizontalAlignment(0);
        ListMembers.l[6].setBackground(Color.orange);
        ListMembers.l[6].setPreferredSize(new Dimension(300, 40));
        ListMembers.l[6].setFont(new Font("Arial", 1, 20));
        ListMembers.l[6].setForeground(Color.darkGray);
        c.gridx = 0;
        c.gridy = 0;
        ListMembers.p[6].add(ListMembers.b[10], c);
        c.gridx = 0;
        c.gridy = 1;
        ListMembers.p[6].add(ListMembers.l[3], c);
        int k = 7;
        int m = 2;
        if (ListMembers.d.sno != -1) {
            for (int i = 0; i <= ListMembers.d.sno; ++i) {
                (ListMembers.l[k] = new JLabel("Name :")).setOpaque(true);
                ListMembers.l[k].setHorizontalAlignment(0);
                ListMembers.l[k].setBackground(Color.darkGray);
                ListMembers.l[k].setPreferredSize(new Dimension(300, 40));
                ListMembers.l[k].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k].setForeground(Color.green);
                c.gridx = 0;
                c.gridy = m;
                ListMembers.p[6].add(ListMembers.l[k], c);
                (ListMembers.l[k + 1] = new JLabel(ListMembers.d.s[i].name)).setOpaque(true);
                ListMembers.l[k + 1].setHorizontalAlignment(0);
                ListMembers.l[k + 1].setBackground(Color.WHITE);
                ListMembers.l[k + 1].setPreferredSize(new Dimension(400, 40));
                ListMembers.l[k + 1].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 1].setForeground(Color.darkGray);
                c.gridx = 1;
                c.gridy = m;
                ListMembers.p[6].add(ListMembers.l[k + 1], c);
                (ListMembers.l[k + 2] = new JLabel("Id :")).setOpaque(true);
                ListMembers.l[k + 2].setHorizontalAlignment(0);
                ListMembers.l[k + 2].setBackground(Color.DARK_GRAY);
                ListMembers.l[k + 2].setPreferredSize(new Dimension(300, 40));
                ListMembers.l[k + 2].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 2].setForeground(Color.GREEN);
                c.gridx = 0;
                c.gridy = m + 1;
                ListMembers.p[6].add(ListMembers.l[k + 2], c);
                (ListMembers.l[k + 3] = new JLabel(ListMembers.d.s[i].userId)).setOpaque(true);
                ListMembers.l[k + 3].setHorizontalAlignment(0);
                ListMembers.l[k + 3].setBackground(Color.WHITE);
                ListMembers.l[k + 3].setPreferredSize(new Dimension(400, 40));
                ListMembers.l[k + 3].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 3].setForeground(Color.darkGray);
                c.gridx = 1;
                c.gridy = m + 1;
                ListMembers.p[6].add(ListMembers.l[k + 3], c);
                (ListMembers.l[k + 4] = new JLabel("Password :")).setOpaque(true);
                ListMembers.l[k + 4].setHorizontalAlignment(0);
                ListMembers.l[k + 4].setBackground(Color.darkGray);
                ListMembers.l[k + 4].setPreferredSize(new Dimension(300, 40));
                ListMembers.l[k + 4].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 4].setForeground(Color.GREEN);
                c.gridx = 0;
                c.gridy = m + 2;
                ListMembers.p[6].add(ListMembers.l[k + 4], c);
                (ListMembers.l[k + 5] = new JLabel(ListMembers.d.s[i].password)).setOpaque(true);
                ListMembers.l[k + 5].setHorizontalAlignment(0);
                ListMembers.l[k + 5].setBackground(Color.WHITE);
                ListMembers.l[k + 5].setPreferredSize(new Dimension(400, 40));
                ListMembers.l[k + 5].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 5].setForeground(Color.darkGray);
                c.gridx = 1;
                c.gridy = m + 2;
                ListMembers.p[6].add(ListMembers.l[k + 5], c);
                (ListMembers.l[k + 6] = new JLabel("EmailId :")).setOpaque(true);
                ListMembers.l[k + 6].setHorizontalAlignment(0);
                ListMembers.l[k + 6].setBackground(Color.DARK_GRAY);
                ListMembers.l[k + 6].setPreferredSize(new Dimension(300, 40));
                ListMembers.l[k + 6].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 6].setForeground(Color.green);
                c.gridx = 0;
                c.gridy = m + 3;
                ListMembers.p[6].add(ListMembers.l[k + 6], c);
                (ListMembers.l[k + 7] = new JLabel(ListMembers.d.s[i].emailId)).setOpaque(true);
                ListMembers.l[k + 7].setHorizontalAlignment(0);
                ListMembers.l[k + 7].setBackground(Color.WHITE);
                ListMembers.l[k + 7].setPreferredSize(new Dimension(400, 40));
                ListMembers.l[k + 7].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 7].setForeground(Color.darkGray);
                c.gridx = 1;
                c.gridy = m + 3;
                ListMembers.p[6].add(ListMembers.l[k + 7], c);
                (ListMembers.l[k + 8] = new JLabel()).setOpaque(true);
                ListMembers.l[k + 8].setHorizontalAlignment(0);
                ListMembers.l[k + 8].setBackground(Color.GREEN);
                ListMembers.l[k + 8].setPreferredSize(new Dimension(300, 5));
                ListMembers.l[k + 8].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 8].setForeground(Color.darkGray);
                c.gridx = 0;
                c.gridy = m + 4;
                ListMembers.p[6].add(ListMembers.l[k + 8], c);
                (ListMembers.l[k + 9] = new JLabel()).setOpaque(true);
                ListMembers.l[k + 9].setHorizontalAlignment(0);
                ListMembers.l[k + 9].setBackground(Color.GREEN);
                ListMembers.l[k + 9].setPreferredSize(new Dimension(400, 5));
                ListMembers.l[k + 9].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 9].setForeground(Color.darkGray);
                c.gridx = 1;
                c.gridy = m + 4;
                ListMembers.p[6].add(ListMembers.l[k + 9], c);
                ListMembers.p[6].setBackground(Color.green);
                m += 5;
                k += 9;
            }
        }
        else {
            m = 3;
            c.gridx = 0;
            c.gridy = 2;
            ListMembers.p[6].add(ListMembers.l[5], c);
        }
        if (ListMembers.d.fno != -1) {
            c.gridx = 0;
            c.gridy = m;
            ListMembers.p[6].add(ListMembers.l[4], c);
            ++m;
            for (int i = 0; i <= ListMembers.d.fno; ++i) {
                (ListMembers.l[k] = new JLabel("Name :")).setOpaque(true);
                ListMembers.l[k].setHorizontalAlignment(0);
                ListMembers.l[k].setBackground(Color.darkGray);
                ListMembers.l[k].setPreferredSize(new Dimension(300, 40));
                ListMembers.l[k].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k].setForeground(Color.green);
                c.gridx = 0;
                c.gridy = m;
                ListMembers.p[6].add(ListMembers.l[k], c);
                (ListMembers.l[k + 1] = new JLabel(ListMembers.d.f[i].name)).setOpaque(true);
                ListMembers.l[k + 1].setHorizontalAlignment(0);
                ListMembers.l[k + 1].setBackground(Color.WHITE);
                ListMembers.l[k + 1].setPreferredSize(new Dimension(400, 40));
                ListMembers.l[k + 1].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 1].setForeground(Color.darkGray);
                c.gridx = 1;
                c.gridy = m;
                ListMembers.p[6].add(ListMembers.l[k + 1], c);
                (ListMembers.l[k + 2] = new JLabel("Id :")).setOpaque(true);
                ListMembers.l[k + 2].setHorizontalAlignment(0);
                ListMembers.l[k + 2].setBackground(Color.DARK_GRAY);
                ListMembers.l[k + 2].setPreferredSize(new Dimension(300, 40));
                ListMembers.l[k + 2].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 2].setForeground(Color.GREEN);
                c.gridx = 0;
                c.gridy = m + 1;
                ListMembers.p[6].add(ListMembers.l[k + 2], c);
                (ListMembers.l[k + 3] = new JLabel(ListMembers.d.f[i].userId)).setOpaque(true);
                ListMembers.l[k + 3].setHorizontalAlignment(0);
                ListMembers.l[k + 3].setBackground(Color.WHITE);
                ListMembers.l[k + 3].setPreferredSize(new Dimension(400, 40));
                ListMembers.l[k + 3].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 3].setForeground(Color.darkGray);
                c.gridx = 1;
                c.gridy = m + 1;
                ListMembers.p[6].add(ListMembers.l[k + 3], c);
                (ListMembers.l[k + 4] = new JLabel("Password :")).setOpaque(true);
                ListMembers.l[k + 4].setHorizontalAlignment(0);
                ListMembers.l[k + 4].setBackground(Color.darkGray);
                ListMembers.l[k + 4].setPreferredSize(new Dimension(300, 40));
                ListMembers.l[k + 4].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 4].setForeground(Color.GREEN);
                c.gridx = 0;
                c.gridy = m + 2;
                ListMembers.p[6].add(ListMembers.l[k + 4], c);
                (ListMembers.l[k + 5] = new JLabel(ListMembers.d.f[i].password)).setOpaque(true);
                ListMembers.l[k + 5].setHorizontalAlignment(0);
                ListMembers.l[k + 5].setBackground(Color.WHITE);
                ListMembers.l[k + 5].setPreferredSize(new Dimension(400, 40));
                ListMembers.l[k + 5].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 5].setForeground(Color.darkGray);
                c.gridx = 1;
                c.gridy = m + 2;
                ListMembers.p[6].add(ListMembers.l[k + 5], c);
                (ListMembers.l[k + 6] = new JLabel("EmailId :")).setOpaque(true);
                ListMembers.l[k + 6].setHorizontalAlignment(0);
                ListMembers.l[k + 6].setBackground(Color.DARK_GRAY);
                ListMembers.l[k + 6].setPreferredSize(new Dimension(300, 40));
                ListMembers.l[k + 6].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 6].setForeground(Color.green);
                c.gridx = 0;
                c.gridy = m + 3;
                ListMembers.p[6].add(ListMembers.l[k + 6], c);
                (ListMembers.l[k + 7] = new JLabel(ListMembers.d.f[i].emailId)).setOpaque(true);
                ListMembers.l[k + 7].setHorizontalAlignment(0);
                ListMembers.l[k + 7].setBackground(Color.WHITE);
                ListMembers.l[k + 7].setPreferredSize(new Dimension(400, 40));
                ListMembers.l[k + 7].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 7].setForeground(Color.darkGray);
                c.gridx = 1;
                c.gridy = m + 3;
                ListMembers.p[6].add(ListMembers.l[k + 7], c);
                (ListMembers.l[k + 8] = new JLabel()).setOpaque(true);
                ListMembers.l[k + 8].setHorizontalAlignment(0);
                ListMembers.l[k + 8].setBackground(Color.GREEN);
                ListMembers.l[k + 8].setPreferredSize(new Dimension(300, 5));
                ListMembers.l[k + 8].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 8].setForeground(Color.darkGray);
                c.gridx = 0;
                c.gridy = m + 4;
                ListMembers.p[6].add(ListMembers.l[k + 8], c);
                (ListMembers.l[k + 9] = new JLabel()).setOpaque(true);
                ListMembers.l[k + 9].setHorizontalAlignment(0);
                ListMembers.l[k + 9].setBackground(Color.GREEN);
                ListMembers.l[k + 9].setPreferredSize(new Dimension(400, 5));
                ListMembers.l[k + 9].setFont(new Font("Arial", 1, 20));
                ListMembers.l[k + 9].setForeground(Color.darkGray);
                c.gridx = 1;
                c.gridy = m + 4;
                ListMembers.p[6].add(ListMembers.l[k + 9], c);
                ListMembers.p[6].setBackground(Color.green);
                m += 5;
                ++k;
            }
        }
        else {
            c.gridx = 0;
            c.gridy = m;
            ListMembers.p[6].add(ListMembers.l[4], c);
            ++m;
            c.gridx = 0;
            c.gridy = m;
            ListMembers.p[6].add(ListMembers.l[6], c);
        }
        m = 1;
        final JScrollPane pane = new JScrollPane(ListMembers.p[6], 22, 31);
        ListMembers.b[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                pane.remove(Gui.p[6]);
                Gui.j.remove(pane);
                final Dashboard d = new Dashboard();
            }
        });
        ListMembers.j.add(pane);
        ListMembers.j.setVisible(true);
        ListMembers.j.setExtendedState(6);
        ListMembers.j.setDefaultCloseOperation(3);
    }
}
