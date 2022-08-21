/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencasaleatorias;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Ueno Souza Silva
 */
public class SentencasAleatorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        String[] article = {"the", "a", "one", "some", "any"};
//        String[] noun = {"boy", "girl", "dog", "town", "car"};
//        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
//        String[] preposition = {"to", "from", "over", "under", "on"};
//        
//        Random randomNumbers = new Random(67); 
//        String frase = null;
//        
//        for(int i = 0; i < 20; i++){
//            
//            frase = article[randomNumbers.nextInt(4)]
//                    .concat(" ")
//                    .concat(noun[randomNumbers.nextInt(4)])
//                    .concat(" ")
//                    .concat(verbs[randomNumbers.nextInt(4)])
//                    .concat(" ")
//                    .concat(preposition[randomNumbers.nextInt(4)])
//                    .concat(" ")
//                    .concat(article[randomNumbers.nextInt(4)])
//                    .concat(" ")
//                    .concat(noun[randomNumbers.nextInt(4)])
//                    .concat(".");
//            
//            StringBuilder str = new StringBuilder(frase);
//            
//            char c = frase.charAt(0);
//            str.setCharAt(0, Character.toUpperCase(c));
//            
//            System.out.println(str);
//            
//        }
        
        String u = "ueno";
        
        char[] n = new char[u.length()];
        
        for(int i = 0; i < u.length(); i++){
            n[i] = u.charAt(i);
            System.out.print(n[i]);
        }
        
        System.out.println("");
        
        char aux = n[0]; //aux = u
        for(int j = 0; j < n.length-1; j++){
            n[j] = n[j+1];  //u = e, e = n, n = o, o = o
        }
        
        n[u.length()-1] = aux;
        
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i]);
        }
        System.out.println("");
        
        u = "";
        for(int i = 0; i < n.length; i++){
            u += n[i];
        }
        
        u = u+ "ay";
        
        System.out.println(u);
        
        
    }
    
}
