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
public class Esfera extends ThreeDimensionalShape{
    
    private double raio;

    public Esfera(String nome, String definicao, String descricao, double raio) {
        super(definicao, nome, descricao);
        
        if(raio < 1)
            throw new IllegalArgumentException("O raio não deve ser menor que 1");
        
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio < 1)
            throw new IllegalArgumentException("O raio não deve ser menor que 1");
        
        this.raio = raio;
    }
    
    public double diamentro(){
        return getRaio()*2;
    }
    
    public double areaDaSuperfice(){
        return 4*Math.PI*getRaio();
    }
    
    public double volume(){
        return (4*Math.PI*getRaio())/3;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s %.2f%n%s %.2f%n%s %.2f%n%s %.2f%n%s", 
                "------------------------------------------------------------------------",
                super.toString(),
                "Raio:", getRaio(),
                "Diamentro:", diamentro(),
                "Área da supercificie:", areaDaSuperfice(),
                "Volume:", volume(),
                "------------------------------------------------------------------------");
    }
    
    
    
}
