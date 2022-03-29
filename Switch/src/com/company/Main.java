package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        char switchValue = 'd';
//        switch(switchValue){
//            case 'a':
//                System.out.println("char is a");
//                break;
//            case 'b':
//                System.out.println("char is b");
//                break;
//            case 'c': case 'd':
//                System.out.println("char was found");
//                System.out.println("char is" + switchValue);
////                break;
//
//            default:
//                System.out.println("char is e");
//                break;
//        }
printDayOfTheWeek(1);


    }

    public static void printDayOfTheWeek(int day){

        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }





}
