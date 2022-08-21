/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio7.sistemadereservadepassagensaereas;

import java.util.Scanner;

/**
 *
 * @author Ueno Souza Silva
 */
public class SistemaDeReservaDePassagensAereasStart {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        
        SistemaDeReservaDePassagensAereas sdrdpa = new SistemaDeReservaDePassagensAereas();
        sdrdpa.getPoltronas();
        
        int esc = 0;
        
        do{
            System.out.println("\n--Bem Vindo a agencia de viagens Boa Viagem--");
            System.out.println(" Escolhar uma das opções:");
            System.out.println("  [1] Agenda uma passagem;");
            System.out.println("  [2] Verificar as poltronas livres;");
            System.out.println("  [3] Fechar o programa.");
            System.out.println("-----------------------------------------------\n");
            esc = input.nextInt();
            
            switch(esc){
                case 1:
                    agendaPoltrona(sdrdpa);
                    break;
                case 2:
                    sdrdpa.visualizacaoDePoltronas();
                    break;
                case 9999:
                    System.out.println("Fechando o programa!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(esc != 9999);
    }
    
    public static void agendaPoltrona(SistemaDeReservaDePassagensAereas r){
        System.out.println("[Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica]: ");
        int escolhar = input.nextInt();
        
        while(escolhar != 3){
            if(escolhar == 1){
                r.setEscolhar(escolhar);
                if(r.distribuicaoDePoltronas() == false){
                    System.out.println("Poltrona ocupada!");
                    r.visualizacaoDePoltronas();
                    System.out.println("Por favor escolhar outra!");
                    break;
                }else{
                    r.distribuicaoDePoltronas();
                    r.cartaoDeEmbarque();
                }
            }else if(escolhar == 2){
                r.setEscolhar(escolhar);
                if(r.distribuicaoDePoltronas() == true){
                    System.out.println("Poltrona ocupada!");
                    r.visualizacaoDePoltronas();
                    System.out.println("Por favor escolhar outra!");
                    break;
                }else{
                    r.distribuicaoDePoltronas();
                    r.cartaoDeEmbarque();
                }
            }
            System.out.println("[Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica]: ");
            escolhar = input.nextInt();
        }
    }
    
}
