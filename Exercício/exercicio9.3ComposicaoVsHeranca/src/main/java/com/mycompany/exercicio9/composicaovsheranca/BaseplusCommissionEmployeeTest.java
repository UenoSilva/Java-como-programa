
package com.mycompany.exercicio9.composicaovsheranca;

/**
 *
 * @author Ueno Souza Silva
 */
public class BaseplusCommissionEmployeeTest {
    
    public static void main(String[] args){
        
        BaseplusCommissionEmployee employee = new BaseplusCommissionEmployee(new CommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04), 300);
        
        // obtém os dados do empregado comissionado com salário-base
        System.out.println("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is", employee.getEmployee().getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getEmployee().getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getEmployee().getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getEmployee().getGrossSale());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getEmployee().getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getSalary());
        employee.setSalary(1000);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString",employee.toString());
    }
    
}
