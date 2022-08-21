/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo10.employee;

/**
 *
 * @author Ueno Souza Silva
 */
public class SalariedEmployee extends Employee {
    
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialNumberSecurity, double weeklySalary) {
        super(firstName, lastName, socialNumberSecurity);
        
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        
        this.weeklySalary = this.weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }
    
    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: $%,.2f", 
                super.toString(), "weekly salary", getWeeklySalary());
    }
}
