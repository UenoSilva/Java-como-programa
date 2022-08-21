
package com.mycompany.exercicio10.folhadepagamento;

/**
 *
 * @author Ueno Souza Silva
 */
public class EmployeeTest {
    
    public static void main (String[] args){
        
        Employee[] employee = new Employee[100];
    
        employee[0] = new SalariedEmployee("Jose", "Silva", "1111-11-111", 500.0);
        employee[1] = new HoulyEmployee("Bruna", "Carla", "2222-22-222", 45, 30.0);
        employee[2] = new CommissionEmployee("Roberto", "Carlos", "3333-33-333", 1000.0, 0.2);
        employee[3] = new BasePlusCommissionEmployee("Jessica", "Roca", "4444-44-444", 840.0, .25, 1000.0);
        employee[4] = new CommissionEmployee("Bruno", "Santiago", "5555-55-555", 5000.0, 0.3);
        employee[5] = new PieceWorker("João", "Batista", "6666-66-666", 20.0, 100);
        
        
        for(Employee currentEmployee : employee){
            
            if(currentEmployee != null){
                System.out.println(currentEmployee);
                System.out.printf("earnings: $%,.2f%n%n", currentEmployee.earnings());
            }
            
            
        }
        
    }
    
    
    
    
}
