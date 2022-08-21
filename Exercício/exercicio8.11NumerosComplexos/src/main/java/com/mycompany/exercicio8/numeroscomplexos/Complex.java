//Exercicio 8.11: Números complexos

package com.mycompany.exercicio8.numeroscomplexos;

/**
 *
 * @author Ueno Souza Silva
 */
public class Complex {
    
    private float nReal;
    private float nImaginario;
    
    public Complex(){
        this(0,0);
    }
    
    public Complex(float nReal, float nImaginario){
        this.nReal = nReal;
        this.nImaginario = nImaginario;
    }
    
    public void somarReal(Complex a, Complex b){
        nReal = a.getnReal() + b.getnReal();
        nImaginario = a.getnImaginario() + b.getnImaginario();
    }
    
    public void subtrairReal(Complex a, Complex b){
        nReal = a.getnReal() - b.getnReal();
        nImaginario = a.getnImaginario() - b.getnImaginario();
    }

    public float getnReal() {
        return nReal;
    }

    public void setnReal(float nReal) {
        this.nReal = nReal;
    }

    public float getnImaginario() {
        return nImaginario;
    }

    public void setnImaginario(float nImaginario) {
        this.nImaginario = nImaginario;
    }
    
    @Override
    public String toString(){
        return String.format("%.2f %s %.2f%s%n", this.nReal,
                (this.nImaginario < 0) ? "-" : "+", this.nImaginario, "i");
    }    
    
}
