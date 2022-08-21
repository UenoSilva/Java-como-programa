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
    static int line;
    static int oval;
    static int rect;

    public DrawPanel() {
        
        setBackground(Color.WHITE);
        
        boolean flag = false;
        shape = new MyShape[1 + randomNumbers.nextInt(10)];
        
        for(int cont = 0; cont < shape.length; cont++){
            
            int x1 = 1 + randomNumbers.nextInt(500); //coordenada x1
            int y1 = 1 + randomNumbers.nextInt(500); //coordenada y1
            int x2 = 1 + randomNumbers.nextInt(500); //coordenada x2
            int y2 = 1 + randomNumbers.nextInt(500); //coordenada y2
            int f = 1 + randomNumbers.nextInt(2); //1 para flag == verdadeiro, 2 para flag == falso
            int a = 1 + randomNumbers.nextInt(3); //sortear 3 números que representão uma linha, oval e retangulo
            
            Color cor = new Color(1+randomNumbers.nextInt(256), 1+randomNumbers.nextInt(256), 1+randomNumbers.nextInt(256));
            
            switch(f){
                case 1:
                    flag = false;
                    break;
                case 2:
                    flag = true;
                    break;
            }
            
            switch(a){
                case 1:
                    shape[cont] = new MyLine(x1, y1, x2, y2, cor);
                    line++;
                    break;
                case 2:
                    shape[cont] = new MyOval(x1, y1, x2, y2, cor, flag);
                    oval++;
                    break;
                case 3:
                    shape[cont] = new MyRectangle(x1, y1, x2, y2, cor, flag);
                    rect++;
                    break;
            }
            
        }
        
    }
    
    public String rotulo(){
        return String.format("%s: %d, %s: %d, %s: %d", 
                            "Line", line,
                            "Oval", oval,
                            "Rect", rect);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(MyShape s: shape)
            s.draw(g);
    }
    
}
