
package com.mycompany.exercicio8.timer2;

/**
 *
 * @author Ueno Souza Silva
 */
public class Timer2Test {
    
    public static void main(String[] args){
        
        //Timer2 t1 = new Timer2();
        //Timer2 t2 = new Timer2(13);
        //Timer2 t3 = new Timer2(12, 40);
        Timer2 t4 = new Timer2(1, 45, 0);
        //Timer2 t5 = new Timer2(t4);
        
        /*
        displayTimer("Antes de incrementa o minuto", t4);
        t3.incrementMinute();
        displayTimer("Depois de incrementa o minuto", t4);
        
        displayTimer("Antes de incrementa a hora", t4);
        t3.incrementHour();
        displayTimer("Depois de incrementa a hora", t4);
        
        displayTimer("Antes de incrementa o segundo", t4);
        t4.tick();
        displayTimer("Depois de incrementa o segundo", t4);
        */
        
        for(int i = 0; i <= 60000; i++){
            t4.tick();
            System.out.println(t4.toUniversalString());
        }
    }
    
    public static void displayTimer(String header, Timer2 time){
        System.out.printf("%s%n %s%n %s%n", header, time.toUniversalString(), time.toString());
    }
    
}
