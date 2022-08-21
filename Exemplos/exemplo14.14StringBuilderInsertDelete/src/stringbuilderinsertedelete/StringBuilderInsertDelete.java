/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderinsertedelete;

/**
 *
 * @author Ueno Souza Silva
 */
public class StringBuilderInsertDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a','b','c','d','e','f'};
        boolean booleanValue = true;
        char charactere = 'k';
        int integerValue = 7;
        long longValue = 1000000000L;
        float floatValue = 2.5f;
        double doubleValue = 3.33;
        
        StringBuilder buffer = new StringBuilder();
        
        buffer.insert(0, objectRef)
              .insert(0, " ")
              .insert(0, string)
              .insert(0, " ")
              .insert(0, charArray)
              .insert(0, " ")
              .insert(0, booleanValue)
              .insert(0, " ")
              .insert(0, charactere)
              .insert(0, " ")
              .insert(0, integerValue)
              .insert(0, " ")
              .insert(0, longValue)
              .insert(0, " ")
              .insert(0, floatValue)
              .insert(0, " ")
              .insert(0, doubleValue);
        
        System.out.printf("buffer after insert%n%s%n%n", buffer.toString());
        
        buffer.deleteCharAt(10);
        buffer.delete(2, 6);
             
        
        System.out.printf("buffer before delete%n%s%n%n", buffer.toString());
    }
    
}
