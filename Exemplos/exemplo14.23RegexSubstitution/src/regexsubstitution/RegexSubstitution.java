/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexsubstitution;

import java.util.Arrays;

/**
 *
 * @author Ueno Souza Silva
 */
public class RegexSubstitution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String firstString = "This sentence ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";
        
        System.out.printf("Original String 1: %s%n", firstString);
        
        firstString = firstString.replaceAll("\\*", "^");
        
        System.out.printf("^ substitution for *: %s%n", firstString);
        
        firstString = firstString.replaceAll("stars", "carets");
        
        System.out.printf("\"carets\" substituted for \"stars\": %s%n", firstString);
        System.out.printf("Every word replace by \"word\": %s%n%n", firstString.replaceAll("\\w+", "word"));
        
        System.out.printf("Original String 2: %s%n", secondString);
        
        for(int i = 0; i < 3; i++)
            secondString = secondString.replaceFirst("\\d", "digit");
        
        System.out.printf("First 3 digits replaced by \"digit\": %s%n", secondString);
        
        System.out.print("String split at commas: ");
        String[] results = secondString.split(",\\s*");
        System.out.println(Arrays.toString(results));
    }
    
}
