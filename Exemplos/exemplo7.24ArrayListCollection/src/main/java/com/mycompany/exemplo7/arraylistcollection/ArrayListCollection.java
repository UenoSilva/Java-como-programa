/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo7.arraylistcollection;

import java.util.ArrayList;

/**
 *
 * @author Ueno Souza Silva
 */
public class ArrayListCollection {
    
    public static void main(String[] args){
        
        ArrayList<String> items = new ArrayList<>();
        
        items.add("red"); // anexa um item na lista
        items.add(0, "yellow"); // insere "yellow" no índice 0
        
        //Cabeçalho
        System.out.print("Display list contents with counter-controlled loop:");
        
        //Exibe as cores na lista
        for(int i = 0; i < items.size(); i++){
            System.out.printf(" %s", items.get(i));
        }
        
        displayItems(items, "\nDisplay contents with enhanced for statement:");
        
        items.add("green");
        items.add("yellow");
        displayItems(items, "Lista com dois novos elementos: ");
        
        items.remove("yellow");
        displayItems(items, "Remove first instance of yellow: ");
        
        items.remove(1);
        displayItems(items, "Remove second list element (green): ");
        
        //Verifica se há um valor na lista
        System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "" : "not ");
        
        //Exibe o número de elementos na lista
        System.out.printf("Size: %s%n", items.size());
    }

    private static void displayItems(ArrayList<String> items, String header) {
        System.out.print(header);
        for(String item : items){
            System.out.printf(" %s", item);
        }
        
        System.out.println();
    }
    
}
