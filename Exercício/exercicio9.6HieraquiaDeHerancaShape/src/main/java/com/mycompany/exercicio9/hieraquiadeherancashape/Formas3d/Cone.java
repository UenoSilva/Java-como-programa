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
public class Cone extends ThreeDimensionalShape{
    
    private double raio;
    private double altura;

    public Cone(String nome, String definicao, String descricao, double raio, double altura) {
        super(definicao, nome, descricao);
        
        if(raio < 1)
            throw new IllegalArgumentException("O raio não pode ser menor que 1");
        if(altura < 1)
            throw new IllegalArgumentException("A altura não pode ser menor que 1");
        
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio < 1)
            throw new IllegalArgumentException("O raio não pode ser menor que 1");
        
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura < 1)
            throw new IllegalArgumentException("A altura não pode ser menor que 1");
        
        this.altura = altura;
    }

    public double alturaInclinada(){
        return Math.sqrt((getAltura()+getRaio()));
    }
    
    public double areaTotalDaSuperficie(){
        return Math.PI*getRaio()*alturaInclinada();
    }
    
    public double volume(){
        
        return Math.PI*getRaio()/3;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s %.2f%n%s %.2f%n%s %.2f%n%s %.2f%n%s %.2f%n%s", 
                "------------------------------------------------------------------------",
                super.toString(),
                "Raio:", getRaio(),
                "Altura:", getAltura(),
                "Altura inclinada:", alturaInclinada(),
                "Área total da superficie:", areaTotalDaSuperficie(),
                "Volume:", volume(),
                "------------------------------------------------------------------------");
    }
    
}
