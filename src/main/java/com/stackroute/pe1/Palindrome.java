package com.stackroute.pe1;

public class Palindrome {
    public String palindromeAndSumOfEvensCheck(long number) {
        if (checkPalindrome(number)) {
            if (checkSumOfEvenNumbers(number)) {
                return (number + "is a palindrome and the sum of even numbers is greater than 25");
            } else {
                return (number + "is a palindrome and the sum of even numbers is less than 25");
            }
        } else {
            return (number + "is not a palindrome");
        }
    }


    private boolean checkSumOfEvenNumbers(long number) {
        long n = number;
        int sum = 0;
        long tempNumber;
        while (n != 0) {
            tempNumber = n % 10;
            if (tempNumber % 2 == 0) {
                sum += tempNumber;
            }
            n = n / 10;
        }
        return sum >= 25;
    }


    private boolean checkPalindrome(long number) {
        long n = number;
        long reverseOfNumber = 0;
        while (n != 0) {
            reverseOfNumber = (reverseOfNumber * 10) + n % 10;
            n = n / 10;
        }
        return (reverseOfNumber == number);
    }



    private static boolean checkPalindrome(int number) {
        int n = number;
        int reverseOfNumber = 0;
        while (n != 0) {
            reverseOfNumber = (reverseOfNumber * 10) + n % 10;
            n = n / 10;
        }
        return (reverseOfNumber == number);
    }

}


