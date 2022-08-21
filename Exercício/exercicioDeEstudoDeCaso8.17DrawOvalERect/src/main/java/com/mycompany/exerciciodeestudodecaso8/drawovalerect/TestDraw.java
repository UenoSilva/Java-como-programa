
package com.mycompany.exerciciodeestudodecaso8.drawovalerect;

import javax.swing.JFrame;

/**
 *
 * @author Ueno Souza Silva
 */
public class TestDraw {
    
    public static void main(String[] args){
        
        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(500, 500);
        app.setVisible(true);
    }
    
}
