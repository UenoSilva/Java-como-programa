//Exercício de estudo de caso 7.1: DesenhandoEspirais.java

package com.mycompany.exerciciodeestudodecaso7.desenhandoespirais2;

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
        
        int centerX = getHeight()/2;
        int centerY = getWidth()/2;
        
        for(int counter = 1; counter < 2; counter++){
            g.setColor(Color.red);
            
            g.drawLine(counter, 0, 
                    counter*radius*2, counter*radius*2);
        }
    }
    
}
