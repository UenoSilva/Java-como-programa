package com.mycompany.exemplo12.addtion;

import javax.swing.JOptionPane;

/**
 *
 * @author Ueno Souza Silva
 */
public class Addition {

    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Digite um número inteiro: ");
        String secondNumber = JOptionPane.showInputDialog(("Entre com um número inteiro:"));
        
        int n1 = Integer.parseInt(firstNumber);
        int n2 = Integer.parseInt(secondNumber);
        int soma = n1 + n2;
        
        JOptionPane.showMessageDialog(null, "A soma é " + soma, "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
    }
    
}
