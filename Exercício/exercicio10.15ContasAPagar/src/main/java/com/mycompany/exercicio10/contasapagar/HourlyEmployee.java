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
public class HourlyEmployee extends Employee {
    
    private double wage; //valor por hora
    private double hours; //horas trabalhadas

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, double hours ) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        
        if(wage < 0.0)
            throw new IllegalArgumentException("Wage must be >= 0.0");
        if(hours < 0 || hours > 168.0)
            throw new IllegalArgumentException("Hours worked must be >= 0.0 or < 168.0");
        
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0)
            throw new IllegalArgumentException("Wage must be >= 0.0");
        
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours < 0 || hours > 168.0)
            throw new IllegalArgumentException("Hours worked must be >= 0.0 or < 168.0");
        
        this.hours = hours;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getPaymentAmount(){
        if(getHours() <= 40.0)
            return getHours() * getWage();
        else
            return (40.0 * getWage()) + ((getHours() - 40.0) * getWage() * 1.5); 
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %n%s: %.2f %n%s: %.2f",
                "hourly", super.toString(),
                "hourly wage", getWage(),
                "Hours worked", getHours());
    }
}
