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
public abstract class Employee implements Payable {
    
    private final String firstName;
    private final String lastName;
    private final String socialNumberSecurity;

    public Employee(String firstName, String lastName, String socialNumberSecurity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialNumberSecurity = socialNumberSecurity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialNumberSecurity() {
        return socialNumberSecurity;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s%nsocial number security: %s", 
                getFirstName(), getLastName(), getSocialNumberSecurity());
    }
    
    // Observação: não implementamos o método getPaymentAmount de Payable aqui, assimÿ
    // essa classe deve ser declarada abstrata para evitar um erro de compilação.
}
