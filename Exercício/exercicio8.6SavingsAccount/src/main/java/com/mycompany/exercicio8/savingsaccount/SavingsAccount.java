// Exercício 8.6: SavingsAccount.java
// Calcular os juros anuais de um depósito.

package com.mycompany.exercicio8.savingsaccount;

/**
 *
 * @author Ueno Souza Silva
 */
public class SavingsAccount {
    
    private double savingsBalance;
    static double annualInterestRate;

    public SavingsAccount(double savingsBalance) {
        
        if(savingsBalance < 1)
            throw new IllegalArgumentException("O valor não pode ser abixo de 1%");
        
        this.savingsBalance = savingsBalance;
    }
    
    public double calculateMontlyInterest(){
        this.savingsBalance = this.savingsBalance * (1 + annualInterestRate/12);
        
        return this.savingsBalance; 
    }
    
    public static void modifyInterestRate(double annualInterestRate) {
        
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    @Override
    public String toString() {
        return String.format("Saldo no deposito: R$ %.2f%n Juros à %.2f%n", getSavingsBalance(), SavingsAccount.annualInterestRate);
    }
    
    
    
    
}
