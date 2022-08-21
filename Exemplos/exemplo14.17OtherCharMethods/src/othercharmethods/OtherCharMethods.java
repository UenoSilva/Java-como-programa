/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package othercharmethods;

/**
 *
 * @author Ueno Souza Silva
 */
public class OtherCharMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Character c1 = 'A';
        Character c2 = 'a';
        
        System.out.printf("c1 = %s%nc2 = %s%n", c1.charValue(), c2.toString());
        
        if(c1.equals(c2)){
            System.out.println("c1 and c2 are equals%n");
        }
        else{
            System.out.println("c1 and c2 not are equals");
        }
    }
    
}
