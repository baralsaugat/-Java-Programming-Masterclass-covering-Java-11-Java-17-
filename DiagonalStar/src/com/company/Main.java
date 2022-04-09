package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        printSquareStar(5);
    }


    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }
        for(int i = 0; i <number; i++){
            for(int j =0; j<number; j++){
                if (i == 0) {

                    System.out.print("*");
                }
                
//                else if(j == 0 && (i>0 && i <number)){
//                    System.out.println("*");
//                }
//                else if(j == number-1 && (i>0 && i <number)){
//                    System.out.println("*");
//                }
//
//
//                else if(i==number-1){
//                    System.out.print("*");
//                }




            }
        }
    }
}
