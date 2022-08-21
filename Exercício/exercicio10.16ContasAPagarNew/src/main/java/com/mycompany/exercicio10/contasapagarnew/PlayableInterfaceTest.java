/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio10.contasapagarnew;

/**
 *
 * @author Ueno Souza Silva
 */
public class PlayableInterfaceTest {

    public static void main(String[] args) {
        
        Payable[] payableObjects = new Payable[4];
        
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("456789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "1111-11-111", 800);
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "8888-88-888", 1200);
        
        System.out.println("Invoice and Employees processed polymorphically:");
        
        for(Payable currentPayable : payableObjects){
            System.out.printf("%n%s %n%s %,.2f%n", currentPayable.toString(),
                    "payment due", currentPayable.getPaymentAmount());
        }
        
    }
    
}
