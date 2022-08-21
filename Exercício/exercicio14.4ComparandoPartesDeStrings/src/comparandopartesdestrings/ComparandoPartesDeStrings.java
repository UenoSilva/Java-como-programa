/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparandopartesdestrings;

import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class ComparandoPartesDeStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um nome: ");
        String s1 = scanner.next();
        System.out.println("Digite um nome: ");
        String s2 = scanner.next();
        
        
        if(s1.toLowerCase().regionMatches(0, s2.toLowerCase(), 0, s2.length()))
            System.out.println("São iguais");
        else 
            System.out.println("Não são iguais");
        
    }
    
}
