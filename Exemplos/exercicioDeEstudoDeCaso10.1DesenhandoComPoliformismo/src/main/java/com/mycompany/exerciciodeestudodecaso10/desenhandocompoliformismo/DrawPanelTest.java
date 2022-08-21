/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciodeestudodecaso10.desenhandocompoliformismo;

import java.awt.BorderLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Ueno Souza Silva
 */
public class DrawPanelTest{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DrawPanel panel = new DrawPanel();
        JLabel rotulo = new JLabel(panel.legenda());
        
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.add(rotulo, BorderLayout.SOUTH);
        app.setSize(1280, 720);
        app.setVisible(true);
        
        
    }
    
}
