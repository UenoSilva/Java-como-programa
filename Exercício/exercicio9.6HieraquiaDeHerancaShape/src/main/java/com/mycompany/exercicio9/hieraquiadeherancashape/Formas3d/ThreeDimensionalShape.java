
package com.mycompany.exercicio9.hieraquiadeherancashape.Formas3d;

import com.mycompany.exercicio9.hieraquiadeherancashape.formas2d.Shape;

/**
 *
 * @author Ueno Souza Silva
 */
public class ThreeDimensionalShape extends Shape{
    
    private String definicao;

    public ThreeDimensionalShape(String definicao, String nome, String descricao) {
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
