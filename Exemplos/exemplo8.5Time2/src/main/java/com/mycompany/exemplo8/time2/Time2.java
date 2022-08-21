//Exemplo 8.5: Time2.java
//declaração da classe Time2 com construtores sobrecarregados

package com.mycompany.exemplo8.time2;

/**
 *
 * @author Ueno Souza Silva
 */
public class Time2 {
    
    private int hour; //0-23
    private int minute; //0-59
    private int second; //0-59
    
    //construtor sem argumento Time2:
    //inicializa cada variável de instância com zero
    public Time2(){
        this(0, 0, 0);
    }
    
    //Construtor Time2: hora fornecida, minuto e secundo padronizados para 0.
    public Time2(int hour){
        this(hour, 0, 0);
    }
    
    //Construtor Time2: Hora e minuto fornecidos, secundo padronizado para 0.
    public Time2(int hour, int minute){
        this(hour, minute, 0);
    }
    
    //Construtor Time2: Hora, minuto e segundo fornecidos.
    public Time2(int hour, int minute, int second){
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException();
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException();
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException();
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    //Construtor Time2: Outro objeto Time2 fornecido.
    public Time2(Time2 time){
        //invoca um construtor com três argumentos
        this(time.getHour(), time.getMinute(), time.getSecond());
    }
    
    //Métodos set
    //Configura um novo valor de tempo usando a hora universal;
    //valida os dados
    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException();
        if(minute < 0 || minute >= 60)
            throw new IllegalArgumentException();
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException();
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    //Valida e configura o valor de hora
    public void setHour(int hour){
        if(hour < 0 || hour >= 24)
            throw new IllegalArgumentException();
        
        this.hour = hour;
    }
    
    //Valida e configura o valor de minuto
    public void setMinute(int minute){
        if(minute < 0 || minute >= 60)
           throw new IllegalArgumentException();
        
        this.minute = minute;
    }
    
    //Valida e configura o valor de segundo
    public void setSecond(int second){
        if(second < 0 || second >= 60)
            throw new IllegalArgumentException();
        
        this.second = second;
    }
    
    //Métodos get
    //obtém o valor de hora
    public int getHour(){
        return hour;
    }
    
    //obtém o valor de minuto
    public int getMinute(){
        return minute;
    }
    
    //obtém o valor de secundo
    public int getSecond(){
        return second;
    }
    
    //Converte no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    
    //Converte no formato padrão de data/hora (H:MM:SS AM ou PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s", 
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
