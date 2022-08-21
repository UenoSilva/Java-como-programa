// Exercício 7.21 do Livro Java - Como programar: GraficosDeTartaruga
// Autor: Ueno Souza Silva 

package com.mycompany.exercicio7.graficosdetartaruga;

import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class GraficosDeTartarugaStart {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        GraficosDeTartaruga t = new GraficosDeTartaruga();
        t.setFloor();
        
        String comando = " ";
        
        menu();
        
        do{ 
            System.out.println("\nDigite o camando: ");
            comando = input.next();
            
            switch(comando){
                case "1":
                    t.setCaneta(false);
                    System.out.println("\nMensagem: Caneta desativada\n");
                    break;
                    
                case "2":
                    t.setCaneta(true);
                    System.out.println("\nMensagem: Caneta ativada\n");
                    break;
                    
                case "w":
                case "W":
                    t.setCima(true);
                    //Reserta as outas direções
                    t.setBaixo(false);
                    t.setDireita(false);
                    t.setEsquerda(false);
                    System.out.println("\nMensagem: Tartaruga virada para cima\n");
                    break;
                    
                case "s":
                case "S":
                    t.setBaixo(true);
                    //Reserta as outas direções
                    t.setCima(false);
                    t.setDireita(false);
                    t.setEsquerda(false);
                    System.out.println("\nMensagem: Tartaruga virafa para baixo\n");
                    break;
                    
                case "a":
                case "A":
                    t.setEsquerda(true);
                    //Reserta as outas direções
                    t.setCima(false);
                    t.setBaixo(false);
                    t.setDireita(false);
                    System.out.println("\nMensagem: Tartaruga virada para a esquerda\n");
                    break;
                    
                case "d":
                case "D":
                    t.setDireita(true);
                    //Reserta as outas direções
                    t.setCima(false);
                    t.setBaixo(false);
                    t.setEsquerda(false);
                    System.out.println("\nMensagem: Tartaruga virada para a direita\n");
                    break;
                    
                case "5":
                    System.out.println("Mensagem: A tarturaga está se preparando para andar");
                    System.out.println("Digite a quantidade de casas que a tartaruga deve seguir: ");
                    int casas = input.nextInt();
                    t.setCasas(casas);
                    
                    if(t.isCima()){
                        t.cima();
                    }
                    if(t.isBaixo()){
                        t.baixo();
                    }
                    if(t.isDireita()){
                        t.direita();
                    }
                    if(t.isEsquerda()){
                        t.esquerda();
                    }
                    break; 
                   
                case "6":
                    t.imprimir();
                    break;
                    
                case "9":
                    System.out.println("\nFim do código\n");
                    break;
                    
                default:
                    System.out.println("\nComando inválido!\n");
                    
            }
            
            menu();
        }while(!comando.equals("9"));
    }
    
    public static void menu(){
        System.out.println("\n|------------|------------------------------|");
         System.out.println("|  Comando   |        Significado           |");
         System.out.println("|------------|------------------------------|");
         System.out.println("|     1      |   Caneta para cima           |");
         System.out.println("|     2      |   Caneta para baixo          |");
         System.out.println("|------------|------------------------------|");
         System.out.println("|    W/w     |   Tartaruga para Cima        |");
         System.out.println("|    S/s     |   Tartaruga para  Baixo      |");
         System.out.println("|    A/a     |   Tartaruga para Esquerda    |");
         System.out.println("|    D/d     |   Tartaruga para Direita     |");
         System.out.println("|------------|------------------------------|");
         System.out.println("|     5      |   Avance x números de casas  |");
         System.out.println("|     6      |   Exibir o array 20 por 20   |");
         System.out.println("|     9      |   Fim dos dados              |");
         System.out.println("|------------|------------------------------|\n");
    }
    
}
