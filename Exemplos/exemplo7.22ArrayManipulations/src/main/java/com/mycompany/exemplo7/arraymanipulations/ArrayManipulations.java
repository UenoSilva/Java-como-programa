/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo7.arraymanipulations;

import java.util.Arrays;

/**
 *
 * @author Ueno Souza Silva
 */
public class ArrayManipulations {
    
    public static void main(String[] args){
        
        //Criar e classificar um array em ordem crescente
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        
        for(double value : doubleArray){
            System.out.printf("%.1f ", value);
        }
        
        //Preenche o array de 10 elementos com 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");
        
        //Copia um array intArray em array intArrayCopia
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopia = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopia, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopia, "intArrayCopia");
        
        //Verifica a igualdade de intArray e intArrayCopia
        boolean b = Arrays.equals(intArray, intArrayCopia);
        System.out.printf("%n%nintArray %s intArrayCopia%n", b ? "==": "!=");
        
        //Verifica a igualdade de intArray e filledIntArray
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray%n", b ? "==" : "!=");
        
        //Pesquisa o valor 5 em intArray
        int location = Arrays.binarySearch(intArray, 5);
        
        if(location >= 0){
            System.out.printf("Found 5 at element %d in intArray%n", location);
        }else{
            System.out.println("5 not found in intArray");
        }
        
        //Pesquisa o valor 8763 in intArray
        location = Arrays.binarySearch(intArray, 8763);
        
        if(location >= 0){
            System.out.printf("Found 8763 at element %d in intArray%n");
        }else{
            System.out.println("8763 not found in intArray");
        }
    }

    //Gera a saída de valores em cada array
    private static void displayArray(int[] array, String descrition) {
        System.out.printf("%n%s: ", descrition);
        for(int value : array){
            System.out.printf("%d ", value);
        }
    }
    
}
