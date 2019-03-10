package LabSheetThree;


import java.util.Random;
import java.util.Scanner;

/**
 * @author Callum Anderson
 * @version 1.0
 */

public class Main {

    /*
    Write a guess the number game with numbers 1-10 with replayability.
     */

    private static int userGuess(){

        Scanner input = new Scanner(System.in);

        System.out.println("What is your guess? (1-10) ");

        int guess = input.nextInt();

        if(guess < 1 || guess > 10){

            return userGuess();

        }

        return guess;

    }

    private static boolean playAgain(){


        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to play again? (y/n) ");

        String yesOrNo = input.next();

        return yesOrNo.equals("y");

    }

    private static void game(){

        boolean playAgain = true;
        Random rand = new Random();

        do{

            int guess;
            int numberToGuess = rand.nextInt(10) + 1;
            System.out.println(numberToGuess);

            do{

                guess = userGuess();

                if(guess < numberToGuess){

                    System.out.println("The number is higher than your guess.");

                }else if(guess > numberToGuess){

                    System.out.println("The number is lower than your guess.");

                }else{

                    System.out.println("Correct! The number is: " + numberToGuess);
                    playAgain = playAgain();


                }

            }while(guess != numberToGuess);

        }while(playAgain);

    }

    public static void main(String[] args) {

        game();

    }


}


