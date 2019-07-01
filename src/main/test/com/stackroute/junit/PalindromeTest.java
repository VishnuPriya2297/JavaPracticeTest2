package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.Palindrome;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome object;

    @org.junit.Before
    public void setUp() throws Exception {
        object=new Palindrome();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        object=null;
    }
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("Class Creation");
    }

    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("Class Deletion");
    }
    @Test
    public void testForNullString()
    {
        String t=object.checkWhethertheInputIspalindrome("");
        assertEquals("Enter some data",t);
    }
    @Test
    public void testForStringIsPalinddrome()
    {
        String t=object.checkWhethertheInputIspalindrome("madam");
        assertEquals("The string is a palindrome.",t);
    }
    @Test
    public void testForStringIsNotPalinddrome()
    {
        String t=object.checkWhethertheInputIspalindrome("hey");
        assertEquals("The string isn't a palindrome.",t);
    }


}