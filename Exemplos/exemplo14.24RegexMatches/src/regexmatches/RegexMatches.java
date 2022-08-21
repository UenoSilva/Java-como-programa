/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexmatches;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ueno Souza Silva
 */
public class RegexMatches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        
        String string1 = "Jane's Birthday is 05-12-75\n"
                       + "Dave's Birthday is 11-04-68\n"
                       + "John's Birthday is 04-28-73\n"
                       + "Joe's Birthday is 12-17-77";
        
        Matcher matcher = expression.matcher(string1);
        
        while(matcher.find())
            System.out.println(matcher.group());
    }
    
}
