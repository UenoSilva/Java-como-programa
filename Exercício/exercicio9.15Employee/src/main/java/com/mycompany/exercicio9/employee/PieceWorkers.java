/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio9.employee;

/**
 *
 * @author Ueno Souza Silva
 */
public class PieceWorkers extends Employee{
    
    private int pecasProduzidas;
    private double valorPorPeca;

    public PieceWorkers(String firstName, String lastName, String socialSecurityNumber, int pecasProduzidas, double valorPorPeca) {
        super(firstName, lastName, socialSecurityNumber);
        
        if(pecasProduzidas < 0)
            throw new IllegalArgumentException("Peças produzidas devem ser maior ou igual 0");
        if(valorPorPeca <= 0.0)
            throw new IllegalArgumentException("O valor da peça produzida dever ser maior que 0.0");
        
        this.pecasProduzidas = pecasProduzidas;
        this.valorPorPeca = valorPorPeca;
    }

    public int getPecasProduzidas() {
        return pecasProduzidas;
    }

    public void setPecasProduzidas(int pecasProduzidas) {
        if(pecasProduzidas < 0)
            throw new IllegalArgumentException("Peças produzidas devem ser maior ou igual 0");
                    
        this.pecasProduzidas = pecasProduzidas;
    }

    public double getValorPorPeca() {
        return valorPorPeca;
    }

    public void setValorPorPeca(double valorPorPeca) {
        if(valorPorPeca <= 0.0)
            throw new IllegalArgumentException("O valor da peça produzida dever ser maior que 0.0");
        
        this.valorPorPeca = valorPorPeca;
    }
    
    public double earnings(){
        return getPecasProduzidas() * getValorPorPeca();
    }
    
    @Override
    public String toString(){
        return String.format("%s%n%s %d%n%s %.2f", 
                super.toString(),
                "peças produzidas:", getPecasProduzidas(),
                "valor por peça:", getValorPorPeca());
    }
    
    
}
