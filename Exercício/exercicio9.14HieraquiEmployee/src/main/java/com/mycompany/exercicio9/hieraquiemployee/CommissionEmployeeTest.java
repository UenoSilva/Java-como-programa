/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio9.hieraquiemployee;

/**
 *
 * @author Ueno Souza Silva
 */
public class CommissionEmployeeTest {
    
    public static void main(String[] args){
        
        CommissionEmployee employee = new CommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04);
        
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
    }
    
}
