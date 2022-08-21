package com.mycompany.exemplo12.textfieldframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ueno Souza Silva
 */
public class TextFieldFrame extends JFrame {
    
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;
    
    public TextFieldFrame(){
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());
        
        //cria um texto com 10 linhas
        textField1 = new JTextField(10);
        add(textField1); //adicionando a JFrame
        
        //cria campo com texto padrão
        textField2 = new JTextField("Enter text here");
        add(textField2);
        
        //cria campo com texto padrão com 21 linhas
        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3);
        
        //cria campo de senha com texto padrão
        passwordField = new JPasswordField("Hidden text");
        add(passwordField);
        
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class TextFieldHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String string = " ";
            
            if(e.getSource() == textField1){
                string = String.format("textField1: %s", e.getActionCommand());       
            }
            else if(e.getSource() == textField2){
                string = String.format("textField2: %s", e.getActionCommand());
            }
            else if(e.getSource() == textField3){
                string = String.format("textField2: %s", e.getActionCommand());
            }  
            else if(e.getSource() == passwordField){
                string = String.format("passwordField: %s", e.getActionCommand());
            }
            
            JOptionPane.showMessageDialog(null, string);
        }
    }
    
}
