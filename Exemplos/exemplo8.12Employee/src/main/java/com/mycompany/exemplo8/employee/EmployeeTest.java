// Exemplo 8.13: EmployeeTest.java
// Demostração do membro static

package com.mycompany.exemplo8.employee;

/**
 *
 * @author Ueno Souza Silva
 */
public class EmployeeTest {
    
    public static void main(String[] args){
        
        System.out.printf("Employee before instantiation: %d%n", Employee.getCont());
        
        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");
        
        System.out.printf("%nEmployee after instantiation: %n");
        System.out.printf("via e1.getCont(): %d%n", e1.getCont());
        System.out.printf("via e2.getCont(): %d%n", e2.getCont());
        System.out.printf("via Employee.getCont(): %d%n", Employee.getCont());
        
        System.out.printf("%nEmployee 1: %s %s %nEmployee 2: %s %s%n",
                e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());
    }
    
}
