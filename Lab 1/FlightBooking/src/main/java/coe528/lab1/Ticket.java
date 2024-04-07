/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author ashsu
 */
public class Ticket {
    
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int ticketNum;
    private static int number = 1;
    
    public Ticket(Passenger p, Flight flight, double price){
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        
        // Initializes the ticket number
        this.ticketNum = number;
        
        // Increments the ticket number by 1
        number++;
    }
    
    // Getters and Setters for instance variables
    public int getNumber(){
        return this.ticketNum;
    }
    
    public Passenger getPassenger(){
        return this.passenger;
    }
    
    public void setPassenger(Passenger p){
        this.passenger = p;
    }
    
    public Flight getFlight(){
        return this.flight;
    }
    
    public void setFlight(Flight flight){
        this.flight = flight;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    @Override
    public String toString(){
        return passenger.getName() +", Flight " 
                + flight.get_flightNumber() + ", " + flight.get_origin() + " to " 
                + flight.get_destination() + ", " + flight.get_departureTime() 
                + ", original price: " + flight.get_originalPrice()
                + "$, ticket price: $" + getPrice();
    }
    
}


