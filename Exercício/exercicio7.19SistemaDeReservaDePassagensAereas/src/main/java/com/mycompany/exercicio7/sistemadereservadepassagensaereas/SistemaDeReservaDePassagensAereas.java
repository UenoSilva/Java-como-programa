// Exercício 7.19: SistemaDePassgensAereas.java

package com.mycompany.exercicio7.sistemadereservadepassagensaereas;

import java.security.SecureRandom;

/**
 *
 * @author Ueno Souza Silva
 */
public class SistemaDeReservaDePassagensAereas {
    
    private boolean[] poltronas = new boolean[10];
    private int escolhar;
    private SecureRandom randomNumbers = new SecureRandom();
    private int primeiraClase;
    private int secundaClase;
    
    public SistemaDeReservaDePassagensAereas(){
    }

    public boolean[] getPoltronas() {
        for(int x = 0; x < poltronas.length; x++){
            poltronas[x] = false;
        }
        return poltronas;
    }
    
    public int getEscolhar() {
        return escolhar;
    }
    public void setEscolhar(int escolhar) {
        this.escolhar = escolhar;
    }
    
    public boolean distribuicaoDePoltronas(){
        int primeiraClase = randomNumbers.nextInt(5);
        this.primeiraClase = primeiraClase;
        int secundaClase = 4 + randomNumbers.nextInt(5);
        this.secundaClase = secundaClase;
        
        if(poltronas[primeiraClase] == true){
            System.out.println("Poltrona ocupada!");
        }else{
            if(getEscolhar() == 1){
                poltronas[primeiraClase] = true;
                return poltronas[primeiraClase];
            }else if(getEscolhar() == 2){
                poltronas[secundaClase] = true;
                return poltronas[secundaClase];
            }
        }
        return poltronas[primeiraClase];
    }
    
    public void visualizacaoDePoltronas(){
        System.out.println("\n------------------Disposição de poltronas-----------------\n");
        System.out.printf(" Primeira Classe:");
        for(int p = 0; p < poltronas.length; p++){
            if(p == (poltronas.length - 5)){
                System.out.printf("\n Secunda Classe: ");
            }
            System.out.printf(" ["+poltronas[p]+"]");
        }
        System.out.println("\n\n----------------------------------------------------------\n");
    }
    
    public void cartaoDeEmbarque(){
        System.out.println("Cartão de embarque");
        System.out.printf("%s\n", getEscolhar()==1?"Primeira classe" : "Secunda classe");
        System.out.printf("Poltrona nº %d\n\n", getEscolhar() == 1 ? primeiraClase : secundaClase);
    }
}