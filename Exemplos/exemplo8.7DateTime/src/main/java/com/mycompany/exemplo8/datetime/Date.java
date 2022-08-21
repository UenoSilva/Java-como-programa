// Exemplo 8.7: Date.java
// Declaração da classe Date

package com.mycompany.exemplo8.datetime;

/**
 *
 * @author Ueno Souza Silva
 */
public class Date {
    
    private int month; //mês 1-12
    private int day; // dia 1-31 dependendo do mês
    private int year; // qualquer ano
    
    private static final int[] monthPerDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    //construtor: verique o valor adequado para mês, dia e ano
    public Date(int month, int day, int year){
        //Verifica se o mês está no intervalo
        if(month <= 0 || month > 12){
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }
        //Verifica se o day está no intervalo do mês
        if(day <= 0 || (day > monthPerDay[month] && !(month == 2 && month == 29))){
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the spercified month and year" );
        }
        //Verifique no ano bissesto se o mês é 2 e o dia é 29
        if(month == 2 && month == 29 && !(year % 400 == 0 && (year % 4 == 0 || year % 100 != 0))){
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the spercified month and year");
        }
        
        this.month = month;
        this.day = day;
        this.year = year;
        
        System.out.printf("Date object constructor for date %s%n", this);
    }
    
    //Retorna uma String no formato mês/dia/ano
    @Override
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
    
}
