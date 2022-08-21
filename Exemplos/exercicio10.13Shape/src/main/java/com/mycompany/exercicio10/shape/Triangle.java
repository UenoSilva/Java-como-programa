
package com.mycompany.exercicio10.shape;

/**
 *
 * @author Ueno Souza Silva
 */
public class Triangle extends TwoDimensionalShape{
    
    private double base;

    public Triangle(String nome, String descricao, double base) {
        super(nome, descricao);
        
        if(base <= 0.0)
            throw new IllegalArgumentException("A base deve ser maior que 0.0");
        
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if(base <= 0.0)
            throw new IllegalArgumentException("A base deve ser maior que 0.0");
        
        this.base = base;
    }
    
    public double altura(){
        return Math.sqrt(Math.pow(base, base) - Math.pow(base/2, 2));
    }
    
    @Override
    public double getArea(){
        return getBase() * altura() / 2;
    }
    
    @Override
    public String toString(){
        return String.format("%s%n%s: %.2f%n%s: %.2f",
                super.toString(),
                "base", getBase(),
                "altura", altura());
    }
    
}
