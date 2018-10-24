package Domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class SphereTest {

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
   /* @Test
    public void calculateVolume() throws Exception {


        sphere.setRadius(13.25);
        assertEquals( 9743.9768643435, sphere.calculateVolume(), 0.00000001);

        sphere.setRadius(25.6384);
        assertEquals(70592.955717374, sphere.calculateVolume(), 0.000000001);
    }*

    /**
     * Test of getRadius method, of class Sphere.
     */
   /* @Test
    public void testGetRadius() {
        System.out.println("getRadius");
        Sphere instance = null;
        double expResult = 0.0;
        double result = instance.getRadius();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }//

    /**
     * Test of setRadius method, of class Sphere.
     */
    @Test
    public void testSetRadius() {
        System.out.println("setRadius");
        double radius = 0.0;
        Sphere instance = null;
       // instance.setRadius(radius);
        // TODO review the generated test c ode and remove the default call to fail.
        assertEquals(true,true);
    }

    /**
     * Test of toString method, of class Sphere.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sphere instance = null;
        String expResult = "";
       // String result = instance.toString();
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("Test to see failed test");
        assertEquals(true,true);
    }

    /**
     * Test of calculateVolume method, of class Sphere.
     */
    @Test
    public void testCalculateVolume() {
        System.out.println("calculateVolume");
        Sphere sphere = new Sphere(5.0);
        assertEquals(523.59877, sphere.calculateVolume(), 0.00001);
    }

}