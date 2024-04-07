package coe528.lab1;

import java.util.ArrayList;
/**
 *
 * @author ashsu
 */
public class Manager {
    
    private ArrayList <Flight> flightArray = new ArrayList<Flight>();
    private ArrayList<Ticket> ticketArray = new ArrayList<Ticket>();
    
    
    public void createFlights(){
        
        // Creates available flights and adds them to an array 
        flightArray.add(new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000));
        flightArray.add(new Flight(1050, "Amsterdam", "Toronto", "03/05/99 12:00 pm", 100, 1000));
        flightArray.add(new Flight(1070, "Vancouver", "Tokyo", "03/012/99 11:30 pm", 100, 1000));
        
        
    }
    
    public void displayAvailableFlights(String origin, String destination){
        
        // Loop runs for the size of the flightArray arraylist
        for(int i = 0; i < flightArray.size(); i++){
            
            // If the origin and destination match and the number of seats left is greater than 0 toString the available flight
            if (origin.equals(flightArray.get(i).get_origin()) && 
                    destination.equals(flightArray.get(i).get_destination()) && 
                    flightArray.get(i).get_numberOfSeatsLeft() > 0){
                
                    System.out.println(flightArray.get(i).toString());    
            }
            
            // If it does not match let the user know
            if(flightArray.get(i).get_numberOfSeatsLeft() < 1)
                System.out.println("No seats available on any flight");
            }
        }    
        
    
    
    public Flight getFlight(int flightNumber){
        
        // Loop runs for the size of the flightArray arraylist
        for(int i = 0; i < flightArray.size(); i++){
            
            // If the flightNumber matches return the flight of that number
            if (flightArray.get(i).get_flightNumber() == flightNumber){
                return flightArray.get(i);
            }
        }    
        return null;
    }
    
    public void bookSeat(int flightNumber, Passenger p){
        
         Flight flight = getFlight(flightNumber);
        
        // If a flight exists create a new ticket and apply any discounts
        if (flight != null) {
            Ticket newTicket = new Ticket(p, flight, p.applyDiscount(flight.get_originalPrice()));
            
            // Add the ticket to the ticket array
            ticketArray.add(newTicket);

            // Print the newly added ticket
            System.out.println(newTicket.toString());
        }
        
        // If ticket could not be booked let user know
        else{
            System.out.println("Ticket could not be booked, all seats full");
        }

        
        
        
    }
    
    public static void main(String[] args){
        
        // Creates a manager who also creates flights
        Manager manager = new Manager();
        manager.createFlights();
        
        // Creates a list of passengers
        Passenger ashwin = new Member("Ashwin Sundaresan", 19, 6);
        Passenger james = new NonMember("James Doe", 35);
        Passenger john = new NonMember("John Doe", 70);
        Passenger julia = new Member("Julia Chow", 25, 3);
        Passenger jill = new NonMember("Jill Chow", 35);
        
        // Displays the available flights
        System.out.println("Displaying all the available flights:");
        System.out.println("-------------------------------------");
        manager.displayAvailableFlights("Toronto", "Kolkata");
        manager.displayAvailableFlights("Amsterdam", "Toronto");
        manager.displayAvailableFlights("Vancouver", "Tokyo");
        
        // Displays the flights with flight number 1030, 1050, 1070
        System.out.println("\nDisplaying all flights with the specified flight number:");
        System.out.println("--------------------------------------------------------");
        System.out.println(manager.getFlight(1030).toString());
        System.out.println(manager.getFlight(1050).toString());
        System.out.println(manager.getFlight(1070).toString());
        
        // Displaays the tickets with discounts if any
        System.out.println("\nDisplaying issued tickets:");
        System.out.println("--------------------------");
        manager.bookSeat(1030, ashwin);
        manager.bookSeat(1050, james);
        manager.bookSeat(1070, john);
        manager.bookSeat(1070, julia);
        manager.bookSeat(1070, jill);
        
    }
    
}
