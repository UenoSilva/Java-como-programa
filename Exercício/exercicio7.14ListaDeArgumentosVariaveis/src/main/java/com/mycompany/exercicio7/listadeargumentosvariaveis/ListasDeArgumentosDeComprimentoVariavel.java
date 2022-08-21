// Exercício 7.14: ListaDeArgumentosDeComprimentoVariavel.java

package com.mycompany.exercicio7.listadeargumentosvariaveis;

import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class ListasDeArgumentosDeComprimentoVariavel {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Informe a quantidade de produtos:");
        int quat = teclado.nextInt();
        int[] array = new int[quat];
        
        System.out.println("\nDigite o valor dos produtos: ");
        for(int i = 0; i < array.length; i++){
            array[i] = teclado.nextInt();
        }
        product(array[0], array[2]);
    }

    private static void product(int...i) {
        int produto = 1;
        for(int number : i){
            produto *= number;
        }
        System.out.println("\nO resultado é: " + produto);
    }
    
}
