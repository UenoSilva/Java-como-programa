
package com.mycompany.exercicio9.hieraquiadeherancashape.formas2d;

import com.mycompany.exercicio9.hieraquiadeherancashape.formas2d.TwoDimensionalShape;

/**
 *
 * @author Ueno Souza Silva
 */
public class Quadrado extends TwoDimensionalShape{
    
    private double side;

    public Quadrado(String nome, String definicao, String descricao, double side) {
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
    
    public double perimetro(){
        double perimetro = getSide() * 4;
        return perimetro;
    }
    public double area(){
        double area = Math.pow(getSide(), 2);
        return area;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s %.2f%n%s %.2f%n%s %.2f%n%s",
                "------------------------------------------------------------------------",
                super.toString(),
                "Lado:", getSide(),
                "Perimetro:", perimetro(),
                "Área:", area(),
                "------------------------------------------------------------------------");
    }
    
}
