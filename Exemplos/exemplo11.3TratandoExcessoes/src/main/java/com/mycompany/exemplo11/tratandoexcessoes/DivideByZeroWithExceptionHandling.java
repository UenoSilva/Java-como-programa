/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo11.tratandoexcessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class DivideByZeroWithExceptionHandling {
    
    //método que calcular a divisão de dois números inteiros
    public static int quotient(int numerador, int denominador)
      throws ArithmeticException
    {
        return numerador/denominador;
    }
    
    public static void main(String[] args){
        boolean continuarLoop = true;
        Scanner input = new Scanner(System.in);
        
        do{
            try {
                System.out.println("Digite um número inteiro: ");
                int numerador = input.nextInt();
                System.out.println("Digite um número inteiro: ");
                int denominador = input.nextInt();
                
                int resultado = numerador/denominador;
                System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
                continuarLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n", inputMismatchException);
                input.nextLine();
                System.out.printf("Você deve digitar números inteiros. Por favor, tente novamente. %n%n");
            } 
            catch(ArithmeticException arithmeticException){
                System.err.printf("%nException: %s%n", arithmeticException);
                input.nextLine();
                System.out.printf("Zero é um denominador inválido. Por favor, tente novamente. %n%n");
            }
        }while(continuarLoop);
    }
}
