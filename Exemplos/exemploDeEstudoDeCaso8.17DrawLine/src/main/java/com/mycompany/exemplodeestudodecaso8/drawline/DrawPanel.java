
package com.mycompany.exemplodeestudodecaso8.drawline;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 *
 * @author Ueno Souza Silva
 */
public class DrawPanel extends JPanel{
    
    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines; //array de linhas
    
    public DrawPanel(){
        
        setBackground(Color.WHITE);
        
        lines = new MyLine[5 + randomNumbers.nextInt(5)];
        
        //criar as linhas
        for(int count = 0; count < lines.length; count++){
            
            //coordenadas aleatórias
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            
            //gera um cor aleatória
            Color cor = new Color(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            
            //adiciona a linha à lista de linhas a ser exibida 
            lines[count] = new MyLine(x1, y1, x2, y2, cor);
        }
    }
    
    //para cada array de forma, desenha as formas individuais
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //desenha as linhas
        for(MyLine line : lines){
            line.draw(g);
        }
    }
    
}
