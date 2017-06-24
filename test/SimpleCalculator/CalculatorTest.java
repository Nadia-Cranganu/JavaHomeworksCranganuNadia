/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Nadia
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of main method, of class Calculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of addition method, of class Calculator.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        Calculator.addition();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of subtraction method, of class Calculator.
     */
    @Test
    public void testSubtraction() {
        System.out.println("subtraction");
        Calculator.subtraction();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculator.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        Calculator.division();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of multiplication method, of class Calculator.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        Calculator.multiplication();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
