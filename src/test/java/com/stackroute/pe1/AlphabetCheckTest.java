package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphabetCheckTest {
    AlphabetCheck alphabetCheck;

    @Before
    public void setUp(){
        //arrange
        this.alphabetCheck = new AlphabetCheck();
    }

    @Test
    public void givenCharacterShouldReturnLowerCase() {
        //act
        String actualResult = this.alphabetCheck.letterChecker('z');
        //assert
        assertEquals("Lowercase letter", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnUpperCase() {
        //act
        String actualResult = this.alphabetCheck.letterChecker('G');
        //assert
        assertEquals("Capital letter", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnDigit() {
        //act
        String actualResult = this.alphabetCheck.letterChecker('3');
        //assert
        assertEquals("Digit", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnSpecialSymbol() {
        //act
        String actualResult = this.alphabetCheck.letterChecker('%');
        //assert
        assertEquals("Special symbol", actualResult);
    }

}