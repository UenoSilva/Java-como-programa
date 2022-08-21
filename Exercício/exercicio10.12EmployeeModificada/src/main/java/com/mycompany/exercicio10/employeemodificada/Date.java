/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio10.employeemodificada;

/**
 *
 * @author Ueno Souza Silva
 */
public class Date {
    
    private int day; //1 - 31, conforme o mês
    private int month; //1 - 12
    private int year; //qualquer apartir de 1900 a 2007
    
    private static final int[] dayPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int day, int month, int year) {
        
        if(day <= 0 || (day > dayPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day ("+ day +") out-of-range for specified month and year");
        if(month <= 0 || month > 12)
            throw new IllegalArgumentException("month ("+month+") must be1-12");
        if((month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) || (year < 1900))
            throw new IllegalArgumentException("Out-of-range spercified month and year");
            
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day <= 0 || (day > dayPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day ("+ day +") out-of-range for specified month and year");
        
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month <= 0 || month > 12)
            throw new IllegalArgumentException("month ("+month+") must be1-12");
        
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if((month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) || (year < 1900))
            throw new IllegalArgumentException("Out-of-range spercified month and year");
        
        this.year = year;
    }
    
    @Override
    public String toString(){
        return String.format("%02d/%02d/%d", 
                getDay(), getMonth(), getYear());
    }
    
}
