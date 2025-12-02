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
import usecase2_inspectionreport.ReportGenerator;

/**
 *
 * @author ayoosh_alkooshary
 */
public class testGeneratePDF {
    
    public testGeneratePDF() {
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
public void testGeneratePDF() {
    ReportGenerator gen = new ReportGenerator();
    String file = gen.generatePDF(10);

    assertNotNull(file);
}

    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
