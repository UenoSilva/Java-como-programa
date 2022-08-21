
package com.mycompany.exercicio10.employeemodificada;

/**
 *
 * @author Ueno Souza Silva
 */
public class EmployeeTest {

    public static void main(String[] args) {
        
        Employee[] employee = new Employee[100];
        
        employee[0] = new SalariedEmployee("Jose", "Silva", "1111-11-111", new Date(23, 4, 1980), 500.0);
        employee[1] = new HourlyEmployee("Bruna", "Carla", "2222-22-222", new Date(8, 11, 1987), 45, 30.0);
        employee[2] = new CommissionEmployee("Roberto", "Carlos", "3333-33-333", new Date(5, 2, 1980), 1000.0, 0.2);
        employee[3] = new BasePlusCommissionEmployee("Jessica", "Roca", "4444-44-444", new Date(8, 7, 1999), 840.0, .25, 1000.0);
        employee[4] = new CommissionEmployee("Bruno", "Santiago", "5555-55-555", new Date(21, 2, 1990), 5000.0, 0.3);
        
        Date dataAtual = new Date(13, 2, 2022);
        
        int cont = 0;
        
        for(Employee currentEmployee : employee){
            
            
                    
            if(employee[cont] != null){
                
                System.out.println(currentEmployee);
                
                if((employee[cont].getBirthDate().getMonth() == dataAtual.getMonth())){
                    System.out.println("Feliz aniversário! Bonus de $100.0");
                    System.out.printf("earned: $%,.2f%n%n", employee[cont].earning(100.0));
                }
                else{
                    System.out.printf("earned: $%,.2f%n%n", employee[cont].earning(0.0));
                }
            }
            
            ++cont;
        }
        
    }
    
}
