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
public class MyOval extends MyShape{
    
    private boolean flag;

    public MyOval() {
        this.flag = false;
    }

    public MyOval(int x1, int y1, int x2, int y2, Color cor, boolean flag) {
        super(x1, y1, x2, y2, cor);
        setFlag(flag);
    }
    
    //calcular o X superior
    public int getUpperLeftX(){
        if(getX1() < getX2()){
            return getX1();
        }else{
            return getX2();
        }
    }
    
    //Calcular o Y superior
    public int getUpperLeftY(){
        if(getY1() < getY2()){
            return getY1();
        }else{
            return getY2();
        }
    }
    
    //Calcular a largura
    public int getWidth(){
        return Math.abs(getX1() - getX2());
    }
    
    //calcular a altura
    public int getHeight(){
        return Math.abs(getY1() - getY2());
    }
    
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    @Override
    public String toString(){
        return "oval";
    }
    /**
     *
     * @param g
     */
    @Override
    public void draw(Graphics g){
        g.setColor(getCor());
        if(isFlag() == true){
            g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        }else{
            g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        }
    }
    
}
