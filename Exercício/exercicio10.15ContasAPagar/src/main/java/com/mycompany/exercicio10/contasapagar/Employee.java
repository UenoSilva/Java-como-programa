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
public abstract class Employee implements Payable {
    
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private Date birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s %n%s: %s %n%s: %s",
                "employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "birthday", getBirthDate());
    }
}
