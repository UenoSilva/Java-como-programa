// Exercício 7.17: JogoDeDados.java

package com.mycompany.exercicio7.jogodedados;

import java.util.Random;

/**
 *
 * @author Ueno Souza Silva
 */
public class JogoDeDados {
    
    static Random numberRandom = new Random();
    
    public static void main(String[] args){
        
        int[] frequency = new int[13];
        
        for(int count = 0; count <= 36000000; count++){
            ++frequency[lancamentoDeDados()];
        }
        
        System.out.println("Frequencia  Valor");
        for(int count = 0; count < frequency.length; count++){
            if(count > 1){
                System.out.printf("%10d%7d%n", frequency[count], count);
            }
        }
    }
    
    public static int lancamentoDeDados(){
        int dado1 = 1 + numberRandom.nextInt(6);
        int dado2 = 1 + numberRandom.nextInt(6);
        int somaDosDados = dado1 + dado2;
        return somaDosDados;
    }
}
