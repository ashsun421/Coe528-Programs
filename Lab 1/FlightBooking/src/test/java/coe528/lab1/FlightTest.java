/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ashsu
 */
public class FlightTest {
    
    public FlightTest() {
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
    
    @Test
    public void testConstructor(){
        System.out.println("testConstructor");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        assertEquals("Toronto", instance.get_origin());
        assertEquals("Kolkata", instance.get_destination());
        assertEquals("03/02/99 7:50 pm", instance.get_departureTime());
        assertEquals(100, instance.get_capacity());
        assertEquals(1000, instance.get_originalPrice(), 0.0);
        assertEquals(100, instance.get_numberOfSeatsLeft());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor(){
        System.out.println("testInvalidConstructor");
        Flight invalidFlight = new Flight(1050,"Toronto", "Toronto","03/02/99 7:50 pm",100,1000);        
    }
       
    /**
     * Test of get_flightNumber method, of class Flight.
     */
    @Test
    public void testGet_flightNumber() {
        System.out.println("get_flightNumber");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        int expResult = 1030;
        int result = instance.get_flightNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of set_flightNumber method, of class Flight.
     */
    @Test
    public void testSet_flightNumber() {
        System.out.println("set_flightNumber");
        int flightNumber = 1000;
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        instance.set_flightNumber(flightNumber);
        
    }

    /**
     * Test of get_origin method, of class Flight.
     */
    @Test
    public void testGet_origin() {
        System.out.println("get_origin");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        String expResult = "Toronto";
        String result = instance.get_origin();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of set_origin method, of class Flight.
     */
    @Test
    public void testSet_origin() {
        System.out.println("set_origin");
        String origin = "Toronto";
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        instance.set_origin(origin);
        
    }

    /**
     * Test of get_destination method, of class Flight.
     */
    @Test
    public void testGet_destination() {
        System.out.println("get_destination");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        String expResult = "Kolkata";
        String result = instance.get_destination();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of set_destination method, of class Flight.
     */
    @Test
    public void testSet_destination() {
        System.out.println("set_destination");
        String destination = "Kolkata";
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        instance.set_destination(destination);
    
    }

    /**
     * Test of get_departureTime method, of class Flight.
     */
    @Test
    public void testGet_departureTime() {
        System.out.println("get_departureTime");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        String expResult = "03/02/99 7:50 pm";
        String result = instance.get_departureTime();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of set_departureTime method, of class Flight.
     */
    @Test
    public void testSet_departureTime() {
        System.out.println("set_departureTime");
        String departureTime = "03/02/99 7:50 pm";
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        instance.set_departureTime(departureTime);
    
    }

    /**
     * Test of get_capacity method, of class Flight.
     */
    @Test
    public void testGet_capacity() {
        System.out.println("get_capacity");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        int expResult = 100;
        int result = instance.get_capacity();
        assertEquals(expResult, result);

    }

    /**
     * Test of set_capacity method, of class Flight.
     */
    @Test
    public void testSet_capacity() {
        System.out.println("set_capacity");
        int capacity = 100;
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        instance.set_capacity(capacity);

    }

    /**
     * Test of get_originalPrice method, of class Flight.
     */
    @Test
    public void testGet_originalPrice() {
        System.out.println("get_originalPrice");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        double expResult = 1000.0;
        double result = instance.get_originalPrice();
        assertEquals(expResult, result, 1);
 
    }

    /**
     * Test of set_originalPrice method, of class Flight.
     */
    @Test
    public void testSet_originalPrice() {
        System.out.println("set_originalPrice");
        double originalPrice = 1000;
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        instance.set_originalPrice(originalPrice);

    }

    /**
     * Test of get_numberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGet_numberOfSeatsLeft() {
        System.out.println("get_numberOfSeatsLeft");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        int expResult = 100;
        int result = instance.get_numberOfSeatsLeft();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of set_numberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSet_numberOfSeatsLeft() {
        System.out.println("set_numberOfSeatsLeft");
        int numberOfSeatsLeft = 100;
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        instance.set_numberOfSeatsLeft(numberOfSeatsLeft);

    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        String expResult = "Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, Original Price: 1000.0$";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
