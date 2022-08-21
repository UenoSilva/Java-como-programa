/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latindeporco;

import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class LatinDePorcoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um frase: ");
        String frase = scanner.nextLine();
        
        LatinDePorco latinDePorco = new  LatinDePorco(frase);
        
        
        System.out.println(latinDePorco.printLatinDePorco());
       
    }
    
}
