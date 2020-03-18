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

public class BooksIssuedList implements Gui
{
    int position;
    int value;
    
    BooksIssuedList(final int position, final int value) {
        this.position = position;
        this.value = value;
        this.gui();
    }
    
    @Override
    public void gui() {
        final GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(20, 20, 20, 20);
        (BooksIssuedList.p[10] = new JPanel(new GridBagLayout())).setBackground(Color.green);
        (BooksIssuedList.b[10] = new JButton("Dashboard")).setBackground(Color.YELLOW);
        BooksIssuedList.b[10].setPreferredSize(new Dimension(300, 60));
        BooksIssuedList.b[10].setFont(new Font("Arial", 1, 30));
        BooksIssuedList.b[10].setForeground(Color.darkGray);
        BooksIssuedList.l[1] = new JLabel("STUDENT/FACULTY DETAILS");
        BooksIssuedList.l[2] = new JLabel("LIST OF BOOKS ISSUED");
        BooksIssuedList.l[3] = new JLabel("NO BOOK ISSUED");
        BooksIssuedList.l[4] = new JLabel("Name ");
        if (this.value == 1) {
            BooksIssuedList.l[5] = new JLabel(BooksIssuedList.d.s[this.position].name);
        }
        else {
            BooksIssuedList.l[5] = new JLabel(BooksIssuedList.d.f[this.position].name);
        }
        BooksIssuedList.l[6] = new JLabel("Id");
        if (this.value == 1) {
            BooksIssuedList.l[7] = new JLabel(BooksIssuedList.d.s[this.position].userId);
        }
        else {
            BooksIssuedList.l[7] = new JLabel(BooksIssuedList.d.f[this.position].userId);
        }
        BooksIssuedList.l[8] = new JLabel("Password");
        if (this.value == 1) {
            BooksIssuedList.l[9] = new JLabel(BooksIssuedList.d.s[this.position].password);
        }
        else {
            BooksIssuedList.l[9] = new JLabel(BooksIssuedList.d.f[this.position].password);
        }
        BooksIssuedList.l[10] = new JLabel("Email");
        if (this.value == 1) {
            BooksIssuedList.l[11] = new JLabel(BooksIssuedList.d.s[this.position].emailId);
        }
        else {
            BooksIssuedList.l[11] = new JLabel(BooksIssuedList.d.f[this.position].emailId);
        }
        BooksIssuedList.l[1].setOpaque(true);
        BooksIssuedList.l[1].setHorizontalAlignment(0);
        BooksIssuedList.l[1].setBackground(Color.CYAN);
        BooksIssuedList.l[1].setPreferredSize(new Dimension(300, 40));
        BooksIssuedList.l[1].setFont(new Font("Arial", 1, 20));
        BooksIssuedList.l[1].setForeground(Color.DARK_GRAY);
        BooksIssuedList.l[2].setOpaque(true);
        BooksIssuedList.l[2].setHorizontalAlignment(0);
        BooksIssuedList.l[2].setBackground(Color.CYAN);
        BooksIssuedList.l[2].setPreferredSize(new Dimension(300, 40));
        BooksIssuedList.l[2].setFont(new Font("Arial", 1, 20));
        BooksIssuedList.l[2].setForeground(Color.DARK_GRAY);
        BooksIssuedList.l[3].setOpaque(true);
        BooksIssuedList.l[3].setHorizontalAlignment(0);
        BooksIssuedList.l[3].setBackground(Color.orange);
        BooksIssuedList.l[3].setPreferredSize(new Dimension(300, 40));
        BooksIssuedList.l[3].setFont(new Font("Arial", 1, 20));
        BooksIssuedList.l[3].setForeground(Color.darkGray);
        BooksIssuedList.l[4].setOpaque(true);
        BooksIssuedList.l[4].setHorizontalAlignment(0);
        BooksIssuedList.l[4].setBackground(Color.darkGray);
        BooksIssuedList.l[4].setPreferredSize(new Dimension(300, 40));
        BooksIssuedList.l[4].setFont(new Font("Arial", 1, 20));
        BooksIssuedList.l[4].setForeground(Color.green);
        BooksIssuedList.l[5].setOpaque(true);
        BooksIssuedList.l[5].setHorizontalAlignment(0);
        BooksIssuedList.l[5].setBackground(Color.white);
        BooksIssuedList.l[5].setPreferredSize(new Dimension(400, 40));
        BooksIssuedList.l[5].setFont(new Font("Arial", 1, 20));
        BooksIssuedList.l[5].setForeground(Color.DARK_GRAY);
        BooksIssuedList.l[6].setOpaque(true);
        BooksIssuedList.l[6].setHorizontalAlignment(0);
        BooksIssuedList.l[6].setBackground(Color.DARK_GRAY);
        BooksIssuedList.l[6].setPreferredSize(new Dimension(300, 40));
        BooksIssuedList.l[6].setFont(new Font("Arial", 1, 20));
        BooksIssuedList.l[6].setForeground(Color.GREEN);
        BooksIssuedList.l[7].setOpaque(true);
        BooksIssuedList.l[7].setHorizontalAlignment(0);
        BooksIssuedList.l[7].setBackground(Color.white);
        BooksIssuedList.l[7].setPreferredSize(new Dimension(400, 40));
        BooksIssuedList.l[7].setFont(new Font("Arial", 1, 20));
        BooksIssuedList.l[7].setForeground(Color.DARK_GRAY);
        BooksIssuedList.l[8].setOpaque(true);
        BooksIssuedList.l[8].setHorizontalAlignment(0);
        BooksIssuedList.l[8].setBackground(Color.DARK_GRAY);
        BooksIssuedList.l[8].setPreferredSize(new Dimension(300, 40));
        BooksIssuedList.l[8].setFont(new Font("Arial", 1, 20));
        BooksIssuedList.l[8].setForeground(Color.green);
        BooksIssuedList.l[9].setOpaque(true);
        BooksIssuedList.l[9].setHorizontalAlignment(0);
        BooksIssuedList.l[9].setBackground(Color.white);
        BooksIssuedList.l[9].setPreferredSize(new Dimension(400, 40));
        BooksIssuedList.l[9].setFont(new Font("Arial", 1, 20));
        BooksIssuedList.l[9].setForeground(Color.DARK_GRAY);
        BooksIssuedList.l[10].setOpaque(true);
        BooksIssuedList.l[10].setHorizontalAlignment(0);
        BooksIssuedList.l[10].setBackground(Color.darkGray);
        BooksIssuedList.l[10].setPreferredSize(new Dimension(300, 40));
        BooksIssuedList.l[10].setFont(new Font("Arial", 1, 20));
        BooksIssuedList.l[10].setForeground(Color.green);
        BooksIssuedList.l[11].setOpaque(true);
        BooksIssuedList.l[11].setHorizontalAlignment(0);
        BooksIssuedList.l[11].setBackground(Color.white);
        BooksIssuedList.l[11].setPreferredSize(new Dimension(400, 40));
        BooksIssuedList.l[11].setFont(new Font("Arial", 1, 20));
        BooksIssuedList.l[11].setForeground(Color.DARK_GRAY);
        c.gridx = 0;
        c.gridy = 0;
        BooksIssuedList.p[10].add(BooksIssuedList.b[10], c);
        c.gridx = 0;
        c.gridy = 1;
        BooksIssuedList.p[10].add(BooksIssuedList.l[1], c);
        c.gridx = 0;
        c.gridy = 2;
        BooksIssuedList.p[10].add(BooksIssuedList.l[4], c);
        c.gridx = 1;
        c.gridy = 2;
        BooksIssuedList.p[10].add(BooksIssuedList.l[5], c);
        c.gridx = 0;
        c.gridy = 3;
        BooksIssuedList.p[10].add(BooksIssuedList.l[6], c);
        c.gridx = 1;
        c.gridy = 3;
        BooksIssuedList.p[10].add(BooksIssuedList.l[7], c);
        c.gridx = 0;
        c.gridy = 4;
        BooksIssuedList.p[10].add(BooksIssuedList.l[8], c);
        c.gridx = 1;
        c.gridy = 4;
        BooksIssuedList.p[10].add(BooksIssuedList.l[9], c);
        c.gridx = 0;
        c.gridy = 5;
        BooksIssuedList.p[10].add(BooksIssuedList.l[10], c);
        c.gridx = 1;
        c.gridy = 5;
        BooksIssuedList.p[10].add(BooksIssuedList.l[11], c);
        c.gridx = 0;
        c.gridy = 6;
        BooksIssuedList.p[10].add(BooksIssuedList.l[2], c);
        int k = 12;
        int m = 7;
        if (this.value == 1) {
            if (BooksIssuedList.d.s[this.position].temp != -1) {
                for (int i = 0; i <= BooksIssuedList.d.s[this.position].temp; ++i) {
                    (BooksIssuedList.l[k] = new JLabel("Title :")).setOpaque(true);
                    BooksIssuedList.l[k].setHorizontalAlignment(0);
                    BooksIssuedList.l[k].setBackground(Color.darkGray);
                    BooksIssuedList.l[k].setPreferredSize(new Dimension(300, 40));
                    BooksIssuedList.l[k].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k].setForeground(Color.green);
                    c.gridx = 0;
                    c.gridy = m;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k], c);
                    (BooksIssuedList.l[k + 1] = new JLabel(BooksIssuedList.d.bk[BooksIssuedList.d.s[this.position].bookIssuedNo[i]].title)).setOpaque(true);
                    BooksIssuedList.l[k + 1].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 1].setBackground(Color.WHITE);
                    BooksIssuedList.l[k + 1].setPreferredSize(new Dimension(400, 40));
                    BooksIssuedList.l[k + 1].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 1].setForeground(Color.darkGray);
                    c.gridx = 1;
                    c.gridy = m;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 1], c);
                    (BooksIssuedList.l[k + 2] = new JLabel("Author :")).setOpaque(true);
                    BooksIssuedList.l[k + 2].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 2].setBackground(Color.DARK_GRAY);
                    BooksIssuedList.l[k + 2].setPreferredSize(new Dimension(300, 40));
                    BooksIssuedList.l[k + 2].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 2].setForeground(Color.GREEN);
                    c.gridx = 0;
                    c.gridy = m + 1;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 2], c);
                    (BooksIssuedList.l[k + 3] = new JLabel(BooksIssuedList.d.bk[BooksIssuedList.d.s[this.position].bookIssuedNo[i]].author)).setOpaque(true);
                    BooksIssuedList.l[k + 3].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 3].setBackground(Color.WHITE);
                    BooksIssuedList.l[k + 3].setPreferredSize(new Dimension(400, 40));
                    BooksIssuedList.l[k + 3].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 3].setForeground(Color.darkGray);
                    c.gridx = 1;
                    c.gridy = m + 1;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 3], c);
                    (BooksIssuedList.l[k + 4] = new JLabel("ISBN :")).setOpaque(true);
                    BooksIssuedList.l[k + 4].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 4].setBackground(Color.darkGray);
                    BooksIssuedList.l[k + 4].setPreferredSize(new Dimension(300, 40));
                    BooksIssuedList.l[k + 4].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 4].setForeground(Color.GREEN);
                    c.gridx = 0;
                    c.gridy = m + 2;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 4], c);
                    (BooksIssuedList.l[k + 5] = new JLabel(BooksIssuedList.d.bk[BooksIssuedList.d.s[this.position].bookIssuedNo[i]].ISBN)).setOpaque(true);
                    BooksIssuedList.l[k + 5].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 5].setBackground(Color.WHITE);
                    BooksIssuedList.l[k + 5].setPreferredSize(new Dimension(400, 40));
                    BooksIssuedList.l[k + 5].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 5].setForeground(Color.darkGray);
                    c.gridx = 1;
                    c.gridy = m + 2;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 5], c);
                    (BooksIssuedList.l[k + 6] = new JLabel("Price :")).setOpaque(true);
                    BooksIssuedList.l[k + 6].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 6].setBackground(Color.DARK_GRAY);
                    BooksIssuedList.l[k + 6].setPreferredSize(new Dimension(300, 40));
                    BooksIssuedList.l[k + 6].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 6].setForeground(Color.green);
                    c.gridx = 0;
                    c.gridy = m + 3;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 6], c);
                    (BooksIssuedList.l[k + 7] = new JLabel(Double.toString(BooksIssuedList.d.bk[BooksIssuedList.d.s[this.position].bookIssuedNo[i]].price))).setOpaque(true);
                    BooksIssuedList.l[k + 7].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 7].setBackground(Color.WHITE);
                    BooksIssuedList.l[k + 7].setPreferredSize(new Dimension(400, 40));
                    BooksIssuedList.l[k + 7].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 7].setForeground(Color.darkGray);
                    c.gridx = 1;
                    c.gridy = m + 3;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 7], c);
                    (BooksIssuedList.l[k + 8] = new JLabel()).setOpaque(true);
                    BooksIssuedList.l[k + 8].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 8].setBackground(Color.GREEN);
                    BooksIssuedList.l[k + 8].setPreferredSize(new Dimension(300, 5));
                    BooksIssuedList.l[k + 8].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 8].setForeground(Color.darkGray);
                    c.gridx = 0;
                    c.gridy = m + 4;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 8], c);
                    (BooksIssuedList.l[k + 9] = new JLabel()).setOpaque(true);
                    BooksIssuedList.l[k + 9].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 9].setBackground(Color.GREEN);
                    BooksIssuedList.l[k + 9].setPreferredSize(new Dimension(400, 5));
                    BooksIssuedList.l[k + 9].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 9].setForeground(Color.darkGray);
                    c.gridx = 1;
                    c.gridy = m + 4;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 9], c);
                    BooksIssuedList.p[10].setBackground(Color.green);
                    m += 5;
                    k += 9;
                }
            }
            else {
                c.gridx = 0;
                c.gridy = 6;
                BooksIssuedList.p[10].add(BooksIssuedList.l[3], c);
            }
        }
        if (this.value == 2) {
            if (BooksIssuedList.d.f[this.position].temp != -1) {
                for (int i = 0; i <= BooksIssuedList.d.f[this.position].temp; ++i) {
                    (BooksIssuedList.l[k] = new JLabel("Title :")).setOpaque(true);
                    BooksIssuedList.l[k].setHorizontalAlignment(0);
                    BooksIssuedList.l[k].setBackground(Color.darkGray);
                    BooksIssuedList.l[k].setPreferredSize(new Dimension(300, 40));
                    BooksIssuedList.l[k].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k].setForeground(Color.green);
                    c.gridx = 0;
                    c.gridy = m;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k], c);
                    (BooksIssuedList.l[k + 1] = new JLabel(BooksIssuedList.d.bk[BooksIssuedList.d.f[this.position].bookIssuedNo[i]].title)).setOpaque(true);
                    BooksIssuedList.l[k + 1].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 1].setBackground(Color.WHITE);
                    BooksIssuedList.l[k + 1].setPreferredSize(new Dimension(400, 40));
                    BooksIssuedList.l[k + 1].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 1].setForeground(Color.darkGray);
                    c.gridx = 1;
                    c.gridy = m;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 1], c);
                    (BooksIssuedList.l[k + 2] = new JLabel("Author :")).setOpaque(true);
                    BooksIssuedList.l[k + 2].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 2].setBackground(Color.DARK_GRAY);
                    BooksIssuedList.l[k + 2].setPreferredSize(new Dimension(300, 40));
                    BooksIssuedList.l[k + 2].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 2].setForeground(Color.GREEN);
                    c.gridx = 0;
                    c.gridy = m + 1;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 2], c);
                    (BooksIssuedList.l[k + 3] = new JLabel(BooksIssuedList.d.bk[BooksIssuedList.d.f[this.position].bookIssuedNo[i]].author)).setOpaque(true);
                    BooksIssuedList.l[k + 3].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 3].setBackground(Color.WHITE);
                    BooksIssuedList.l[k + 3].setPreferredSize(new Dimension(400, 40));
                    BooksIssuedList.l[k + 3].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 3].setForeground(Color.darkGray);
                    c.gridx = 1;
                    c.gridy = m + 1;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 3], c);
                    (BooksIssuedList.l[k + 4] = new JLabel("ISBN :")).setOpaque(true);
                    BooksIssuedList.l[k + 4].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 4].setBackground(Color.darkGray);
                    BooksIssuedList.l[k + 4].setPreferredSize(new Dimension(300, 40));
                    BooksIssuedList.l[k + 4].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 4].setForeground(Color.GREEN);
                    c.gridx = 0;
                    c.gridy = m + 2;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 4], c);
                    (BooksIssuedList.l[k + 5] = new JLabel(BooksIssuedList.d.bk[BooksIssuedList.d.f[this.position].bookIssuedNo[i]].ISBN)).setOpaque(true);
                    BooksIssuedList.l[k + 5].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 5].setBackground(Color.WHITE);
                    BooksIssuedList.l[k + 5].setPreferredSize(new Dimension(400, 40));
                    BooksIssuedList.l[k + 5].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 5].setForeground(Color.darkGray);
                    c.gridx = 1;
                    c.gridy = m + 2;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 5], c);
                    (BooksIssuedList.l[k + 6] = new JLabel("Price :")).setOpaque(true);
                    BooksIssuedList.l[k + 6].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 6].setBackground(Color.DARK_GRAY);
                    BooksIssuedList.l[k + 6].setPreferredSize(new Dimension(300, 40));
                    BooksIssuedList.l[k + 6].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 6].setForeground(Color.green);
                    c.gridx = 0;
                    c.gridy = m + 3;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 6], c);
                    (BooksIssuedList.l[k + 7] = new JLabel(Double.toString(BooksIssuedList.d.bk[BooksIssuedList.d.f[this.position].bookIssuedNo[i]].price))).setOpaque(true);
                    BooksIssuedList.l[k + 7].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 7].setBackground(Color.WHITE);
                    BooksIssuedList.l[k + 7].setPreferredSize(new Dimension(400, 40));
                    BooksIssuedList.l[k + 7].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 7].setForeground(Color.darkGray);
                    c.gridx = 1;
                    c.gridy = m + 3;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 7], c);
                    (BooksIssuedList.l[k + 8] = new JLabel()).setOpaque(true);
                    BooksIssuedList.l[k + 8].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 8].setBackground(Color.GREEN);
                    BooksIssuedList.l[k + 8].setPreferredSize(new Dimension(300, 5));
                    BooksIssuedList.l[k + 8].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 8].setForeground(Color.darkGray);
                    c.gridx = 0;
                    c.gridy = m + 4;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 8], c);
                    (BooksIssuedList.l[k + 9] = new JLabel()).setOpaque(true);
                    BooksIssuedList.l[k + 9].setHorizontalAlignment(0);
                    BooksIssuedList.l[k + 9].setBackground(Color.GREEN);
                    BooksIssuedList.l[k + 9].setPreferredSize(new Dimension(400, 5));
                    BooksIssuedList.l[k + 9].setFont(new Font("Arial", 1, 20));
                    BooksIssuedList.l[k + 9].setForeground(Color.darkGray);
                    c.gridx = 1;
                    c.gridy = m + 4;
                    BooksIssuedList.p[10].add(BooksIssuedList.l[k + 9], c);
                    BooksIssuedList.p[10].setBackground(Color.green);
                    m += 5;
                    k += 9;
                }
            }
            else {
                c.gridx = 0;
                c.gridy = 6;
                BooksIssuedList.p[10].add(BooksIssuedList.l[3], c);
            }
        }
        final JScrollPane pane = new JScrollPane(BooksIssuedList.p[10], 22, 31);
        BooksIssuedList.b[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent s) {
                pane.remove(Gui.p[10]);
                Gui.j.remove(pane);
                final Dashboard d = new Dashboard();
            }
        });
        BooksIssuedList.j.add(pane);
        BooksIssuedList.j.setVisible(true);
        BooksIssuedList.j.setExtendedState(6);
        BooksIssuedList.j.setDefaultCloseOperation(3);
    }
}
