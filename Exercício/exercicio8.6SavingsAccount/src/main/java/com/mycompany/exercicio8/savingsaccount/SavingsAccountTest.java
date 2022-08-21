
package com.mycompany.exercicio8.savingsaccount;

/**
 *
 * @author Ueno Souza Silva
 */
public class SavingsAccountTest {
    
    public static void main(String[] args){
        
        SavingsAccount serve1 = new SavingsAccount(3000.0);
        SavingsAccount serve2 = new SavingsAccount(2000.0);
        
        serve1.modifyInterestRate(0.04);
        serve1.calculateMontlyInterest();
        System.out.println(serve1.toString());
        
        serve1.modifyInterestRate(0.05);
        serve1.calculateMontlyInterest();
        System.out.println(serve1.toString());
        
        serve2.modifyInterestRate(0.04);
        serve2.calculateMontlyInterest();
        System.out.println(serve2.toString());
        
        serve2.modifyInterestRate(0.05);
        serve2.calculateMontlyInterest();
        System.out.println(serve2.toString());

    }
    
}
