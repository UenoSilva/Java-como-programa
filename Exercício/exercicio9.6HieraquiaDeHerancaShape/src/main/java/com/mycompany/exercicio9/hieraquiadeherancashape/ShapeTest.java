/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio9.hieraquiadeherancashape;

import com.mycompany.exercicio9.hieraquiadeherancashape.Formas3d.Cilindro;
import com.mycompany.exercicio9.hieraquiadeherancashape.Formas3d.Cone;
import com.mycompany.exercicio9.hieraquiadeherancashape.Formas3d.Cubo;
import com.mycompany.exercicio9.hieraquiadeherancashape.Formas3d.Cuboide;
import com.mycompany.exercicio9.hieraquiadeherancashape.Formas3d.Esfera;
import com.mycompany.exercicio9.hieraquiadeherancashape.formas2d.Circulo;
import com.mycompany.exercicio9.hieraquiadeherancashape.formas2d.Quadrado;
import com.mycompany.exercicio9.hieraquiadeherancashape.formas2d.Retangulo;
import com.mycompany.exercicio9.hieraquiadeherancashape.formas2d.Triangulo;

/**
 *
 * @author Ueno Souza Silva
 */
public class ShapeTest {

    public static void main(String[] args) {

        Quadrado q = new Quadrado("Quadrado", "Objeto 2d", "Um quadrado é uma forma 2D com quatro lados iguais e cada ângulo é igual a 90.", 6);
        Circulo c = new Circulo("Circulo", "Objeto 2d", "Um círculo é uma forma 2D fechada composta por uma linha curva sem cantos ou arestas.", 36);
        Triangulo t = new Triangulo("Triangulo", "Objeto 2d", "Um triângulo é uma forma 2D com três lados e três vértices (cantos).", 10);
        Retangulo r = new Retangulo("Retangulo", "Objeto 2d", "Um retângulo é uma forma 2D com quatro lados em que os lados opostos são iguais e paralelos, e todos os quatro ângulos medem 90. ", 16, 9);

        /*
        System.out.println(q.toString());
        System.out.println(c.toString());
        System.out.println(t.toString());
        System.out.println(r.toString());
         */
        Esfera e = new Esfera("Esfera", "Objeto 3d", "Uma esfera  tem forma redonda. É uma forma geométrica 3D que tem todos os pontos em sua superfície equidistantes de seu centro.", 10);
        Cilindro ci = new Cilindro("Cilindro", "Objeto 3d", "Um cilindro é uma forma 3D que tem duas faces circulares, uma na parte superior e outra na parte inferior, e uma superfície curva.", 5, 10);
        Cone co = new Cone("Cone", "Objeto 3d", "Um cone é outra forma 3D que tem uma base plana (que é de forma circular) e uma ponta pontiaguda no topo.", 10, 10);
        Cubo cu = new Cubo("Cubo", "Objeto 3d", "Um poliedro é uma forma 3D que possui faces poligonais como (triângulo, quadrado, hexágono) com arestas retas e vértices. Um cubo tem seis faces quadradas.", 20);
        Cuboide cub = new Cuboide("Cuboide", "Objeto 3d", "Prismas são sólidos com extremidades poligonais idênticas e lados planos de paralelogramo. O cuboide é um prisma retangular.", 5, 20, 10);
                
        //System.out.println(e.toString());
        //System.out.println(ci.toString());
        //System.out.println(co.toString());
        //System.out.println(cu.toString());
        System.out.println(cub.toString());

    }

}
