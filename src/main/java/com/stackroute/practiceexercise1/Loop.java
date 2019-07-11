package com.stackroute.practiceexercise1;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int n= input.nextInt();
                for (int i = 1; i < n; i++) {
                    for (int j = 0; j < i; j++) {
                    System.out.println(i);
            }
        }
    }
}
