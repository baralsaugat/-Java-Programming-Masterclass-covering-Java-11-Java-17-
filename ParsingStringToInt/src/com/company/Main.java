package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(canPack(2,2 ,11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal <0){
            return false;
        }
        int smallKilos = smallCount *1 ;
      int total = bigCount *5 +smallCount *1;
      int difference = total- goal;
        if(difference ==0){
            return true;
        }
        else if( difference>=1){
            if(bigCount != 0 && difference % 5 ==0){
                return true;
            }
            else if(difference < smallKilos ){
                return true;
            }
            else if(difference %5 >smallKilos){
                return true;
            }
            return false;

        }
        return false;


    }
}
