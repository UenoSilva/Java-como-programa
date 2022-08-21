
package com.mycompany.exercicio10.shape;

/**
 *
 * @author Ueno Souza Silva
 */
public class Sphera extends ThreeDimensionalShape{
    
    private double raio; //raio de uma esfera

    public Sphera(String nome, String descricao, double raio) {
        super(nome, descricao);
        
        if(raio <= 0.0)
            throw new IllegalArgumentException("O raio deve ser maior que 0.0");
        
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio <= 0.0)
            throw new IllegalArgumentException("O raio deve ser maior que 0.0");
        
        this.raio = raio;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getArea(){
        return 4 * Math.PI * Math.pow(raio, 2);
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getVolume(){
        return 4 * Math.PI * Math.pow(raio, 3) / 3;
    }
    
    @Override
    public String toString(){
        return String.format("%s%n%s: %.2f",
                super.toString(),
                "raio", getRaio());
    }
    
}
