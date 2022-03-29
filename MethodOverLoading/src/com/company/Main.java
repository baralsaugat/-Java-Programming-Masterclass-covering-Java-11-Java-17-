package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      calcFeetAndInchesToCentimeters(10,5);
      calcFeetAndInchesToCentimeters(5);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet <= 0 || inches >= 12){
            System.out.println("this");
            return -1;

        }
        double cm = (feet*30.48) + (inches * 2.54);
        System.out.println("cm = "+ cm);
        return  cm  ;

    }
    public static double calcFeetAndInchesToCentimeters(double inches){

        if (inches < 0) {

            return -1;
        }
        double centi = inches/12;

        System.out.println(inches +" =" + centi);

        return centi;



    }
}
