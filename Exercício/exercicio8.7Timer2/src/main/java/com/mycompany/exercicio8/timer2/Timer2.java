/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio8.timer2;

/**
 *
 * @author Ueno Souza Silva
 */
public class Timer2 {
    
    private int hour;
    private int minute;
    private int second;
    
    public Timer2(){
        this(0, 0, 0);
    }
    
    public Timer2(int hour){
        this(hour, 0, 0);
    }
    
    public Timer2(int hour, int minute){
        this(hour, minute, 0);
    }
    
    public Timer2(int hour, int minute, int second){
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-60");
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Timer2(Timer2 time){
        this(time.getHour(), time.getMinute(), time.getSecond());
    } 
    
    public void setTimer(int hour, int minute, int second){
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-60");
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void tick(){
        this.second++;
        
        if(second == 60){
            incrementMinute();
            this.second = 0;
        }
    }
    
    public void incrementMinute(){
        this.minute++;
        
        if(minute == 60){
            incrementHour();
            this.minute = 0;
        }
    }
    
    public void incrementHour(){
        this.hour++;
        
        if(hour == 24){
            this.hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-60");
        
        this.second = second;
    }
    
    public String toUniversalString(){
        return String.format("%02d/%02d/%02d", getHour(), getMinute(), getSecond());
    }
    
    @Override
    public String toString(){
        return String.format("%d:%02d:%02d %s", 
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                  getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
