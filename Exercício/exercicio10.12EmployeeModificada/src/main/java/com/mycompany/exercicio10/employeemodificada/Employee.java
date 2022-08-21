
package com.mycompany.exercicio10.employeemodificada;

/**
 *
 * @author Ueno Souza Silva
 */
public abstract class Employee {
    
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
        return String.format("%s %s%n%s: %s",
                getFirstName(), getLastName(),
                "Data de nascimento", getBirthDate());
    }
    
    public abstract double earning(double bonus);
    
}
