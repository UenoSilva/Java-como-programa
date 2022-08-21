// Exercício 7.16: ForAprimorado.java

package com.mycompany.exercicio7.foraprimorado;

/**
 *
 * @author Ueno Souza Silva
 */
public class ForAprimorado {
    
    public static void main(String[] args){
        
        args = new String[2];
        
        args[0] = "4";
        args[1] = "4";
        
        int total = 0;
        
        for(String a : args){
            total += parseDouble(a);
        }
        System.out.println(total);
    }
    
    public static int parseDouble(String a){
        int num = Integer.parseInt(a);
        return num;
    }
            
}
