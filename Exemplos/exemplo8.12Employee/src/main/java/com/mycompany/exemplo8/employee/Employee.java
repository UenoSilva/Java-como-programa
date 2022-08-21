// Exemplo 8.12: Employee.java
// Variável static utilizada para manter uma contagem do número de
// objetos Employee na memória.

package com.mycompany.exemplo8.employee;

/**
 *
 * @author Ueno Souza Silva
 */
public class Employee {
    
    private static int cont = 0;
    private String firstName;
    private String lastName;
    
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        
        ++cont;
        System.out.printf("Employee constructor: %s %s; cont = %d%n", 
                firstName, lastName, cont);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCont() {
        return cont;
    }
    
}
