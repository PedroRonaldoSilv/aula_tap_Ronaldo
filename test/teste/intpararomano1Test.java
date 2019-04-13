/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samsung
 */
public class intpararomano1Test {
    
    public intpararomano1Test() {
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
     * Test of converter method, of class intpararomano1.
     */
    @Test
    public void testConverter() {
  intpararomano1 pe = new intpararomano1(); 
    assertEquals("I", pe.converter(1));
     assertEquals("II", pe.converter(2));
     assertEquals("III", pe.converter(3));
     assertEquals("IV", pe.converter(4));
     assertEquals("V", pe.converter(5));}
    
}
