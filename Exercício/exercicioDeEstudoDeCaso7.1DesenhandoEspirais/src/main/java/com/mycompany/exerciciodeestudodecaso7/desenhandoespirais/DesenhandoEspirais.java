// Exercício de estudo de caso 7.1: DesenhandoEspirais.java
// Desenhando espirais utilizando com drawArc.

package com.mycompany.exerciciodeestudodecaso7.desenhandoespirais;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ueno Souza Silva
 */
public class DesenhandoEspirais extends JPanel{
    
    public DesenhandoEspirais(){
        setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int radius = 20;
        int radius2 = 20;
        
        int centerX = getHeight()/3;
        int centerY = getWidth()-6;
        
        for(int counter = 1; counter < 16; counter++){
            g.setColor(Color.red);
            
            //g.drawLine(centerX-counter*radius, centerY-counter*radius, 
            //           counter*radius*2, counter*radius*2);
            
            g.drawArc(centerX-counter*radius, centerY-counter*radius+10, 
                      counter*radius*2, counter*radius*2, 0, 180);
            
            g.drawArc(centerX-counter*radius2, centerY-counter*radius2, 
                      counter*radius2*2+20, counter*radius2*2+20, 0, -180);
        }
    }
    
}
