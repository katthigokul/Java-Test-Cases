package com.stackroute.pe1;

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


