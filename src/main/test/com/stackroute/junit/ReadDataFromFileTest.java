package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.ReadDataFromFile;
import org.junit.*;

import static org.junit.Assert.*;

public class ReadDataFromFileTest {
    ReadDataFromFile object;
    @Before
    public void setUp() throws Exception {
        object=new ReadDataFromFile();
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
    public void testForDataFromFile() throws Exception {
        String t=object.readFileAsString("/home/priya/Desktop/Data.txt");
        assertEquals("THIS IS A NEW FILE.\n" +
                "20",t);
    }
    @Test
    public void testForFileLocationNotFound() throws Exception {
        String t=object.readFileAsString("/home/priya/Desktop/Bata.txt");
        assertEquals("File location not found",t);
    }
}