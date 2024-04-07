
package coe528.lab1;

/**
 *
 * @author ashsu
 */
public class Flight {
    // Instance Variables
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    // Constructor
    public Flight(int flightNumber, String origin, String destination, 
            String departureTime, int capacity, double originalPrice){
        
        // Declaring variables
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        this.numberOfSeatsLeft = capacity;
        
        // Illegal argument exception 
        if(origin.equals(destination) || destination.equals(origin)){
            throw new IllegalArgumentException("Origin and Destination cannot be "
                    + "the same");
        }
        
    }
    
    // Getter and Setter methods for instance variables
    public int get_flightNumber(){
        return this.flightNumber;
    }
    
    public void set_flightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    
    public String get_origin(){
        return this.origin;
    }
    
    public void set_origin(String origin){
        this.origin = origin;
    }
    
    public String get_destination(){
        return this.destination;
    }
    
    public void set_destination(String destination){
        this.destination = destination;
    }
    
    public String get_departureTime(){
        return this.departureTime;
    }
    
    public void set_departureTime(String departureTime){
        this.departureTime = departureTime;
    }
    
    public int get_capacity(){
        return this.capacity;
    }
    
    public void set_capacity(int capacity){
        this.capacity = capacity;
    }
    
    public double get_originalPrice(){
        return this.originalPrice;
    }
    
    public void set_originalPrice(double originalPrice){
        this.originalPrice = originalPrice;
    }
    
    public int get_numberOfSeatsLeft(){
        return this.numberOfSeatsLeft;
    }
    
    public void set_numberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
    
    public boolean bookASeat(){
        
        // Initializes number of seats
        int numSeat = this.numberOfSeatsLeft;
        
        // If the number of seats left is greater than 0 follow this
        if (numSeat > 0){
            
            // Reduces seat count by 1 then returns true to confirm booking
            numSeat--;
            return true;
        }
        
        // If the number of seats is 0 return false to fail booking
        else{
            return false;
        }
        
        
    }
    
    @Override
    public String toString(){
        return("Flight "+ get_flightNumber() + ", " + get_origin() + " to " + 
                get_destination() + ", " + get_departureTime() + ", " 
                + "Original Price: " + get_originalPrice() + "$" );
    }
   
}
