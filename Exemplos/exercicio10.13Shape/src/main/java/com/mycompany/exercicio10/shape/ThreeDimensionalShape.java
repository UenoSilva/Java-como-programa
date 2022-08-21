
package com.mycompany.exercicio10.shape;

/**
 *
 * @author Ueno Souza Silva
 */
public abstract class ThreeDimensionalShape extends Shape{

    public ThreeDimensionalShape(String nome, String descricao) {
        super(nome, descricao);
    }
    
    @Override
    public String toString(){
        return String.format("%s", super.toString());
    }
    
    public abstract double getArea(); //método abstrato para calculo da área
    
    public abstract double getVolume(); //método abstrato para o calculo do volume
    
}
