//Exercício 8.8: Aprimorando a classe Date

package com.mycompany.exercicio8.aprimorandoclassedate;

/**
 *
 * @author Ueno Souza Silva
 */
public class Date {
    
    private int month;
    private int day;
    private int year;
    
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Date(int month, int day, int year){
        if(month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month+ ") must be 1-12");
        
        if(day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29))
            throw new IllegalArgumentException("day (" + day + ")out-of-range for the specified month and year");
        
        if(year < 1900 || year > 2021)
            throw new IllegalArgumentException("Ano não está no intervalo correto");
        
        this.month = month;
        this.day = day;
        this.year = year;
        
        System.out.printf("Date object constructor for date %s%n", this);
    }
    
    public void nextDay(){
        this.day++;
        
        if(month == 2 && (day == 29 || day == 30)){
            day = 1;
            month++;
        }
        
        if((month == 4 || month == 6 || month == 9 || month == 11) && day == 31){
            day = 1;
            month++;
        }
        
        if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 32){
            day = 1;
            month++;
        }
        
        if((month == 12) && day == 32){
            day = 1;
            month = 1;
            year++;
        }
               
    }
    
    public String toString(){
        return String.format("%02d:%02d:%d", month, day, year);
    }
}
