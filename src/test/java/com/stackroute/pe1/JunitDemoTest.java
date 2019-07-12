package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JunitDemoTest {
    JunitDemo junitDemo;
    @Before
    public void setup(){
        //Arrange
        System.out.println("Inside Before");
       junitDemo=new JunitDemo();

    }
    @After
    public void tearDown(){
        System.out.println("Inside After");
        junitDemo=null;
    }
    @BeforeClass
    public static void BeforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public static void AfterClass(){
        System.out.println("After Class");
    }

    @Test
    public void givenTwoStringsShouldreturnconcatAndUppercase() {

        //Act
        String Result = junitDemo.concatAndUppercase("Hello","world");
        //Assert
        assertNotNull(Result);
        assertEquals("HELLOWORLD", Result);

    }

    @Test
    public void givenAStringAndnullShouldReturnErrorMessage()
    {
        //Act
        String Result=junitDemo.concatAndUppercase("Hello",null);
        //Assert
        assertNotNull(Result);
        assertEquals("Notnull", Result);
    }
    @Test
    public void givenStringShouldReturnReverseString(){
        String Result=junitDemo.reverseString("Hello");
        assertEquals("olleH",Result);
    }
    @Test(expected=NullPointerException.class)

    public void givenStringShouldThrowNullException()
    {
        String Result=junitDemo.reverseString(null);
    }


}