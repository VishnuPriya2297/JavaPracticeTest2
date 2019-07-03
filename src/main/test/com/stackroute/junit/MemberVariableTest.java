package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.Member;
import main.java.com.stackroute.junit.MemberVariable;
import org.junit.*;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable object;
    @Before
    public void setUp() throws Exception {
        object=new MemberVariable();
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
    public void  printDetailsOfMember()
    {
        String result=object.printValues("priya",21,26000);
        assertEquals("Member's name: priya"+"\n"+"Member's age: 21"+"\n"+"Member's salary: 26000.0",result);
    }
    @Test
    public void  printDetailsOfMemberFail()
    {
        String result=object.printValues("priya",21,26000);
        assertNotNull("Member's name: priya"+"\n"+"Member's age: 21"+"\n"+"Member's salary: 26000.0",result);
    }
}