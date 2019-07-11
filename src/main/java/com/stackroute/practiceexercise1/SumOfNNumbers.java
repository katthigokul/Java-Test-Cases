package com.stackroute.practiceexercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers (enter any character to stop reading): ");
        int number = 0;
        int sum = 0;
        while (true) {
            try {
                number = s.nextInt();
                sum += number;
                System.out.println("Sum: " + sum);
            } catch (InputMismatchException ime) {
                System.out.println("Please enter integers only");
                break;
            }
        }
        /*Close the scanner*/
        s.close();
    }
}