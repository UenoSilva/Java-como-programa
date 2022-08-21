
package com.mycompany.exercicio10.shape;

/**
 *
 * @author Ueno Souza Silva
 */
public abstract class TwoDimensionalShape extends Shape {

    public TwoDimensionalShape(String nome, String descricao) {
        super(nome, descricao);
    }
    
    @Override
    public String toString(){
        return String.format("%s", super.toString());
    }
    
    public abstract double getArea();
}
