/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciodeestudodecaso10.desenhandocompoliformismo;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 *
 * @author Ueno Souza Silva
 */
public class DrawPanel extends JPanel{
    
    private MyShape[] shape;
    private SecureRandom randomNumbers = new SecureRandom();
    private int line;
    private int oval;
    private int rect;
    
    public DrawPanel(){
        
        setBackground(Color.WHITE);
        
        boolean flag = false;
        shape = new MyShape[1000];
        
        for(int i = 0; i < shape.length; i++){
            int x1 = 1 + randomNumbers.nextInt(1280);
            int y1 = 1 + randomNumbers.nextInt(1280);
            int x2 = 1 + randomNumbers.nextInt(1280);
            int y2 = 1 + randomNumbers.nextInt(1280);
            int f = 1 + randomNumbers.nextInt(2);
            int a = 1 + randomNumbers.nextInt(3);
            
            Color cor = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            
            switch(f){
                case 1:
                    flag = false;
                    break;
                case 2:
                    flag = true;
            }
            
            switch(a){
                case 1:
                    shape[i] = new MyLine(x1, y1, x2, y2, cor);
                    this.line++;
                    break;
                case 2:
                    shape[i] = new MyOval(x1, y1, x2, y2, cor, flag);
                    this.oval++;
                    break;
                case 3:
                    shape[i] = new MyRectangle(x1, y1, x2, y2, cor, flag);
                    this.rect++;
                    break;
            }
            
            
        }
        
    }
    
    public String legenda(){
        return String.format("Line: %s,oval: %d, rect: %d",line, oval, rect);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(MyShape s :  shape){
            s.draw(g);
        }
    }
   
    
}
