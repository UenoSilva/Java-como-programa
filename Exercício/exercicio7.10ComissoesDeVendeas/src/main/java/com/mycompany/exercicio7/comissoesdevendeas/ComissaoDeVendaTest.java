/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio7.comissoesdevendeas;

import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class ComissaoDeVendaTest {
    
    public static void main(String[] args){
        
        System.out.printf("%s", "Informe a quantidade de vendedores ativos na semana: ");
        Scanner teclado = new Scanner(System.in);
        int numeroDeVandedores = teclado.nextInt();
        
        double vendas = 0;
        double[] vendasPorsemana = new double[numeroDeVandedores];
        
        System.out.println("Informe as vendas da semana: ");
        for(int i = 0; i < vendasPorsemana.length; i++){
            System.out.println("Vendedor [" + (i+1) + "] = ");
            vendas = teclado.nextDouble();
            
            vendasPorsemana[i] = vendas;
        }
        
        ComissaoDeVenda comissao = new ComissaoDeVenda(numeroDeVandedores, vendasPorsemana);
        
        comissao.outputDados();
               
    }
    
}
