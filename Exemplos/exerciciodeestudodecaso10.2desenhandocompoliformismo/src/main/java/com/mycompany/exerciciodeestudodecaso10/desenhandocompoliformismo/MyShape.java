package com.mycompany.exerciciodeestudodecaso10.desenhandocompoliformismo;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MyShape {
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color cor;

    public MyShape() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.cor = Color.BLACK;
    }

    public MyShape(int x1, int y1, int x2, int y2, Color cor) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setCor(cor);
    }
    
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        //verificar se o parmentro do método é maior ou igual a 0, senão seta em 0
        if(x1 >= 0)
            this.x1 = x1;
        else
            this.x1 = 0;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        //verificar se o parmentro do método é maior ou igual a 0, senão seta em 0
        if(y1 >= 0)
            this.y1 = y1;
        else
            this.y1 = 0;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        //verificar se o parmentro do método é maior ou igual a 0, senão seta em 0
        if(x2 >= 0)
            this.x2 = x2;
        else
            this.x2 = 0;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        //verificar se o parmentro do método é maior ou igual a 0, senão seta em 0
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

    /**
     *
     * @param g
     */
    public abstract void draw(Graphics g);
    
 
}
