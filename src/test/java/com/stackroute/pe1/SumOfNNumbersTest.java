package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SumOfNNumbersTest {
    SumOfNNumbers sumOfNNumbers;

    @Before
    public void setUp() {
        this.sumOfNNumbers = new SumOfNNumbers();
    }

    @Test
    public void givenNumberShouldReturnAnArray() {
        //act
        int[] actualResult = this.sumOfNNumbers.printer(9);
        //assert
        int[] expectedResult = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5,
                6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8,
                8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberShouldReturnAnArrayOfLengthOne() {
        //act
        int[] actualResult = this.sumOfNNumbers.printer(1);
        //assert
        int[] expectedResult = {1};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test (expected = OutOfMemoryError.class)
    public void givenNumberShouldReturnAnOutOfMemoryError() {
        //act
        int[] actualResult = this.sumOfNNumbers.printer(100000000);
    }

    @Test
    public void givenNumberShouldReturnAnEmptyArray() {
        //act
        int[] actualResult = this.sumOfNNumbers.printer(0);
        //assert
        int[] expectedResult = {};
        assertArrayEquals(expectedResult, actualResult);
    }

}