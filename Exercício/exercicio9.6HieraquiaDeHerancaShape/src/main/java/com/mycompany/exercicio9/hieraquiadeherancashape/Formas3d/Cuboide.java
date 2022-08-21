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
public class Cuboide extends ThreeDimensionalShape {
    
    private double comprimentro;
    private double largura;
    private double altura;

    public Cuboide(String nome, String definicao, String descricao, double comprimentro, double largura, double altura) {
        super(definicao, nome, descricao);
        
        if(comprimentro < 1)
            throw new IllegalArgumentException("Comprimento não deve ser menor que 1");
        if(largura < 1)
            throw new IllegalArgumentException("A largura não deve ser menor que 1");
        if(altura < 1)
            throw new IllegalArgumentException("A altura não deve ser menor que 1");
        
        this.comprimentro = comprimentro;
        this.largura = largura;
        this.altura = altura;
    }

    public double getComprimentro() {
        return comprimentro;
    }

    public void setComprimentro(double comprimentro) {
        if(comprimentro < 1)
            throw new IllegalArgumentException("Comprimento não deve ser menor que 1");
        
        this.comprimentro = comprimentro;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura < 1)
            throw new IllegalArgumentException("A largura não deve ser menor que 1");
        
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura < 1)
            throw new IllegalArgumentException("A altura não deve ser menor que 1");
        
        this.altura = altura;
    }
    
    public double areaSuperficialLateral(){
        return 2*getAltura()*(getComprimentro()+getLargura());
    }
    
    public double areaSuperficialTotal(){
        return 2*(getComprimentro()*getLargura() + getLargura()*getAltura() + getAltura()*getComprimentro());
    }
    
    public double volume(){
        return getAltura()*getComprimentro()*getLargura();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s %.2f%n%s %.2f%n%s %.2f%n%s %.2f%n%s %.2f%n%s %.2f%n%s",
                "------------------------------------------------------------------------",
                super.toString(),
                "Comprimentro:", getComprimentro(),
                "Largura:", getLargura(),
                "Altura:", getAltura(),
                "Área superficial lateral:", areaSuperficialLateral(),
                "Área superficial total:", areaSuperficialTotal(),
                "Volume:", volume(),
                "------------------------------------------------------------------------");
    }
    
}
