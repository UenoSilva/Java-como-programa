//Exercicio 8.12: Data e hora

package com.mycompany.exercicio8.dateandtime;

/**
 *
 * @author Ueno Souza Silva
 */
public class DateAndTime {
    
    private int month;
    private int day;
    private int year;
    private int hour;
    private int minute;
    private int second;
    
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public DateAndTime(){}
    
    public DateAndTime( int day, int month, int year, int hour, int minute, int second){
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-60");
        
        if(month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month+ ") must be 1-12");
        if(day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29))
            throw new IllegalArgumentException("day (" + day + ")out-of-range for the specified month and year");
        if(year < 1900 || year > 2021)
            throw new IllegalArgumentException("Ano não está no intervalo correto");
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.day = day;
        this.year = year;
        
        System.out.printf("Date and Time object constructor for dateAndTime %s%n", this);
    }
    
    //Incremnta os segundos
    public void tick(){
        this.second++;
        
        if(second == 60){
            incrementMinute();
            this.second = 0;
        }
    }
    
    //Incrementa os minutos
    public void incrementMinute(){
        this.minute++;
        
        if(minute == 60){
            incrementHour();
            this.minute = 0;
        }
    }
    
    //Incrementa as horas
    public void incrementHour(){
        this.hour++;
        
        if(hour == 24){
            nextDay();
            this.hour = 0;
        }
    }
    
    //Incremeta para o proximo dia, mês e ano
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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
        
    public String toUniversalString(){
        return String.format("%02d/%02d/%02d %02d:%02d:%02d", getDay(), getMonth(),getYear(), getHour(), getMinute(), getSecond());
    }
    
    @Override
    public String toString(){
        return String.format("%02d/%02d/%02d %d:%02d:%02d %s", getDay(), getMonth(),getYear(),
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                  getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
    
}
