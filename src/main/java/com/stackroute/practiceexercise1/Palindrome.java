package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = s.nextInt();
        if (checkPalindrome(number)) {
            if (checkSumOfEvenNumbers(number)) {
                System.out.println(number + "is a palindrome and the sum of even numbers is greater than 25");
            } else {
                System.out.println(number + "is a palindrome and the sum of even numbers is less than 25");
            }
        } else {
            System.out.println(number + "is not a palindrome");
        }
        /*Close the scanner*/
        s.close();
    }


    private static boolean checkSumOfEvenNumbers(int number) {
        int n = number;
        int sum = 0;
        int tempNumber = 0;
        while(n != 0){
            tempNumber = n % 10;
            if (tempNumber%2 == 0){
                sum += tempNumber;
            }
            n = n/10;
        }
        return sum >= 25;
    }


    private static boolean checkPalindrome(int number) {
        int n = number;
        int reverseOfNumber = 0;
        while (n != 0){
            reverseOfNumber = (reverseOfNumber * 10) + n%10;
            n = n / 10;
        }
        return (reverseOfNumber == number);
    }

}