/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio8.tipoenum;

/**
 *
 * @author Ueno Souza Silva
 */
public class CorTest {
    
    public static void main(String[] args){
        System.out.println("Duração da cor");
        
        for(Cor cor : Cor.values()){
            System.out.printf("%s: %d%n", cor, cor.getDuracaoCor());
        }
            
    }
    
}
