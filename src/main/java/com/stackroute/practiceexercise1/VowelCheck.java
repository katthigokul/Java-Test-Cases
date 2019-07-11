package com.stackroute.practiceexercise1;

import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String input = s.next();
            if ((input != null) && (!input.isEmpty()) && (!input.matches(".*\\d.*"))) {
                char[] inputArray = input.toCharArray();
                for (char c : inputArray) {
                    if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
                        System.out.println(c + " - vowel");
                    } else {
                        System.out.println(c + " Consonant");
                    }
                }
            } else {
                System.out.println("Please give a valid string");
            }
            /*Close the scanner*/
            s.close();

    }
}
