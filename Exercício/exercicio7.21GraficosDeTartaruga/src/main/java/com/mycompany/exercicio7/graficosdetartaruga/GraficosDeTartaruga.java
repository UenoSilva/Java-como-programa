
package com.mycompany.exercicio7.graficosdetartaruga;

/**
 *
 * @author Ueno Souza Silva
 */
public class GraficosDeTartaruga {
    
    private String[][] floor = new String[20][20]; 
    private int[] comandos = {1, 2, 3, 4, 5, 0};
    private boolean caneta = false; 
    private int coordenadaX = 0;
    private int coordenadaY = 0;
    private int casas;
    private boolean cima = false;
    private boolean baixo = false;
    private boolean direita = false;
    private boolean esquerda = false;
    
    // Construtor
    public GraficosDeTartaruga(){
    }
    
    // Configura e retorna o número de casas que a tartaruga deve andar.
    public int getCasas() {
        return casas;
    }
    public void setCasas(int casas) {
        this.casas = casas;
    }

    // Configurara e retorna a situação da caneta - True, escreve 1; False, não faz nada.
    public boolean isCaneta() {
        return caneta;
    }
    public void setCaneta(boolean caneta) {
        this.caneta = caneta;
    }

    // Configura e retorna as opções de movimentação
    public boolean isCima() {
        return cima;
    }
    public void setCima(boolean cima) {
        this.cima = cima;
    }
    public boolean isBaixo() {
        return baixo;
    }
    public void setBaixo(boolean baixo) {
        this.baixo = baixo;
    }
    public boolean isDireita() {
        return direita;
    }
    public void setDireita(boolean direita) {
        this.direita = direita;
    }
    public boolean isEsquerda() {
        return esquerda;
    }
    public void setEsquerda(boolean esquerda) {
        this.esquerda = esquerda;
    }
    
    // Configuara o array bidmencional com zeros e faz o retorno
    public String[][] getFloor() {
        return floor;
    }
    public void setFloor() {
        for(int x = 0; x < floor.length; x++){
            for(int y = 0; y < floor[x].length; y++){
                floor[x][y] = "0";
            }
        }
    }
    
    // Movimentação da Tartaruga no array bidimencional
    public void cima(){
        for(int count = 1; count <= getCasas(); count++){    
            //Se as coordenadas x e y ultrapassrem o array, o for e encerreda
            //para evitar um error
            if((coordenadaX == 0 && isCima() == true)){
                System.out.println("Observação: A tartaruga chegou nos limites do plano!");
                break;
            }
            //Verificar se a opção da caneta está ativada
            if(isCaneta() == true){
                floor[coordenadaX--][coordenadaY] = "1";  //adicionar 1 no array 
            }else{
                floor[coordenadaX--][coordenadaY] = "0";  //adicionar 0 no array 
            }
        }
        floor[coordenadaX][coordenadaY] = "T"; //adcionar um T (tartaruga) na ultima casa
    }
    public void baixo(){
        for(int count = 1; count <= getCasas(); count++){
            //Se as coordenadas x e y ultrapassrem o array, o for e encerreda
            //para evitar um error
            if((coordenadaX == 19 && isBaixo() == true)){
                System.out.println("Observação: A tartaruga chegou nos limites do plano!");
                break;
            }
            //Verificar se a opção da caneta está ativada
            if(isCaneta() == true){
                floor[coordenadaX++][coordenadaY] = "1"; //adicionar 1 no array
            }else{
                floor[coordenadaX++][coordenadaY] = "0"; //adicionar 0 no array
            }
        }
        floor[coordenadaX][coordenadaY] = "T"; //adcionar um T (tartaruga) na ultima casa
    }
    public void direita(){
        for(int count = 1; count <= getCasas(); count++){
            //Se as coordenadas x e y ultrapassrem o array, o for e encerreda
            //para evitar um error
            if((coordenadaY == 19 && isDireita()== true)){
                System.out.println("Observação: A tartaruga chegou nos limites do plano!");
                break;
            }
            //Verificar se a opção da caneta está ativada
            if(isCaneta() == true){
                floor[coordenadaX][coordenadaY++] = "1"; //adicionar 1 no array
            }else{
                floor[coordenadaX][coordenadaY++] = "0"; //adicionar 0 no array
            } 
        }
        floor[coordenadaX][coordenadaY] = "T"; //adcionar um T (tartaruga) na ultima casa
    }
    public void esquerda(){
        for(int count = 1; count <= getCasas(); count++){
            //Se as coordenadas x e y ultrapassrem o array, o for e encerreda
            //para evitar um error
            if((coordenadaY == 0 && isEsquerda()== true)){
                System.out.println("Observação: A tartaruga chegou nos limites do plano!");
                break;
            }
            //Verificar se a opção da caneta está ativada
            if(isCaneta() == true){
                floor[coordenadaX][coordenadaY--] = "1"; //adicionar 1 no array
            }else{
                floor[coordenadaX][coordenadaY--] = "1"; //adicionar 0 no array
            }
        }
        floor[coordenadaX][coordenadaY] = "T"; //adcionar um T (tartaruga) na ultima casa
    }
    
    // Imprimir apenas o caminho percorrido pela Tartaruga
    public void imprimir(){
        floor[coordenadaX][coordenadaY] = "T";
        for(int x = 0; x < floor.length; x++){
            for(int y = 0; y < floor[x].length; y++){
                if(floor[x][y] == "0"){
                    floor[x][y] = " ";
                }else if(floor[x][y] == "1"){
                    floor[x][y] = "*";
                }
                System.out.printf(" %s ", floor[x][y]);
            }
            System.out.println("");
        }
    }
    
    // Imprimir o array bidimencional
    public void imprimirArray(){
        for(int x = 0; x < floor.length; x++){
            for(int y = 0; y < floor[x].length; y++){
                System.out.printf(" %s ", floor[x][y]);
            }
            System.out.println();
        }    
    }
}
