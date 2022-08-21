
package com.mycompany.exercicio8.time2;

/**
 *
 * @author Ueno Souza Silva
 */
public class Time2Test {
    
    public static void main(String[] args){
        
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(12, 25, 42);
        
        displayTime("t1: All arguments default", t1);
        displayTime("t2: hour, minute and second spercified", t2);
        
        
    }
    
    public static void displayTime(String header, Time2 t){
        System.out.printf("%s%n %s%n %s%n %s%n", 
                header, t.toUniversalString(), t.secondsBeforeMidnigth(),
                t.toString());
    }
    
}
