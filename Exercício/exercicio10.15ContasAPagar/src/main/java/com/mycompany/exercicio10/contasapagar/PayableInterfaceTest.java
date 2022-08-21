/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio10.contasapagar;

/**
 *
 * @author Ueno Souza Silva
 */
public class PayableInterfaceTest {
    
    public static void main (String[] args){
        
        Payable[] payableObjects = new Payable[100];
        
        payableObjects[0] = new Invoice("03456", "Engrenagem", 5, 45.78);
        payableObjects[1] = new Invoice("04567", "Porca", 10, 23.56);
        payableObjects[2] = new SalariedEmployee("Carlos", "Arguiar", "1111-11-111", new Date(5, 12, 1989), 500.0);
        payableObjects[3] = new HourlyEmployee("Bruna", "Carlar", "2222-22-222", new Date(23, 5, 1980), 30.0, 45.0);
        payableObjects[4] = new CommissionEmployee("Ester", "Rodrigues", "3333-33-333", new Date(12, 12, 1979), 10000.0, 0.15);
        payableObjects[5] = new BasePlusCommissionEmployee("João", "Sousa", "4444-44-444", new Date(30, 3, 2000), 4000.0, 0.10, 1000.0);
        
        for(Payable currentPayable :  payableObjects){
            
            if(currentPayable != null){
                System.out.println(currentPayable);
            
                if(currentPayable instanceof BasePlusCommissionEmployee){
                    BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;

                    employee.setBaseSalary(employee.getBaseSalary() * 1.10);
                    System.out.printf("Novo sálario: $%,.2f%n", employee.getBaseSalary());
                }

                System.out.printf("paymente due: $%,.2f%n%n", currentPayable.getPaymentAmount());
            } 
        }
    }
    
}
