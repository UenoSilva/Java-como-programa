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
public abstract class Employee {
    
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s%nsocial security number: %s", 
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    
    //método abstrato deve ser sobrescrito pelas subclasses concretas  
    public abstract double earnings(); //nenhuma implementação aqui
}
