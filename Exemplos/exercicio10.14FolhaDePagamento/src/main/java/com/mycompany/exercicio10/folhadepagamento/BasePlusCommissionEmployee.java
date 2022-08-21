
package com.mycompany.exercicio10.folhadepagamento;

/**
 *
 * @author Ueno Souza Silva
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary; //sálario 

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
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
    public double earnings(){
        return super.earnings() + getBaseSalary();
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
    
}
