package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int number = scanner.nextInt();
        }
        else{
            System.out.println("input the valid number");
        }


scanner.close();
    }



}
