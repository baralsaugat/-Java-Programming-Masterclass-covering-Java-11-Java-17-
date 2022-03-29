package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//        calculateScore(true, 500, 25, 1000);
//        calculateScore(true, 500, 25, 10);
        int highScorePosition = calculateHigherScorePosition(1500);

        displayHighScorePosition("saugat", highScorePosition);

       highScorePosition = calculateHigherScorePosition(800);

        displayHighScorePosition("bob", highScorePosition);

        highScorePosition = calculateHigherScorePosition(300);


        displayHighScorePosition("mark", highScorePosition);

        highScorePosition = calculateHigherScorePosition(50);
        displayHighScorePosition("Tori", highScorePosition);





    }


    public static void calculateScore( boolean gameOver, int score, int levelCompleted, int bonus){


        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was " + finalScore);

        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore) ;
        }



     }



     public  static void displayHighScorePosition(String playerName, int position ){
         System.out.println(playerName + "managed to get into position" + position + " on the high score table");
     }

     public static int calculateHigherScorePosition(int score){
        if(score >= 1000){
            return 1;
        }
        else if( score >= 500  ){
            return 2;
        }
        else if (score >= 100  ){
            return 3;
        }
        return 4;

    }
}