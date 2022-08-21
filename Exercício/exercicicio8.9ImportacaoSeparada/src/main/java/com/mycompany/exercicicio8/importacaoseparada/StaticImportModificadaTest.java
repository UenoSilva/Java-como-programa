/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicicio8.importacaoseparada;

import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

/**
 *
 * @author Ueno Souza Silva
 */
public class StaticImportModificadaTest {
    
    public static void main(String[] args){
        System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
        System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
        System.out.printf("E = %f%n", E);
        System.out.printf("Pi = %f%n", PI);
    }
    
}
