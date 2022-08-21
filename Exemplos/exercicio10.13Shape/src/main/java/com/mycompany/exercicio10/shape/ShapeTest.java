
package com.mycompany.exercicio10.shape;

/**
 *
 * @author Ueno Souza Silva
 */
public class ShapeTest {

    public static void main(String[] args) {
        
        Shape[] shape = new Shape[10];
        
        shape[0] = new Circle("Circulo", "Uma figura plana redonda cujo limite (a circunferência) consiste em pontos equidistantes de um ponto fixo (o centro).", 24.123);
        shape[1] = new Sphera("Esfera", "Uma esfera é um corpo tridimensional limitado por uma superfície, designada por superfície esférica, cujos pontos são equidistantes de um ponto interior a que se chama centro.", 24.123);
        
        
        
        //Imprimir os objetos de Shape
        for(Shape s : shape){
            System.out.println(s);
            
            if(s instanceof TwoDimensionalShape sh){
                System.out.printf("Área: %.2f%n%n", sh.getArea());
            }
            if(s instanceof ThreeDimensionalShape thSH){
                System.out.printf("Área: %.2f%n", thSH.getArea());
                System.out.printf("Volume: %.2f%n%n", thSH.getVolume());
            }
        }
    }
    
}
