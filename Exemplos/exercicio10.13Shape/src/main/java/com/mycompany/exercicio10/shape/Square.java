/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio10.shape;

/**
 *
 * @author Ueno Souza Silva
 */
public class Square extends TwoDimensionalShape{
    
    private double arresta;

    public Square(String nome, String descricao, double arresta) {
        super(nome, descricao);
        
        if(arresta <= 0.0)
            throw new IllegalArgumentException("A arresta deve ser > 0.0");
        
        this.arresta = arresta;
    }

    public double getArresta() {
        return arresta;
    }

    public void setArresta(double arresta) {
        if(arresta <= 0.0)
            throw new IllegalArgumentException("A arresta deve ser > 0.0");
        
        this.arresta = arresta;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getArea(){
        return Math.pow(arresta, 2);
    }
    
    @Override
    public String toString(){
        return String.format("%s%n%s: %.2f",
                super.toString(),
                "arresta", getArresta());
    }
}
