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
public class Triangulo extends TwoDimensionalShape{
    
    private double side;

    public Triangulo(String nome, String definicao, String descricao, double side) {
        super(definicao, nome, descricao);
        
        if(side < 0)
            throw new IllegalArgumentException("Side precisa ser maior que 0");
        
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        
        if(side < 0)
            throw new IllegalArgumentException("Side precisa ser maior que 0");
        
        this.side = side;
    }
    
    public double altura(){
        double altura = Math.sqrt(3)*getSide()/2;
        return altura;
    }
    
    public double perimetro(){
        double perimetro =  getSide() * 3;
        return perimetro;
    }
    
    public double area(){
        double area = getSide() * altura() / 2;
        return area;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s %.2f%n%s %.2f%n%s %.2f%n%s", 
                "------------------------------------------------------------------------",
                super.toString(),
                "Lado:", getSide(),
                "Perimetro:", perimetro(),
                "Area:", area(),
                "------------------------------------------------------------------------");
    }
    
}
