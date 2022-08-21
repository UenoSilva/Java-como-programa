/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio8.aprimorandoclassedate;

/**
 *
 * @author Ueno Souza Silva
 */
public class DateTest {
    
    public static void main (String[] args){
        
        Date data = new Date(1, 1, 2020);
        
        for(int i = 1; i <= 365; i++){
            data.nextDay();
            System.out.println(data.toString());
        }
    }
}
