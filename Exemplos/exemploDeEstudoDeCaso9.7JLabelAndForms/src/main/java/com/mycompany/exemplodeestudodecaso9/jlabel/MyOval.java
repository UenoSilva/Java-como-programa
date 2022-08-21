
package com.mycompany.exemplodeestudodecaso9.jlabel;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ueno Souza Silva
 */
public class MyOval {
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color cor;
    private boolean flag;
    
    public MyOval(){
        this.cor = Color.BLACK;
        this.flag = false;
    }

    public MyOval(int x1, int y1, int x2, int y2, Color cor, boolean flag) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setCor(cor);
        setFlag(flag);
    }
    
    //calcula a coordenada x superior
    public int getUpperLeftX(){
        if(getX1() < getX2())
            return getX1();
        else
            return getX2();
    }
    
    //calcula a coordenada y superior
    public int getUpperLeftY(){
        if(getY1() < getY2())
            return getY1();
        else
            return getY2();
    }
    
    //calcula a largura
    public int getWidth(){
        return Math.abs(getX1() - getX2());
    }
    
    //calcula a altura
    public int getHeight(){
        return Math.abs(getY1() - getY2());
    }
    
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if(x1 >= 0)
            this.x1 = x1;
        else
            this.x1 = 0;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if(y1 >= 0)
            this.y1 = y1;
        else
            this.y1 = 0;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if(x2 >= 0)
            this.x2 = x2;
        else
            this.x2 = 0;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if(y2 >= 0)
            this.y2 = y2;
        else
            this.y2 = 0;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    /**
     *
     * @param g
     */
    public void draw(Graphics g){
        g.setColor(getCor());
        if(isFlag() == true){
            g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        }else{
            g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        }
        
    }
    
}
