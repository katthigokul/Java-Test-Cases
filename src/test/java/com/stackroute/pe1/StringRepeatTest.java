package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringRepeatTest {
    StringRepeat stringRepeat;

    @Before
    public void setUp() throws Exception {
        stringRepeat = new StringRepeat();
    }

    @After
    public void tearDown() throws Exception {
        stringRepeat = null;
    }

    @Test
    public void givenStringAndNumberShouldReturnStringWithRepeatedSubString() {
        assertEquals("Stackrouterouterouterouterouteroute",
                stringRepeat.repeat("Stackroute", 5));
        assertEquals("Stackroutetete",
                stringRepeat.repeat("Stackroute",2));
    }

}