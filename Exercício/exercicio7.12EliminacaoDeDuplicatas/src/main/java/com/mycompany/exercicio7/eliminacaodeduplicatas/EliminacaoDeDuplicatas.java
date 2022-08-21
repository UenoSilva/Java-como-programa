// Exercício 7.12: EliminacaoDeDuplicatas.java

package com.mycompany.exercicio7.eliminacaodeduplicatas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class EliminacaoDeDuplicatas {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int[] number = new int[5];
        
        System.out.println("Insira cinco númetos de 10 a 100: ");
        
        for(int i = 0; i < number.length; i++){
            number[i] = teclado.nextInt();
        }
        
        for(int i = 0; i < number.length; i++){
            System.out.println("n["+i+"]: "+number[i]);
        }
        
        eliminacaoDeDuplicatas(number);
     
    }
    
    public static void eliminacaoDeDuplicatas(int[] n){
        
        int aux = 0;
        int aux2 = 0;
        
        for(int x = 0; x < n.length; x++){
            
            for(int y = 1; y < n.length; y++){
                    if(n[x] == n[y]){
                    aux = n[y];
                }
                
            }
            
            aux2 = aux;
            auxiliar(aux2);
        }
        
        
    }
    
    public static void auxiliar(int...numero){
        
        for(int i = 0; i < numero.length; i++){
            System.out.println(numero[i]);
        }
        
    }
    
}
