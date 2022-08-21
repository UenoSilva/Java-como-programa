/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmiscellaneous;

/**
 *
 * @author Ueno Souza Silva
 */
public class StringMiscellaneous {

    public static void main(String[] args) {
        
        String s1 = new String("hello there");
        char[] charArray = new char[5];
        
        System.out.printf("S1 = %s%n", s1);
        System.out.printf("Length of s1 = %d%n", s1.length());
        System.out.printf("A string reversa é = ");
        for(int i = s1.length()-1; i >= 0; i--){
            System.out.printf("%c", s1.charAt(i));
        }
        System.out.printf("%nO caracter array is = ");
        s1.getChars(6, 11, charArray, 0);
        for(char caractere : charArray){
            System.out.print(caractere);
        }
        System.out.println();
    }
    
}
