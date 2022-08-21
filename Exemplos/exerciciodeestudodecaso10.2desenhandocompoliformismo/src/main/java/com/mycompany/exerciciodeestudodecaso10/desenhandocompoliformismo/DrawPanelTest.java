
package com.mycompany.exerciciodeestudodecaso10.desenhandocompoliformismo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ueno Souza Silva
 */
public class DrawPanelTest {

    public static void main(String[] args) {
        
        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();
        
        JLabel rotulo = new JLabel(panel.rotulo());
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.add(rotulo, BorderLayout.SOUTH);
        app.setSize(500, 500);
        app.setVisible(true);
    }
    
}
