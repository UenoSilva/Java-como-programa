/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo11.asserttest;

import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class AssertTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com um número inteiro  de 0 a 10:");
        int number = input.nextInt();
        
        assert (number >= 0 && number <= 10) : "bad number: " + number;
        
        System.out.printf("Você digitou %d%n", number);
    }
    
}
