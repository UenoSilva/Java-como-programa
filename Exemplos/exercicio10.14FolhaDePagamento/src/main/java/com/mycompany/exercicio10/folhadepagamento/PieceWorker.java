
package com.mycompany.exercicio10.folhadepagamento;

/**
 *
 * @author Ueno Souza Silva
 */
public class PieceWorker extends Employee{
    
    private double wage; //sálario por peça produzida
    private double pieces; //número de peças priduzidas

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, double pieces) {
        super(firstName, lastName, socialSecurityNumber);
        
        if(wage < 0.0)
            throw new IllegalArgumentException("Pieces wage must be >= 0.0");
        if(pieces < 0.0)
            throw new IllegalArgumentException("Produced pieces must be >= 0.0");
        
        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0)
            throw new IllegalArgumentException("Pieces wage must be >= 0.0");
        
        this.wage = wage;
    }

    public double getPieces() {
        return pieces;
    }

    public void setPieces(double pieces) {
        if(pieces < 0.0)
            throw new IllegalArgumentException("Produced pieces must be >= 0.0");
        
        this.pieces = pieces;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double earnings(){
        return getPieces() * getWage();
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %.2f%n%s: %.2f",
                "piece worker", super.toString(),
                "wage", getWage(),
                "produced pieces", getPieces());
    }
}
