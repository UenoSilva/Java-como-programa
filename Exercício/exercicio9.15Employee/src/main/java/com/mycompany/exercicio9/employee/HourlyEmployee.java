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
public class HourlyEmployee extends Employee{
    
    private double hours; //horas trabalhadas
    private double wage; //valor por hora trabalhada

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        
        if(hours < 0 || hours > 168)
            throw new IllegalArgumentException("As horas devem ser maior que 0 e menor que 168");
        if(wage <= 0.0)
            throw new IllegalArgumentException("O valor por hora deve ser maior que 0.0");
        
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours < 0 || hours > 168)
            throw new IllegalArgumentException("As horas devem ser maior que 0 e menor que 168");
        
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage <= 0.0)
            throw new IllegalArgumentException("O valor por hora deve ser maior que 0.0");
        
        this.wage = wage;
    }
    
    public double earnings(){
        if(getHours() <= 40)
            return getHours() * getWage();
        else
            return 40.0*getWage()+(getHours()-40.0)*(getWage()*1.5);
        
    }
    @Override
    public String toString(){
        return String.format("%s%n%s %.2f%n%s %.2f", 
                super.toString(),
                "Horas trabalhas:", getHours(),
                "Valor por hora trabalhada:", getWage());
    }
    
    
}
