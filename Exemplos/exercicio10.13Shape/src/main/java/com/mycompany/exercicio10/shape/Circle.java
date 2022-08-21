
package com.mycompany.exercicio10.shape;

/**
 *
 * @author Ueno Souza Silva
 */
public class Circle extends TwoDimensionalShape{
    
    private double raio;

    public Circle(String nome, String descricao, double raio) {
        super(nome, descricao);
        
        if(raio <= 0.0)
            throw new IllegalArgumentException("O raio deve ser > 0.0");
        
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio <= 0.0)
            throw new IllegalArgumentException("O raio deve ser > 0.0");
        
        this.raio = raio;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getArea(){
        return Math.pow(raio, 2) * Math.PI;
    }
    
    @Override
    public String toString(){
        return String.format("%s%n%s %.2f", 
                super.toString(), "raio", getRaio());
    }
    
}
