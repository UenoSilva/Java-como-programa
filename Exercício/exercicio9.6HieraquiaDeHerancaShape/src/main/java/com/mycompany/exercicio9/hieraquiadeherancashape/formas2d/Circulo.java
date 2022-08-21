
package com.mycompany.exercicio9.hieraquiadeherancashape.formas2d;

import com.mycompany.exercicio9.hieraquiadeherancashape.formas2d.TwoDimensionalShape;

/**
 *
 * @author Ueno Souza Silva
 */
public class Circulo extends TwoDimensionalShape{
    
    private double raio;

    public Circulo(String nome, String definicao, String descricao, double raio) {
        super(definicao, nome, descricao);
        
        if(raio < 0)
            throw new IllegalArgumentException("Side precisa ser maior que 0");
        
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        
        if(raio < 0)
            throw new IllegalArgumentException("Side precisa ser maior que 0");
        
        this.raio = raio;
    }
    
    public double perimetro(){
        double perimetro = 2 * getRaio() * Math.PI;
        return perimetro;
    }
    
    public double area(){
        double area = Math.pow(getRaio(), 2) * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n%s %.2f%n%s %.2f%n%s %.2f%n%s",
                "------------------------------------------------------------------------",
                super.toString(),
                "Raio:", getRaio(),
                "Perimento:", perimetro(),
                "Área:", area(),
                "------------------------------------------------------------------------");
    }
    
}
