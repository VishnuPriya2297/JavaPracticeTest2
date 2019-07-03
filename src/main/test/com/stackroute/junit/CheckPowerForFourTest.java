package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.CheckPowerForFour;
import org.junit.*;

import static org.junit.Assert.*;

public class CheckPowerForFourTest {
    CheckPowerForFour object;

    @Before
    public void setUp() throws Exception {
        object=new CheckPowerForFour();
    }

    @After
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
    public void testForPower()
    {
        String number = object.checkPower(64);
        assertEquals("it is power of 4",number);
    }
    @Test
    public void testForNotPower()
    {
        String number = object.checkPower(70);
        assertEquals("it is not a power of 4",number);
    }
    @Test
    public void testForNotPowerFail()
    {
        String number = object.checkPower(70);
        assertNotNull("it is a power of 4",number);
    }
}