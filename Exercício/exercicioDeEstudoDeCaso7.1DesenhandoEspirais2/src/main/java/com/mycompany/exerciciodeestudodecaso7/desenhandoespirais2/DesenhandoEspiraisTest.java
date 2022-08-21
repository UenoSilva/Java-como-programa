/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciodeestudodecaso7.desenhandoespirais2;

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
        application.setSize(400, 400);
        application.setVisible(true);
    }
    
}

