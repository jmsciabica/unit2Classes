

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    
    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
        public void testFillUp()
        {
            VendingMachine testVendingMachine = new VendingMachine(50,20);
            testVendingMachine.fillUp(30);
            assertEquals(80.0,testVendingMachine.getCans(), 1e-6);
            
        }

    @Test
        public void testInsertToken()
        {
            VendingMachine testVendingMachine = new VendingMachine(50,20);
            testVendingMachine.insertToken(5);
            assertEquals(25.0, testVendingMachine.getTokens(), 1e-6);
            
            
        }   

}
