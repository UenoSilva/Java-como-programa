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
public class SalariedEmployee extends Employee{
    
    private double salary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber);
        
        if(salary < 0.0)
            throw new IllegalArgumentException("O salário deve ser maior ou igual a 0.0");
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0.0)
            throw new IllegalArgumentException("O salário deve ser maior ou igual a 0.0");
        
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %.2f", 
                super.toString(),
                "Salary:", getSalary());
    }

}
