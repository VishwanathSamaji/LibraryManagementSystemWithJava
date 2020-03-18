// 
// Decompiled by Procyon v0.5.36
// 

package librarymanagementsystem;

import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JLabel;

public class Welcome implements Gui
{
    Welcome() {
        this.gui();
    }
    
    @Override
    public void gui() {
        (Welcome.l[2] = new JLabel(" LIBRARY MANAGEMENT SYSTEM ")).setOpaque(true);
        Welcome.l[2].setHorizontalAlignment(0);
        Welcome.l[2].setBackground(Color.yellow);
        Welcome.l[2].setPreferredSize(new Dimension(1100, 80));
        Welcome.l[2].setFont(new Font("Arial", 1, 60));
        Welcome.l[2].setForeground(Color.black);
        final GridBagConstraints c = new GridBagConstraints();
        (Welcome.p[2] = new JPanel(new GridBagLayout())).setBackground(Color.green);
        c.gridx = 0;
        c.gridy = 0;
        Welcome.p[2].add(Welcome.l[2], c);
        Welcome.j.add(Welcome.p[2]);
        Welcome.j.setExtendedState(6);
        Welcome.j.setVisible(true);
        Welcome.j.setDefaultCloseOperation(3);
        try {
            Thread.sleep(4000L);
            Welcome.j.remove(Welcome.p[2]);
            final Login login = new Login();
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
