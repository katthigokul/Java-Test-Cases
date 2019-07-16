package com.stackroute.pe1;
/**
 * Practice Exercise Question - 6
 * Class that takes a character from the user as input and determines whether the
 * character entered is a capital letter, a small case letter, a digit or a special symbol and display
 * appropriately.
 */

public class AlphabetCheck
{
    public String letterChecker(char inputCharacter){
        String letterType = "";
        if (Character.isAlphabetic(inputCharacter)) {
            if (Character.isUpperCase(inputCharacter)) {
                letterType = "Capital letter";
            } else if (Character.isLowerCase(inputCharacter)) {
                letterType = "Lowercase letter";
            }
        }
        else if (Character.isDigit(inputCharacter)){
            letterType = "Digit";
        }
        else {
            letterType = "Special symbol";
        }

        return letterType;
    }
}
