package com.stackroute.pe1;

public class JunitDemo {

    public String concatAndUppercase(String str1,  String str2){
        if(str1 == null || str2 == null)
        {
            return ("Notnull");
        }
        String concatedString=str1.concat(str2);
        return concatedString.toUpperCase();
    }
    public String reverseString(String input)
    {
        StringBuilder output=new StringBuilder(input);
        return output.reverse().toString();
    }
}
