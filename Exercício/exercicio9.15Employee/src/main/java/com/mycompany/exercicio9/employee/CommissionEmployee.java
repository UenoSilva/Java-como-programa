/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio9.employee;

/**
 *
 * @author Ueno Souza Silva
 */
public class CommissionEmployee extends Employee{
    
     private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        
        if(grossSales < 0.0)
            throw new IllegalArgumentException("O salário bruto não pode ser menor que 0.0");
        if(commissionRate < 0.0 || commissionRate > 1.0)
            throw new IllegalArgumentException("A taxa de comissão não pode ser menor que 0.0 ou maior que 1.0");
                    
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException("O salário bruto não pode ser menor que 0.0");
        
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate < 0.0 || commissionRate > 1.0)
            throw new IllegalArgumentException("A taxa de comissão não pode ser menor que 0.0 ou maior que 1.0");
        
        this.commissionRate = commissionRate;
    }
    
    public double earnings(){
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %.2f%n%s %.2f",
                super.toString(), 
                "gross sales:", getGrossSales(),
                "commission rate:", getCommissionRate());
    }
    
}
