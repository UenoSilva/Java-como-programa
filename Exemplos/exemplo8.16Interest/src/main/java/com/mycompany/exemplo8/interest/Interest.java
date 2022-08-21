// Exemplo 8.16: Interest.java
// Cálculos de juros compostos com BigDecimal.

package com.mycompany.exemplo8.interest;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author Ueno Souza Silva
 */
public class Interest {
    
    public static void main(String[] args){
        
        BigDecimal principal = new BigDecimal(1000.0);
        BigDecimal rate = new BigDecimal(0.05);
        
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        
        for(int year = 1; year <= 10; year++){
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
            
        }
    }
    
}
