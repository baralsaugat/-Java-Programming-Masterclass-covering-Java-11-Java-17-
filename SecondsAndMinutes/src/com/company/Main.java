package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(getDurationString(120,10));
        System.out.println(getDurationString(3700));


    }

    private static String getDurationString(int minutes, int seconds){
        if( minutes <=0 || (seconds<=0 || seconds>=59)){
       return "Invalid Value";
        }


      int hour = minutes/60 ;
        minutes = minutes % 60;
        return  hour + "h "+ minutes+"m " + seconds+"s";


    }
    private static String getDurationString(int seconds){
        if(seconds <= 0){
         return "Invalid Value";
        }
        int minutes = seconds/60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);

    }
}
