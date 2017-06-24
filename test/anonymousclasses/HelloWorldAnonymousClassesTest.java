/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclasses;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Nadia
 */
public class HelloWorldAnonymousClassesTest {
    
    public HelloWorldAnonymousClassesTest() {
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
     * Test of sayHello method, of class HelloWorldAnonymousClasses.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        HelloWorldAnonymousClasses instance = new HelloWorldAnonymousClasses();
        instance.sayHello();
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class HelloWorldAnonymousClasses.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HelloWorldAnonymousClasses.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
