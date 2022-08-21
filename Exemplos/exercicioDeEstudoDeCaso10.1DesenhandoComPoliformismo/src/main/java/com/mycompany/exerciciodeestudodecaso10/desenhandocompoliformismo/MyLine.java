/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciodeestudodecaso10.desenhandocompoliformismo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ueno Souza Silva
 */
public class MyLine extends MyShape{

    public MyLine() {
    }

    public MyLine(int x1, int y1, int x2, int y2, Color cor) {
        super(x1, y1, x2, y2, cor);
    }
    
    @Override
    public String toString(){
        return "line";
    }
    
    /**
     *
     * @param g
     */
    @Override
    public void draw(Graphics g){
        g.setColor(getCor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }
}
