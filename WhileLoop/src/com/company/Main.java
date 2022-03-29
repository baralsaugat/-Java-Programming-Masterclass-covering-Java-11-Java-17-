package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(sumDigits(135));
//        System.out.println(isPalindrome(121));
//        System.out.println(sumFirstAndLastDigit(11256));

//        System.out.println(getEvenDigitSum(23408));

        System.out.println(hasSharedDigit(23,24));
    }


    public static int sumDigits(int number){
        if(number<=10){
            return -1;
        }

        int sum = 0;


        while(number > 0){
       int digit = number % 10;
                   sum += digit;
            number = number/10;

        }
        return sum;
    }


    public static boolean isPalindrome( int number){

        int reverse= 0;
        int formatedNum = number;

        while(formatedNum != 0){
            reverse *= 10;
            int lastDigit = formatedNum % 10;
            formatedNum /= 10;
            reverse += lastDigit;

        }

        if(reverse == number){
            return true;
        }
        return false;

    }

    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }

        int sum = 0;


        int lastDigit = number % 10;
        int firstDigit =0;



       while (number != 0){
           firstDigit = number; //should have to pass the value of number to first digit before changing the value of number
            number = number / 10;


        }

sum = firstDigit + lastDigit;




       return sum;
    }



    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;

        while(number!=0){
            int digit = number % 10;
            if(digit % 2 == 0){
                sum += digit;
            }
            number /=10 ;
        }
        return sum;
    }


    public static boolean hasSharedDigit(int firstNum, int secondNum){
        if((firstNum<10 || firstNum>99) ||(secondNum <10 || secondNum>99) ){
            return false;
        }
        while(firstNum != 0){
            int firstNumDigit = firstNum % 10;
            int oldSecondNum = secondNum;
            System.out.println("here");
            System.out.println(firstNumDigit);
            while(secondNum != 0){
                int secondNumDigit = secondNum % 10;
                System.out.println("second");
                System.out.println(secondNumDigit);

                if(firstNumDigit == secondNumDigit){
                    return true;
                }
                secondNum /= 10;
            }
            firstNum /= 10;
            secondNum =oldSecondNum;
        }
        return false;
    }
}
