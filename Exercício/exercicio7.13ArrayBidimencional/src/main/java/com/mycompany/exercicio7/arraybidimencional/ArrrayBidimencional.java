// Exercício 7.13: ArrayBidimencional.java

package com.mycompany.exercicio7.arraybidimencional;

/**
 *
 * @author Ueno Souza Silva
 */
public class ArrrayBidimencional {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        
        int[][] sales = new int[3][5];
        
        for(int row = 0; row < sales.length; row++){
            for(int col = 0; col < sales[row].length; col++){
                sales[row][col] = 0;
            }
        }
        
        for(int row = 0; row < sales.length; row++){
            for(int col = 0; col < sales[row].length; col++){
                System.out.printf("[%d][%d]=%d ", row, col, sales[row][col]);
            }
            System.out.println();
        }
    }
    
}
