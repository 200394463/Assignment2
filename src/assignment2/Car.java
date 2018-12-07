
package assignment2;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author harvinder
 */
public class Car {
    
    /**
     * initializing  variables with their datatype
     */
    private String manufacture ;
    private String modelNo ;
    private LocalDate modelYear ;
    private double price ;
    private String color ;
    private double distance ;

    
    /**
     *  creating constructor of class car
     */
    public Car(String manufacture, String modelNo, LocalDate modelYear, double price, String color, double distance) {
        setManufacture(manufacture);
        setModelNo(modelNo);
        setModelYear(modelYear);
        setPrice(price);
        setColor(color);
        setDistance(distance);
    }
    
    /**
     * creating get method for manufacture
     */
    public String getManufacture() {
        return manufacture;
    }
    
    
    /**
     * 
     * set method for manufacture which validate whether the manufacture is empty or not and then initialize it  
     */
    public void setManufacture(String manufacture) {
        if(manufacture.isEmpty())
        {
            throw new IllegalArgumentException("manufacture name must not be empty ");
        }
        else 
            this.manufacture = manufacture;
    }

    public String getModelNo() {
        return modelNo;
    }
    
    /**
     * 
     * set method for modelNo which validate whether the modelNo is empty or not and then initialize it
     */
    public void setModelNo(String modelNo) {
        if(modelNo.isEmpty())
        {
           throw new IllegalArgumentException("ModelNo must not be empty"); 
        }
        else
            this.modelNo = modelNo;
    }

    public LocalDate getModelYear() {
        return modelYear;
    }
    
    /**
     * set method for modelYear which validate whether the modelYear is less than 15 years and then initialize it
     */
    
    public void setModelYear(LocalDate modelYear) {
        int year = Period.between(modelYear, LocalDate.now()).getYears() ;
         if(year < 15)
         {
            throw new IllegalArgumentException("ModelYear  must be less than 15 year so that car can be sell");  
         }
         else  
            this.modelYear = modelYear;
    }
    
    /**
     * get method for Price 
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * set method for price which checks whether the price is greater than 0 or not
     */
    public void setPrice(double price) {
        if(price>0)
        {
            this.price = price;
        }
        else 
            throw new IllegalArgumentException("price must be greater than 0"); 
    }
    
    
    /**
     *  get method for color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * 
     * set method for color 
     */
    public void setColor(String color) {
        if(color.isEmpty())
        {
            throw new IllegalArgumentException("color of car must not be empty"); 
        }
        else
            this.color = color;
    }
   /**
    * 
    * get method for distance  
    */
    public double getDistance() {
        return distance;
    }
     /**
      * set method for distance which checks whether the distance is greater than 0 or not  
      */
    public void setDistance(double distance) {
        if(distance>0)
        {
            this.distance = distance;
        }
        else
            throw new IllegalArgumentException("distance must be greater than 0");
    }
    
    /**
     * creating getYear methods which calculates  year from current date 
     */
     public int  getYear()
     {
         int year = Period.between(modelYear, LocalDate.now()).getYears() ;
         return year ;             
     }
     
     /**
      * 
      * creating method name currentSellingPrice which calculate the selling price of car 
      */
     public double currentSellingPrice()
     {
         int year = Period.between(modelYear, LocalDate.now()).getYears();
         return price * distance/year ;
     }
    
    
    
    
    
    
    
    
}