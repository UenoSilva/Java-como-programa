/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo9.commissionemployer;

/**
 *
 * @author Ueno Souza Silva
 */
public class CommissionEmployerTest {
    
    public static void main(String[] args){
        
        CommissionEmployer employer = new CommissionEmployer("Sue", "Jones", "22-222-2222", 10000, 0.06);
        
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employer.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employer.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employer.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employer.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employer.getCommissionRate());
        
        employer.setGrossSales(5000);
        employer.setCommissionRate(.1);
        
        System.out.printf("%n%s:%n%n%s%n", "Update employee information obtained by toString", employer);
    }
    
}
