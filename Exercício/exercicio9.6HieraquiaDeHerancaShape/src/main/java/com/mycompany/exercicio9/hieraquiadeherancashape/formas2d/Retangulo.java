/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio9.hieraquiadeherancashape.formas2d;

import com.mycompany.exercicio9.hieraquiadeherancashape.formas2d.TwoDimensionalShape;

/**
 *
 * @author Ueno Souza Silva
 */
public class Retangulo extends TwoDimensionalShape{
    
    private double comprimento;
    private double largura;

    public Retangulo(String nome, String definicao, String descricao, double comprimento, double largura) {
        super(definicao, nome, descricao);
        
        if(comprimento < 1)
            throw new IllegalArgumentException("O comprimentro não pode ser zero ou negativo");
        if(largura < 1)
            throw new IllegalArgumentException("O largura não pode ser zero ou negativo");
        
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        
        if(comprimento < 1)
            throw new IllegalArgumentException("O comprimentro não pode ser zero ou negativo");
        
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura < 1)
            throw new IllegalArgumentException("O largura não pode ser zero ou negativo");
        
        this.largura = largura;
    }
    
    public double perimetro(){
        double perimetro = 2 * (getComprimento() * getLargura());
        return perimetro;
    }
    
    public double area(){
        double area = getComprimento() * getLargura();
        return area;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s %.2f%n%s %.2f%n%s %.2f%n%s %.2f%n%s", 
                "------------------------------------------------------------------------",
                super.toString(),
                "Comprimento:", getComprimento(),
                "Largura:", getLargura(),
                "Perimentro:", perimetro(),
                "Area:", area(),
                "------------------------------------------------------------------------");
    }
    
}
