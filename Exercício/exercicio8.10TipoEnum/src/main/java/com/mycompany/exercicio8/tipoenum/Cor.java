/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio8.tipoenum;

/**
 *
 * @author Ueno Souza Silva
 */
public enum Cor {
    
    RED(10),
    GREEN(5),
    YELLOW(7);
    
    private final int duracaoCor;
    
    Cor(int duracaoCor){
        this.duracaoCor = duracaoCor;
    }
    
    public int getDuracaoCor(){
        return duracaoCor;
    }
}
