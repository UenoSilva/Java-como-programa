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
public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double grossSales, double commissionRate, double baseSalary ) {
        super(firstName, lastName, socialSecurityNumber, birthDate, grossSales, commissionRate);
        
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getPaymentAmount(){
        return getBaseSalary() + super.getPaymentAmount();
    }
    
    @Override
    public String toString(){
        return String.format("%s %s; %n%s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
