/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio9.hieraquiadeherancashape.Formas3d;

/**
 *
 * @author Ueno Souza Silva
 */
public class Cubo extends ThreeDimensionalShape{
    
    private double aresta;

    public Cubo(String nome, String definicao, String descricao, double aresta) {
        super(definicao, nome, descricao);
        
        if(aresta < 1)
            throw new IllegalArgumentException("O tamanho da aresta não deve ser menor que 1");
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    public double areaDeSuperficieLateral(){
        return 4 * Math.pow(aresta, 2);
    }
    
    public double areaTotalDaSuperficie(){
        return 6 * Math.pow(aresta, 2);
    }
    
    public double volume(){
        return Math.pow(aresta, 3);
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s %.2f%n%s %.2f%n%s %.2f%n%s %.2f%n%s",
                "------------------------------------------------------------------------",
                super.toString(),
                "Aresta:", getAresta(),
                "Área da superficie lateral:", areaDeSuperficieLateral(),
                "Área total da superficie:", areaTotalDaSuperficie(),
                "Volume:", volume(),
                "------------------------------------------------------------------------");
    }
    
}
