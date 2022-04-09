package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number){
        if(number <0){
            return -1;
        }

        int greatestPrime =0;
        if(digitCount(number) == 1){
            if(number == 2 || number == 3 || number== 5 || number ==7){
                return number;
            }
        }
        else
        {


            for(int i =3; i <= number; i++){

                int prevGreatestPrime =0;


                {for(int j=2; j<=i; j++){
                    int factor =2;

                    if(j % i != 0){
                        factor = j;
                    }


                    if( number % factor == 0){
                        prevGreatestPrime = factor;
                    }


                }
                    if(prevGreatestPrime>greatestPrime) {
                        greatestPrime = prevGreatestPrime;
                    }
                }


            }
         }
        return greatestPrime;


}

public static int digitCount(int number){
        int count = 0;
        while (number != 0){
            number /=10;
            count ++;
        }
        return count;
}

}
