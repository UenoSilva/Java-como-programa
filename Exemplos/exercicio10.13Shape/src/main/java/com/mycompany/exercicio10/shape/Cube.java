
package com.mycompany.exercicio10.shape;

/**
 *
 * @author Ueno Souza Silva
 */
public class Cube extends ThreeDimensionalShape{
    
    private double arresta;

    public Cube(String nome, String descricao, double arresta) {
        super(nome, descricao);
        
        if(arresta <= 0.0)
            throw new IllegalArgumentException("A arresta deve ser maior que 0.0");
        
        this.arresta = arresta;
    }

    public double getArresta() {
        return arresta;
    }

    public void setArresta(double arresta) {
        if(arresta <= 0.0)
            throw new IllegalArgumentException("A arresta deve ser maior que 0.0");
        
        this.arresta = arresta;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getArea(){
        return 6 * Math.pow(arresta, 2);
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getVolume(){
        return Math.pow(arresta, 3);
    }
    
    @Override
    public String toString(){
        return String.format("%s%n%s: %.2f",
                super.toString(),
                "arresta", getArresta());
    }
    
}
