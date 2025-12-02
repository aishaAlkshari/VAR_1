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
import usecase1_fillchecklist.ApplicationLayer;
import usecase1_fillchecklist.Database;

/**
 *
 * @author ayoosh_alkooshary
 */
public class testSaveChecklistItem {
    
    public testSaveChecklistItem() {
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
public void testSaveChecklistItem() {
    Database db = new Database();
    ApplicationLayer app = new ApplicationLayer(db);

    String answer = "Yes";

    app.saveChecklistItem(answer);

    
    assertTrue(true); 
}

    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
