/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import usecase4_verifylocation.LocationService;

/**
 *
 * @author ayoosh_alkooshary
 */
public class testLocationVerified {
    
    public testLocationVerified() {
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

    // TODO add test methods here.
    @Test
public void testLocationVerified() {
    LocationService loc = new LocationService();

    String result = loc.checkLocation(21.5435, 39.1720, 21.5435, 39.1720);

    assertEquals("Location Verified", result);
}

    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
