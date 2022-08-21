//Exemplo 7.25: DrawRainbow.java
//Desenhando um arco-íris com arcos e um array de cores.

package com.mycompany.exemplo7.drawrainbow;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ueno Souza Silva
 */
public class DrawRainbow extends JPanel{
    
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);
    
    //Array de cores.
    private Color[] colors = {Color.WHITE, Color.WHITE, VIOLET, INDIGO,
                              Color.BLUE, Color.GREEN, Color.YELLOW,
                              Color.ORANGE, Color.RED};
    
    //Construtor
    public DrawRainbow(){
        setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int radius = 20;
        
        int centerX = getHeight() / 2;
        int centerY = getWidth() - 10;
        
        for(int counter = colors.length; counter > 0; counter--){
            g.setColor(colors[counter-1]);
            
            g.fillArc(centerX-counter*radius+20, centerY-counter*radius, 
                      counter*radius*2, counter*radius*2, 
                      0, 180);
        }
    }
    
}
