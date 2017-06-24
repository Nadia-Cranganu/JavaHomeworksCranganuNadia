/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class FilesManagementTest {
    
    public FilesManagementTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of writeStringFile method, of class FilesManagement.
     */
    @Test
    public void testWriteStringFile() throws Exception {
        System.out.println("writeStringFile");
        String file = "";
        String content = "";
        FilesManagement instance = new FilesManagement();
        instance.writeStringFile(file, content);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readStringFile method, of class FilesManagement.
     */
    @Test
    public void testReadStringFile() throws Exception {
        System.out.println("readStringFile");
        String file = "";
        FilesManagement instance = new FilesManagement();
        String expResult = "";
        String result = instance.readStringFile(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStringToFile method, of class FilesManagement.
     */
    @Test
    public void testAddStringToFile() throws Exception {
        System.out.println("addStringToFile");
        String file = "";
        String content = "";
        FilesManagement instance = new FilesManagement();
        instance.addStringToFile(file, content);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFileContent method, of class FilesManagement.
     */
    @Test
    public void testDeleteFileContent() throws Exception {
        System.out.println("deleteFileContent");
        String file = "";
        FilesManagement instance = new FilesManagement();
        instance.deleteFileContent(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
