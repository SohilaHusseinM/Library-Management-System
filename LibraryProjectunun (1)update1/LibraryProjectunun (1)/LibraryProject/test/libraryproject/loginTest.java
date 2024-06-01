/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class loginTest {
    
    public loginTest() {
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
     * Test of main method, of class login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        login.main(args);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of connectionLink method, of class login.
     */
    @Test
    public void testConnectionLink() {
        System.out.println("connectionLink");
        login instance = new login();
        instance.connectionLink();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of password method, of class login.
     */
    @Test
    public void testPassword() {
        System.out.println("password");
        login instance = new login();
        Boolean expResult = null;
        Boolean result = instance.password();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class login.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        login instance = new login();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Check_login method, of class login.
     */
    @Test
    public void testCheck_login() {
        System.out.println("Check_login");
        String username = "sobi";
        String pass = "Sohila1234";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.Check_login(username, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testCheck_login1() {
        System.out.println("Check_login");
        String username = "sobii";
        String pass = "Sohila1234";
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.Check_login(username, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Check_signup method, of class login.
     */
   @Test
    public void testCheck_signup() {
        System.out.println("Check_signup");
        String name = "sohila";
        String username = "sobi";
        String gender = "Female";
        String pass = "sohila";
        String compass = "sohila";
        int age = 21;
        login instance = new login();
        boolean expResult = false;
        boolean result = instance.Check_signup(name, username, gender, pass, compass, age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
