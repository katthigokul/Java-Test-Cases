package com.stackroute.pe1;

/**
 * Practice Exercise Question - 10
 * Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
 * repeat n number of times in the output String.
 */

public class StringRepeat {
    public String repeat(String input, int number)  {
        /*Initialize a string builder which is used to change the string*/
        StringBuilder output = new StringBuilder(input);
                /*Take substring from the given input string by subtracting
        the total length of the string with the given number
        */
        String subString = output.substring(input.length() - number);
        for (int i = 0; i < number; i++) {
            output.append(subString);
        }
/*Append the substring to the output for given "number" of times*/
        /*Uncomment this line for java version > 11*/
        /*for (int i = 0; i < number; i++) {
            output.append(subString);
        }*/
        /*For java >= 11 use these lines*/
        return (output.toString());
       
    }
}
