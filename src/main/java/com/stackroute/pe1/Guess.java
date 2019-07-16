package com.stackroute.pe1;
/* Practice 8
Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
100) User should guess until the the target number is guessed correctly.
Print separate messages for the following:
a. Number guessed is more than original number
b. Number guessed is less than original number
c. Number guessed matches the original number
*/

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args){
        Random rand=new Random();
        int numToGuess=rand.nextInt(100);
        Scanner input=new Scanner(System.in);
        int guess;
        System.out.println("Guess a Number between 1 to 100");
        guess=input .nextInt();
        if(guess == numToGuess){
            System.out.println("Guessed Number matched with the Original Number");
        }
        else if(guess < numToGuess){
            System.out.println("Guessed Number is low than the Original Number");
        }
        else if(guess > numToGuess){
            System.out.println("Guessed Number is greater than the Original Number");
        }


    }
}
