package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int myMinVal = Integer.MIN_VALUE;
        int myMaxVal = Integer.MAX_VALUE;
    System.out.println(myMinVal + " and " + myMaxVal);


    byte myMinByte = Byte.MIN_VALUE;
    byte myMaxByte = Byte.MAX_VALUE;
        System.out.println(myMinByte + " " + myMaxByte);

    short myMinShort = Short.MIN_VALUE;
    short myMaxShort = Short.MAX_VALUE;
        System.out.println(myMinShort + " " + myMaxShort);


        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println(myMinLong + " " + myMaxLong);



        byte validByteNum = Byte.MIN_VALUE + 1;
        short validShortNum = Short.MIN_VALUE + 1;
        int validInt = Integer.MIN_VALUE + 1;

        long totalLong = 50000 + 10 * (validByteNum + validShortNum + validInt);


        System.out.println("This " + totalLong);





//        floatig and double primitive type

        float myFloatValue = Float.MAX_VALUE;
        double myDoubleMax = Double.MAX_VALUE;


//        convert a given number of pounds to kg

        int inputPound = 4;

        double unitPounToKg = 0.45359237;

        double result = inputPound * unitPounToKg;

        System.out.println("result:" + result);



        System.out.println(myFloatValue);
        System.out.println(myDoubleMax);
                }}


