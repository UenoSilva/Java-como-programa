//Exemplo 8.1: Time1.java
//Declaração da clasee Time1 mantém data/hora no formato de 24 horas

package com.mycompany.exemplo8.time1;

/**
 *
 * @author Ueno Souza Silva
 */
public class Time1 {
    
    private int hour; //0-24
    private int minute; //0-59
    private int second; //0 -59
    
    //configura um novo valor de tempo usando a hora universal; lança uma
    //exerção se a hora, minuto ou segundo for inválido.
    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour > 24 || minute < 0 || minute > 59 || second < 0 || second > 59){
            throw new IllegalArgumentException("hour, minute and/or second was of rage");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public String toUniversalString(){
        return String.format("%02d:%02d%02d%n", hour, minute, second);
    }
    
    public String toString(){
        return String.format("%02d:%02d:%02d %s", ((hour == 0) || (hour == 12) ? 12 : hour % 12), 
                minute, second, (hour > 12) ? "PM" : "AM");
    }
    
}
