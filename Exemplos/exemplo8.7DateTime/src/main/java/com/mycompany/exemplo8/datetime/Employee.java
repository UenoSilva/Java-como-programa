// Exemplo 8.8: Employee.java
// Classe employee com referência a outros objetos.

package com.mycompany.exemplo8.datetime;

/**
 *
 * @author Ueno Souza Silva
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    //construtor para inicializa nome, data de nascimento e data de contratação
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }
    
    //convete Employee em formato String
    public String toString(){
        return String.format("%s, %s Hired: %s, Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
    
}
