/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio7.arrayunidmencional;

import java.util.Arrays;

/**
 *
 * @author Ueno Souza Silva
 */
public class ArrayUnidmencional {
    
    public static void main(String[] args){
        int[] count = new int[10];
        Arrays.fill(count, 0);
        
        int[] bonus = new int[15];
        for(int i = 0; i < bonus.length; i++){
            bonus[i] = 1;
        }
        
        printArray(count);
        System.out.println("");
        printArray(bonus);
        
    }
    
    public static void printArray(int[] array){
        for(int n : array){
            System.out.printf("[%d] ", n);
        }
    }
    
}
