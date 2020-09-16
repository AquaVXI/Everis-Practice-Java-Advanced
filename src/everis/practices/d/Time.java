/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everis.practices.d;

import everis.practices.Test;
import java.util.InputMismatchException;

/**
 *
 * @author Kurisutian
 */
public class Time implements Test {
    
    private int hour;
    private int minute;
    private double second;
    
    public Time(){
        this.hour   = 0;
        this.minute = 0;
        this.second = 0.0d;
    }

    public Time(int hour, int minute, double second){
        
        try{
            setHour(hour);
            setMinute(minute);
            setSecond(second);
        }catch(InputMismatchException i){
            System.err.println("Los valores deben ser numéricos.");
        }catch(NumberFormatException n){
            System.err.println("Los valores asignados deben ser del tipo correspondiente (int || double).");
        }catch(Exception e){
            System.err.println("Los valores asignados son inválidos. Por favor, verifique.");
        }
        
    }
    
    
    // Getters and Setters
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        
        if(hour >= 0){
            this.hour = hour;
        }else{
            throw new IllegalArgumentException("La hora debe ser asignada a un número mayor que 0.");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        
        if(minute >= 0 && minute < 60){
            this.minute = minute;
            
        }else if (minute == 60){
            setHour(this.hour+1);
            this.minute = 0;
        
        }else{
            throw new IllegalArgumentException("Los minutos deben ser asignados ente 0 y 60.");
        }
        
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        if(second >= 0 && second < 60){
            this.second = second;
        }else if (second == 60){
            setMinute(this.minute+1);
            this.second = 0d;
        }else{
            throw new IllegalArgumentException("Los segundos deben ser asignados ente 0 y 60.");
        }
    }

    
    // Own methods
    public static boolean equals(Time t1, Time t2){
        return t1.hour == t2.hour
            && t1.minute == t2.minute
            && t1.second == t2.second;
    }
    
    public static Time add(Time t1, Time t2){   
        Time sum = new Time();
        
        sum.setHour(t1.hour + t2.hour);
        sum.setMinute(t1.minute + t2.minute);
        sum.setSecond(t1.second + t2.second);
        
        return sum;
    }
    
    public Time add(Time t2){
        Time sum = new Time();
        
        sum.setHour(this.hour + t2.hour);
        sum.setMinute(this.minute + t2.minute);
        sum.setSecond(this.second + t2.second);
        
        return sum;
    }
    
    // Overridable methods
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The total time is: ").append(hour);
        sb.append("h:").append(minute);
        sb.append("m:").append(second).append("s");
        return sb.toString();
    }
    
    @Override
    public void test(){
        Time t1 = new Time();
        
        t1.setHour(24);
        t1.setMinute(60);
        t1.setSecond(60);
        
        System.out.println(t1);
        
        Time t2 = new Time(12, 30, 60);
        
        System.out.println(t2);
    }
}
