
package com.mycompany.exerciciodeestudodecaso8.drawovalerect;

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
    private MyRectangle[] rectangle;
    private MyOval[] oval;
    private MyLine[] line;
    
    public DrawPanel(){
        
        setBackground(Color.WHITE);
        
        boolean flag = false;
        rectangle = new MyRectangle[1 + randomNumbers.nextInt(5)];
        oval = new MyOval[1 + randomNumbers.nextInt(5)];
        line = new MyLine[1 + randomNumbers.nextInt(5)];
        
        for(int count = 0; count < rectangle.length; count++){
            int x1 = randomNumbers.nextInt(500);
            int y1 = randomNumbers.nextInt(500);
            int x2 = randomNumbers.nextInt(500);
            int y2 = randomNumbers.nextInt(500);
            int f = 1 + randomNumbers.nextInt(2);
            
            Color corR = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256),
                                   randomNumbers.nextInt(256));
            
            switch(f){
                case 1:
                    flag = false;
                    break;
                case 2:
                    flag = true;
            }
            
            rectangle[count] = new MyRectangle(x1, y1, x2, y2, corR, flag);
        }
        
        for(int count = 0; count < oval.length; count++){
            int x1 = randomNumbers.nextInt(500);
            int y1 = randomNumbers.nextInt(500);
            int x2 = randomNumbers.nextInt(500);
            int y2 = randomNumbers.nextInt(500);
            int f = 1 + randomNumbers.nextInt(2);
            
            Color corR = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256),
                                   randomNumbers.nextInt(256));
            
            switch(f){
                case 1:
                    flag = false;
                    break;
                case 2:
                    flag = true;
            }
            
            oval[count] = new MyOval(x1, y1, x2, y2, corR, flag);
        }
        
        for(int count = 0; count < line.length; count++){
            int x1 = randomNumbers.nextInt(500);
            int y1 = randomNumbers.nextInt(500);
            int x2 = randomNumbers.nextInt(500);
            int y2 = randomNumbers.nextInt(500);
            int f = 1 + randomNumbers.nextInt(2);
            
            Color corR = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256),
                                   randomNumbers.nextInt(256));
            
            switch(f){
                case 1:
                    flag = false;
                    break;
                case 2:
                    flag = true;
            }
            
            line[count] = new MyLine(x1, y1, x2, y2, corR);
        }
    }
     
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(MyRectangle r : rectangle){
            r.draw(g); 
        }
        
        for(MyOval o : oval){
            o.draw(g);
        }
        
        for(MyLine l : line){
            l.draw(g);
        }
    }
}
