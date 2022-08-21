/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo10.employee;

/**
 *
 * @author Ueno Souza Silva
 */
public class PayrollSystemTest {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-111", 800.0);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Kare", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 500);

        System.out.printf("Employees processed individually: %n%n");

        System.out.printf("%n%s%n%s: $%,.2f%n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n",
                commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        //criar um array Employee de 4 elementos
        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employess processed polymorphically: %n%n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            //determina se o elemento e um BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee employee) {

                //downcast da referência Employee para
                //referência a BasePlusCommissionEmployee
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% incrase is: $%,.2f%n",
                        employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is %s%n", j, employees[j].getClass().getName());
        }

    }
}
