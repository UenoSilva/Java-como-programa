/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio8.jogodavelha;

/**
 *
 * @author Ueno Souza Silva
 */
public class TicTacToe {
    
    private String[][] tabuleiro = new String[3][3];
    enum pecas {X, O, Empty};

    public TicTacToe() {}
    
    public void iniciarJogo(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabuleiro[i][j] = " ";      
            }
        }
    }
    
    public void jogoda(int x, int y, String jogador){
        System.out.println("Escolhar a coodernada do tabuleiro 3x3");
        if(tabuleiro[x][y] == "X" || tabuleiro[x][y] == "O"){
            System.out.println("Escolhar outra posição");
        }else{
            tabuleiro[x][y] = peca(jogador);
        }
    }
    
    public String peca(String peca){
        return peca;
    }
    
    public String resultado(){
        int contX = 0, contY = 0;
        String ganhador = " ";
        //verificar se hover ganhador na horizontal
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(tabuleiro[i][j] == "X")
                    contX++;
                    if(contX == 3){
                        ganhador = "Jogador 1";
                    }
            }
            contX=0;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(tabuleiro[i][j] == "O")
                    contY++;
                    if(contY == 3){
                        ganhador = "Jogador 2";
                    }
            }
            contY=0;
        }
        
        //verificar se houver ganhador na vertical
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(tabuleiro[j][i] == "X")
                    contX++;
                    if(contX == 3)
                        ganhador = "Jogador 1";
            }
            contX=0;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(tabuleiro[j][i] == "O")
                    contY++;
                    if(contY == 3)
                        ganhador = "Jogador 2";
            }
            contY=0;
        }
        
        if(ganhador == " "){
            ganhador = "Empatado";
        }
        
        return ganhador;
    }
    
    public void instrucoes(){
        System.out.println("Bem-vindo(s) ao Jogo da Velha\n");
        System.out.println(" O tamanho do jogo e 3x3, o jogador 1");
        System.out.println(" está com o 'X' e o jogador 2 está com 'O' ");
        System.out.println(" para acessar um posição é necessario");
        System.out.println(" informar as coodernadas do");
        System.out.println(" tabuleiro, por exemplo:\n");
        System.out.println(" Escolhando as coodernadas 1 e 1");
        System.out.println("     0   1   2 ");
        System.out.println("  0    |   |   ");
        System.out.println("    ---+---+---");
        System.out.println("  1    | X |   ");
        System.out.println("    ---+---+---");
        System.out.println("  0    |   |   ");
    }

    @Override
    public String toString() {
        System.out.println("     0   1   2\n");
        for(int i = 0; i < 3; i++){
            System.out.printf("%d   ", i);
            for(int j = 0; j < 3; j++){
                System.out.printf(" %s ", tabuleiro[i][j]);
                if((i==0 && j== 0) || (i==0 && j== 1) || (i==1 && j== 0) || (i==1 && j== 1) || (i==2 && j== 0) || (i==2 && j== 1))
                    System.out.printf("|");  
            }
            if(i == 0 || i == 1)
                System.out.printf("\n    ---+---+---\n");
        }
        return "\nJogo da velha";
    }
    
    
    
    
    
}
