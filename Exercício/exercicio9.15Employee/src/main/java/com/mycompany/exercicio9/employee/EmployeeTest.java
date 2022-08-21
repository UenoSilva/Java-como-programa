/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio9.employee;

/**
 *
 * @author Ueno Souza Silva
 */
public class EmployeeTest {
    
    public static void main(String[] args){
        
        //CommissionEmployee employee1 = new CommissionEmployee("U", "S", "111-11-1111", 500, 0.02);
        //SalariedEmployee employee2 = new SalariedEmployee("U", "S", "222-22-2222", 5000);
        //PieceWorkers employee3 = new PieceWorkers("U", "S", "333-33-3333", 3000, 4.50);
        HourlyEmployee employee4 = new HourlyEmployee("U", "S", "444-44-4444", 50, 30);
        
        //System.out.println(employee1.toString());
        //System.out.println(employee2.toString());
        //System.out.println(employee3.toString());
        System.out.println(employee4.toString());
        System.out.println(employee4.earnings());
        
        
    }
    
}
