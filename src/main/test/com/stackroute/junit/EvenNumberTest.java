package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.EvenNumber;
import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumberTest {
    EvenNumber object;
    @Before
    public void setUp()
    {
        object=new EvenNumber();
    }

    @After
    public void tearDown()
    {
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
    public void testForEven()
    {
        boolean number = object.isEven(64);
        assertEquals(true,number);
    }
    @Test
    public void testForNotEven()
    {
        boolean number = object.isEven(75);
        assertEquals(false,number);

    }



}