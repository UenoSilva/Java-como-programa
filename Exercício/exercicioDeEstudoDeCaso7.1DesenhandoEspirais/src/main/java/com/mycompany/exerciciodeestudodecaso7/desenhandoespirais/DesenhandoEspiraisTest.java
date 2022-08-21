// Exercício de estudo de caso 7.1: DesenhandoEspiraisTest.java

package com.mycompany.exerciciodeestudodecaso7.desenhandoespirais;

import javax.swing.JFrame;

/**
 *
 * @author Ueno Souza Silva
 */
public class DesenhandoEspiraisTest {
    
    public static void main(String[] args){
        
        DesenhandoEspirais panel = new DesenhandoEspirais();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(350, 500);
        application.setVisible(true);
    }
    
}
