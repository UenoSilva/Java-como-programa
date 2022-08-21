/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio8.jogodavelha;

import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class TicTacToeTest {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        TicTacToe jogo = new TicTacToe();
        
        jogo.iniciarJogo();
        
        int x;
        int y;
        int cont1 = 1;
        String jogador1 = "X";
        String jogador2 = "O";
        String r = jogo.resultado();
        
        
        
        System.out.println("Joga da Velha 1.0");
        System.out.println("1 - Jogar");
        System.out.println("2 - Instrucoes");
            
        int escolha = input.nextInt();
            
        switch(escolha){
            case 1:
                while(jogo.resultado() == "Empatado"){
                    if(cont1 % 2 == 1){
                            System.out.println("\nRodada do Jogador 1");
                            System.out.println("Escolhar o valor da linha: ");
                            x = input.nextInt();
                            System.out.println("Escolhar o valor da coluna: ");
                            y = input.nextInt();
                            
                            jogo.jogoda(x, y, jogador1);
                            System.out.println(jogo.toString());
                        }
                        if(cont1 % 2 == 0){
                            System.out.println("\nRodada do Jogador 2");
                            System.out.println("Escolhar o valor da linha: ");
                            x = input.nextInt();
                            System.out.println("Escolhar o valor da coluna: ");
                            y = input.nextInt();
                            
                            jogo.jogoda(x, y, jogador2);
                            System.out.println(jogo.toString());
                        }
                        jogo.resultado();
                        System.out.println(jogo.resultado());
                        
                        if(jogo.resultado() != "Empatado" || cont1 == 10){
                            break;
                        }
                        cont1++;
                }
                
                break;
            case 2:
                jogo.instrucoes();
                break;
            default:
                System.out.println("Escolhar uma das duas opções");          
        }
        
        System.out.println("Resultado: " + jogo.resultado());
        
    }
    
    
}
