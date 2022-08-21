/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Ueno Souza Silva
 */
public class CheckBox extends JFrame{
    private final JTextField textField;
    private final JCheckBox boldJCheckBox;
    private final JCheckBox italicJCheckBox;
    
    public CheckBox(){
        super("JCheckBox Test");
        setLayout(new FlowLayout());
        
        textField = new JTextField("Veja o estilo da fonte mudar", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);
        
        boldJCheckBox = new JCheckBox("Bold");
        add(boldJCheckBox);
        
        italicJCheckBox = new JCheckBox();
        add(italicJCheckBox);
        
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
    }

    private class CheckBoxHandler implements ItemListener {

        public CheckBoxHandler() {
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font = null;
            
            if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if(boldJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if(italicJCheckBox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN, 14);
            
            textField.setFont(font);
        }
    }
}
