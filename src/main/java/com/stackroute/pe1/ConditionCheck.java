package com.stackroute.pe1;
/**
 * Practice Exercise Question - 2
 * Class accepts an integer number as input from the user and perform the
 * following conditional checks:
 * a. Print Tom if number is odd and exists between 20 to 30
 * b. Print Jerry, if number is even and exists between 20 and 30
 */

public class ConditionCheck {
    public String  conditionCheck (int n){
        if ((n % 2 != 0) && (n>= 20 && n <= 30)) {
            return "Tom";
        } else if ((n % 2 == 0) && (n >= 20 && n <= 30)) {
            return ("Jerry");
        }
        return null;
    }

}


