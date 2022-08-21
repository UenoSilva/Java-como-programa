
package com.mycompany.exemplodeestudodecaso9.jlabel;

import java.awt.BorderLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ueno Souza Silva
 */
public class DrawTest {
    
    public static void main(String[] args){
        
        DrawPanel panel = new DrawPanel();
        JLabel rotulo = new JLabel(panel.legenda());
        
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        app.add(panel);
        app.add(rotulo, BorderLayout.SOUTH);
        app.setSize(500, 600);
        app.setVisible(true);
        
    }
    
}
