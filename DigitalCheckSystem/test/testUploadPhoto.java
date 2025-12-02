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
import usecase3_uploadphoto.ApplicationLayer;

/**
 *
 * @author ayoosh_alkooshary
 */
public class testUploadPhoto {
    
    public testUploadPhoto() {
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
public void testUploadPhoto() {
    ApplicationLayer app = new ApplicationLayer();

    boolean result = app.uploadPhoto("image1.png");

    assertTrue(result);
}

    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
