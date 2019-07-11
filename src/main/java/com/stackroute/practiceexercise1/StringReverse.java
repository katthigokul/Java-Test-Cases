package com.stackroute.practiceexercise1;

public class StringReverse {
    public static  void main(String[] args){
        String input="london";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1 =  input1.reverse();
        System.out.println(input1);

    }
}
