
package assignment2;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author harvinder
 */
public class CarTest {
    
    Car car ;
    
    public CarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
   @Before
    public void setUp()
    {
        
        car = new Car("Tesla", "S", LocalDate.of(2016, Month.SEPTEMBER, 1), 100000.2 ,"Black", 2222.89);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getManufacture method, of class Car.
     */
    @Test
    public void testGetManufacture() 
    {
        String expResult = "Tesla";
        String result = car.getManufacture();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setManufacture method, of class Car.
     */
    @Test
    public void testSetManufacture() 
    {
               
        car.setManufacture("Motars");
        String result = car.getManufacture();
        assertEquals("Motars",result);   
       
    }
    
    /**
     * Test of setManufacture method, of class car with an invalid argument.
     */
    @Test
    public void testSetManufactureInvalid()
    {
        try{
            car.setManufacture("");
            fail("setManufacture with an empty argument should trigger an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getModelNo method, of class Car.
     */
    @Test
    public void testGetModelNo()
    {        
        String expResult = "S";
        String result = car.getModelNo();
        assertEquals(expResult, result);
    }   

    /**
     * Test of setModelNo method, of class Car.
     */
    @Test
    public void testSetModelNo()
    {     
        car.setModelNo("MXLT6");
        String result = car.getModelNo();
        assertEquals("MXLT6",result); 
    }
    
    /**
     * Test of setModelNo method, of class car with an invalid argument.
     */
    @Test
    public void testSetModelNoInvalid()
    {
        try{
            car.setModelNo("");
            fail("setModelNo with an empty argument should trigger an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    

    /**
     * Test of getModelYear method, of class Car.
     */
    @Test
    public void testGetModelYear()
    {
        
        LocalDate expResult = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate result = car.getModelYear();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setModelYear method, of class Car.
     */
    @Test
    public void testSetModelYear() 
    {
        LocalDate modelYear = LocalDate.of(2012, Month.DECEMBER, 1);
        car.setModelYear(modelYear);
        assertEquals(modelYear, car.getModelYear());
    }
    
     /**
     * Test of setModelYear method, of class car.
     */
    @Test
    public void testSetModelYearInvalid()
    {
        LocalDate modelYear = LocalDate.of(1888, Month.DECEMBER, 1);
        try{
        car.setModelYear(modelYear);
        }
        catch (IllegalArgumentException e){
            System.out.println("The car model is too old  and should have triggered an exception");
        }
    }


    /**
     * Test of getPrice method, of class Car.
     */
    @Test
    public void testGetPrice()
    {        
        double expResult = 100000.2;
        double result = car.getPrice();
        assertEquals(expResult, result ,100000.2);       
    }

    /**
     * Test of setPrice method, of class Car.
     */
    @Test
    public void testSetPrice()
    {   
        double price = 5555.34;
        car.setPrice(price);
        assertEquals(price, car.getPrice(),5555.34);
    }
    
    
    /**
     * Test of setPrice method, of class car with an invalid input.
     */
    @Test
    public void testSetPriceInvalid()
    {
        try{
            car.setPrice(0);
            fail("setPrice method with an empty argument should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    /**
     * Test of getColor method, of class Car.
     */
    @Test
    public void testGetColor()
    {    
        String expResult = "Black";
        String result = car.getColor();
        assertEquals(expResult, result);      
    }

    /**
     * Test of setColor method, of class Car.
     */
    @Test
    public void testSetColor()
    {
        car.setColor("White");
        String result = car.getColor();
        assertEquals("White",result);
    }
     
    /**
     * Test of setColor method, of class car with an invalid argument.
     */
    @Test
    public void testSetColorInvalid()
    {
        try{
            car.setColor("");
            fail("setColor with an empty argument should trigger an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    /**
     * Test of getDistance method, of class Car.
     */
    @Test
    public void testGetDistance()
    {    
        double expResult = 2222.89;
        double result = car.getDistance();
        assertEquals(expResult, result, 2222.89);   
    }

    /**
     * Test of setDistance method, of class Car.
     */
    @Test
    public void testSetDistance()
    {    
        double distance = 1001.32;
        car.setDistance(distance);
        assertEquals(distance, car.getDistance(), 1001.32);
    }    
    
    /**
     * Test of setDistance method, of class car with an invalid input.
     */
    @Test
    public void testSetDistanceInvalid()
    {
        try{
            car.setDistance(0);
            fail("setDistance method with an empty argument should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getYear method, of class Car.
     */
    @Test
    public void testGetYear()
    {  
        int expResult = 2;
        int result = car.getYear();
        assertEquals(expResult, result);        
    }

    /**
     * Test of currentSellingPrice method, of class Car.
     */
    @Test
    public void testCurrentSellingPrice()
    {    
        double expResult = 111144722.289;
        double result = car.currentSellingPrice();
        assertEquals(expResult, result, 111144722.289);   
    }
    
}
