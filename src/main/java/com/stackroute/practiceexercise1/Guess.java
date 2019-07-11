package com.stackroute.practiceexercise1;


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
