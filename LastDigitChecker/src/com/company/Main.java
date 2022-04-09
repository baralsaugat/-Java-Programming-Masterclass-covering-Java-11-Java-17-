package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        System.out.println(getGreatestCommonDivisor(1010, 10));
//        printFactors(4);

//        System.out.println(isPerfectNumber(6));
        numberToWords(100);
        System.out.println(reverse(1556));
//        System.out.println( getDigitCount(100));

    }


    public static boolean hasSameDigit(int x, int y, int z){
        if(x<10 || y<10 || z<10 ||x>1001 || y>1001 || z>1001){
            return false;
        }

        int xLastDigit = x % 10;
        int yLastDigit = y % 10;
        int zLastDigit = z % 10;

        if(xLastDigit == yLastDigit && xLastDigit ==zLastDigit && yLastDigit ==zLastDigit){
            return true;
        }
        else if(xLastDigit == yLastDigit ){
            return true;
        }
        else if(xLastDigit == zLastDigit && yLastDigit ==zLastDigit ){
            return true;
        }

        return false;
    }

    public static boolean isValid(int number){
        if(number<10 || number >1001){
            return false;
        }
        return true;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int greatestCommonDivisor = 0;

       for(int i = 1; i<= first; i++){
           int firstNumberDivisor = 0;
           int prevGreatestDivisor=0;
           if(first % i == 0){
               firstNumberDivisor = i;
           }
//           System.out.println(firstNumberDivisor);
           for(int j =1; j<= second; j++) {
               int secondNumberDivisor = 0;
               if(second % j == 0){
                   secondNumberDivisor = j;
               }
               if(firstNumberDivisor ==secondNumberDivisor){
                   prevGreatestDivisor = firstNumberDivisor;
               }
           }
           if(greatestCommonDivisor <prevGreatestDivisor){
               greatestCommonDivisor = prevGreatestDivisor;
           }
//           System.out.println(greatestCommonDivisor +prevGreatestDivisor);

       }
       return greatestCommonDivisor;
    }

    public static void printFactors( int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        for(int i= 1; i<= number; i++){
            if(number%i ==0){
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int sum =0;
        for(int i=1; i<number; i++){
            if(number% i == 0){
                sum += i;
            }
        }
        if(number == sum){
            return true;
        }
        return false;
    }

    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
int firstDigitCount = getDigitCount(number);
        int newNumber = 0;
        int reversedNumber = reverse(number);
        int reverseDigitCount =getDigitCount(reversedNumber);
        int lastDigit =0;
        int prevDigitCount = getDigitCount(number);
        while (reversedNumber != 0) {
            newNumber  *= 10;
            lastDigit = reversedNumber % 10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four"); break;
                case 5:
                    System.out.println("Five"); break;
                case 6:
                    System.out.println("Six"); break;
                case 7:
                    System.out.println("Seven"); break;
                case 8:
                    System.out.println("Eight"); break;
                case 9:
                    System.out.println("Nine"); break;

            }
            reversedNumber /= 10;
newNumber += lastDigit;

        }
        if(firstDigitCount != reverseDigitCount){
            for(int i=0; i < firstDigitCount-reverseDigitCount; i++){
                System.out.println("Zero");
            }
        }






    }
    public static int reverse(int number){
        int lastDigit = 0;
        int newNumber = 0;
        while(number != 0){
            newNumber  *= 10;
            lastDigit= number % 10;
            number = number /10;
            newNumber += lastDigit;
        }
        return newNumber;
    }

    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count = 0;
        while(number != 0){

            count ++;
            number /= 10;
        }
        return count;
    }


}

