// Exemplo 8.5: Time2Test.java
// Construtores sobrecarregados utilizados para inicializar objetos Time2.

package com.mycompany.exemplo8.time2;

/**
 *
 * @author Ueno Souza Silva
 */
public class Time2Test {
    
    public static void main(String[] args){
        
        Time2 t1 = new Time2(); //00:00:00           
        Time2 t2 = new Time2(2); //2:00:00
        Time2 t3 = new Time2(21, 34); //21:34:00
        Time2 t4 = new Time2(12, 25, 42); //12:25:42
        Time2 t5 = new Time2(t4); //12:25:42
        
        System.out.println("Construtores com:");
        displayTime("t1: todos os argumentos padrão", t1);
        displayTime("t2: hora espercicada, minuto e secundo padrão", t2);
        displayTime("t3: hora e minuto espercificados, secundo padrão", t3);
        displayTime("t4: hora, minuto e secundo espercificados", t4);
        displayTime("t5: Objeto Time2 t4 espercificado", t5);
        
    }
    
    public static void displayTime(String hearder, Time2 time){
        System.out.printf("%s%n   %s%n   %s%n", hearder, 
                time.toUniversalString(), time.toString());
    }
    
}
