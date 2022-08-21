/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo12.labelframe;

import java.awt.FlowLayout;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Ueno Souza Silva
 */
public class LabelFrame extends JFrame{
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    //Constutor LabelFrame adicionar JLabel a JFrame
    public LabelFrame(){
        super("Testing label");
        setLayout(new FlowLayout()); //configura o layout de frame
        
        //construtor JLabel com string com argumento de string
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1); //adicionar label1 a JFrame
        
        //construtor JLabel com string, Icon e argumentos de alinhamento
        //URL see = getClass().getResource("/com/mycompany/exemplo12/labelframe/Imagens/besouro.png");
        
        ImageIcon bug = new ImageIcon(getClass().getResource("/imagens/bug.png"));
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);
        
        label3 = new JLabel();
        label3.setText("Label with icon and text bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}
