
package com.mycompany.exercicio8.rectangle;

/**
 *
 * @author Ueno Souza Silva
 */
public class Rectangle {
    
    private double width;
    private double heigth;
    
    public Rectangle(){
        this(1,1);
    }
    
    public Rectangle(double width, double heigth){
        this.heigth = heigth;
        this.width = width;
    }
    
    public double areaRectangle(){
        return getHeigth() * getWidth();
    }
    
    public double perimetroRectangle(){
        return getHeigth() + getHeigth() + getWidth() + getWidth();
    }

    // Retorna o valor da largura
    public double getWidth() {
        return width;
    }

    //Configurar o valor da largura
    public void setWidth(double width) {
        if(width < 0.0 || width > 20.0)
           this.width = width;
        else
            throw new IllegalArgumentException("Valor abaixo de 0.0 ou acima de 20.0\n");
    }

    //Retorna o valor da altura
    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        if(heigth < 0.0 || heigth > 20.0)
            this.heigth = heigth;
        else
            throw new IllegalArgumentException("Valor abaixo de 0.0 ou acima de 20.0\n");
    }

    @Override
    public String toString() {
        return String.format("%s%n %s %.3f%n %s %.3f%n" , "Retângulo", 
                             "Perimetro:", perimetroRectangle(),
                             "Área:", areaRectangle());
    }
    
    
    
    
}
