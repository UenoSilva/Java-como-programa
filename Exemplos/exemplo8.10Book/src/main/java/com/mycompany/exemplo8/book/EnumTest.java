// Exemplo 8.11: EnumTest.java
// Testanto do tipo enum Book
package com.mycompany.exemplo8.book;

import java.util.EnumSet;

/**
 *
 * @author Ueno Souza Silva
 */
public class EnumTest {
    
    public static void main(String[] args){
        
        System.out.println("All Books:");
        for(Book book : Book.values()){
            System.out.printf("%-15s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
        }
        
        System.out.printf("%nDisplay of range of enum constants:%n");
            
        
        for(Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)){
            System.out.printf("%-15s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
        }
    }
    
}
