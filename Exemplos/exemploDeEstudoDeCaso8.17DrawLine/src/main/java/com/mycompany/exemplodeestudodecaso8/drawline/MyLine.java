
package com.mycompany.exemplodeestudodecaso8.drawline;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ueno Souza Silva
 */
public class MyLine {
    
    private int x1; //coordenada x da primeira extremidade final
    private int y1; //coordenada y da primeira extremidade final
    private int x2; //coordenada x da segunda extremidade final
    private int y2; //coordenada x da segunda extremidade final
    private Color cor; // atribui uma cor a essa linha
    
    //Construtor com valores de entrada
    public MyLine(int x1, int y1, int x2, int y2, Color cor){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.cor = cor;
    }
    
    //Desenha a linha na cor especificada
    public void draw(Graphics g){
        g.setColor(cor);
        g.drawLine(x1, y1, x2, y2);
    }
    
}
