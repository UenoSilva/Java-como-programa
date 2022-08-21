/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo7.initarray;

/**
 *
 * @author Ueno Souza Silva
 */
public class InitArray {
    
    public static void main(String[] args){
        
        args[0] = "5";
        args[1] = "0";
        args[2] = "4";
        
        if(args.length != 3){
            System.out.printf("Erro: please re-enter the entire command, including%n"
                            + "an array size, initial value and increment.%n");
        }else{
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];
            
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);
            
            for(int counter = 0; counter < array.length; counter++){
                array[counter] = initialValue + increment * counter;
            }
            
            System.out.printf("%s%8s%n", "Index", "Value");
            for(int counter = 0; counter < array.length; counter++){
                System.out.printf("%5d%8d%n", counter, array[counter]);
            }
        }
    }
    
}
