//Exercício 8.12: Data e hora

package com.mycompany.exercicio8.dateandtime;

/**
 *
 * @author Ueno Souza Silva
 */
public class DateAndTimeTest {
    
    public static void main(String[] args){
        
        //argumento de date e hora são dia, mês, ano, hora, minuto e segundo
        DateAndTime d1 = new DateAndTime(6, 12, 2021, 16, 35, 0);
        
        for(int i = 0; i <= 86400; i++){
            d1.tick();
            System.out.println(d1.toUniversalString());
        }
    }
    
}
