// Exemplo 7.26: DrawRainbowTest.java
// Aplicativo de teste para exibir um arco-íris.

package com.mycompany.exemplo7.drawrainbow;

import javax.swing.JFrame;

/**
 *
 * @author Ueno Souza Silva
 */
public class DrawRainbowTest {
    
    public static void main(String[] args){
        
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 400);
        application.setVisible(true);
    }
    
}
