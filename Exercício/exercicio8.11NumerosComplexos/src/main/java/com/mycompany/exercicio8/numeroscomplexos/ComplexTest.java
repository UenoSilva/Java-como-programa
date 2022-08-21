//Exercicio 8.11: Números complexos

package com.mycompany.exercicio8.numeroscomplexos;

/**
 *
 * @author Ueno Souza Silva
 */
public class ComplexTest {
    
    public static void main(String[] args){
        Complex co = new Complex();
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(8, -1);
        
        //co.somarReal(c1, c2);
        co.subtrairReal(c1, c2);
        
        System.out.println(co.toString());
        
        System.out.println("");
    }
    
}
