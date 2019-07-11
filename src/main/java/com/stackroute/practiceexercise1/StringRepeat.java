package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = s.next();
        StringBuilder output = new StringBuilder(input);
        /*Take number from user*/
        System.out.print("Enter number: ");
        int number = s.nextInt();
        while (number > input.length()) {
            System.out.println("Please enter number less than " + input.length() + ":");
            number = s.nextInt();
        }

        String subString = output.substring(input.length() - number);
        for (int i = 0; i < number; i++) {
            output.append(subString);
        }
//        output.append(subString.repeat(number));
        System.out.println(output);
        s.close();
    }
}
