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
public class CommissionEmployee extends Employee{
    
    private double grossSales; //salário bruto
    private double commissionRate; //taxa de comissão

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double grossSales, double commissionRate ) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 or < 1.0");
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 or < 1.0");
        
        this.commissionRate = commissionRate;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getPaymentAmount(){
        return getCommissionRate() * getGrossSales();
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %n%s: %.2f %n%s: %.2f",
                "commission", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
