package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ConditionCheckTest {
    ConditionCheck conditionCheckTest ;


    @Before
    public void setUp() throws Exception {
        conditionCheckTest = new ConditionCheck();
    }

    @After
    public void tearDown() throws Exception {
        conditionCheckTest= null;
    }

    @Test
    public void givenNumberShouldReturnString() {
        String result = conditionCheckTest.conditionCheck(25);
        assertEquals("Tom",result);
        result = conditionCheckTest.conditionCheck(22);
        assertEquals("Jerry",result);
    }

    @Test
    public void givenNumberShouldReturnNull() {
        String result = conditionCheckTest.conditionCheck(55);
        assertNull(result);
    }

}