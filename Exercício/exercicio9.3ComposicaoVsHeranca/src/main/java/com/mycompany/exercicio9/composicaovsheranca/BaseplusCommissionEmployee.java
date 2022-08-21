
package com.mycompany.exercicio9.composicaovsheranca;

/**
 *
 * @author Ueno Souza Silva
 */
public class BaseplusCommissionEmployee {
    
    private double salary;
    private CommissionEmployee employee;

    public BaseplusCommissionEmployee(CommissionEmployee employee, double salary ) {
        
        if(salary < 0.0)
            throw new IllegalArgumentException("Salary must be > 0.0");
        
        this.salary = salary;
        this.employee = employee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public CommissionEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(CommissionEmployee employee) {
        this.employee = employee;
    }
    
    public double earnings(){
        return getSalary() + employee.earnings();
    }
    
    public String toString(){
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                             employee.toString(), "salary", getSalary());
    }
}
