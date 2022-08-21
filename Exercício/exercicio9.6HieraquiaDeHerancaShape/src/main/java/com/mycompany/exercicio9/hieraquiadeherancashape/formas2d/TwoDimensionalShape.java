/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio9.hieraquiadeherancashape.formas2d;

/**
 *
 * @author Ueno Souza Silva
 */
public class TwoDimensionalShape extends Shape{
    
    private String definicao;

    public TwoDimensionalShape(String definicao, String nome, String descricao) {
        super(nome, descricao);
        this.definicao = definicao;
    }

    public String getDefinicao() {
        return definicao;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s%n%s",
                "Definição:", getDefinicao(),
                super.toString());
    }
    
    
    
}
