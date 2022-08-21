
package com.mycompany.exerciciodeestudodecaso10.desenhandocompoliformismo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ueno Souza Silva
 */
public class MyOval extends MyBoundedShape{

    public MyOval(boolean flag) {
        super(flag);
    }

    public MyOval(int x1, int y1, int x2, int y2, Color cor, boolean flag) {
        super(x1, y1, x2, y2, cor, flag);
    }

    @Override
    public void draw(Graphics g){
        g.setColor(getCor());
        if(isFlag() == true)
            g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
        else
            g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
    }
    
}
