
package com.mycompany.exercicio10.contasapagar;

/**
 *
 * @author Ueno Souza Silva
 */
public class SalariedEmployee extends Employee{
    
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weeky salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %n%s: $%,.2f",
                "Salaried", super.toString(),
                "weeky salary", getWeeklySalary());
    }
}
