/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareTo;

/**
 *
 * @author Ueno Souza Silva
 */
public class StringCompareTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s1 = "Souz";
        String s2 = "souza";
        
        int compareTo = s1.compareTo(s2);
        
        if(s1.compareTo(s2) < 0)
            System.out.println("menor");
        else if(s1.compareTo(s2) == 0)
            System.out.println("igual");
        else
            System.out.println("maior");
        
        
    }
    
}
