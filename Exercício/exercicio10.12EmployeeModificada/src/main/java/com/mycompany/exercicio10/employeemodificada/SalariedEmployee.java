
package com.mycompany.exercicio10.employeemodificada;

/**
 *
 * @author Ueno Souza Silva
 */
public class SalariedEmployee extends Employee {
    
    public double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double earning(double bonus){
        return getWeeklySalary() + bonus;
    }
    
    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: $%,.2f", 
                super.toString(), "weekly salary", getWeeklySalary());
    }
}
