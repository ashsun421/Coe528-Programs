/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author ashsu
 */
public class Odometer implements Counter {
    
    DigitCounter DigitCounter;
    LinkedDigitCounter[] LinkedDigitCounters;
    int n;

    public Odometer(int n){
        
        this.n = n;
        
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        
        if (n == 1){
            this.DigitCounter = new DigitCounter();
        }
        
        else{
            // Initializes a LinkedDigitCounter at position n-1 (which is the last position of the array n=4, index 3 has the LinkedDIgitCounter)
            this.LinkedDigitCounters = new LinkedDigitCounter[n-1];
            // Initializes one DigitCounter
            this.DigitCounter = new DigitCounter();

            // Creates the LinkedDigitCounter at index 0 with the left neighbour DigitCounter
            // (0 012)
            LinkedDigitCounters[0] = new LinkedDigitCounter(this.DigitCounter);

            // Creates a LinkedDigitCounter for each digit in between the first and last using their left neighbours
            for(int i = 1; i < n-1; i++){

                LinkedDigitCounters[i] = new LinkedDigitCounter(LinkedDigitCounters[i-1]);

            }
        }
    }
    

    @Override
    public String count() {
        
        // Create an empty string for the left DigitCounter 
        String left = "";
        
        if (n == 1){
            left += this.DigitCounter.value;
            return left;
        }
        else{
            // Add the value of the DigitCounter into the empty string created above
            left += this.DigitCounter.value;

            // Add the LinkedDigitCounter values determined in the odometer in the string already containing the DigitCounter value
            for(int i = 0; i < n-1; i++) {
                left += LinkedDigitCounters[i].value;
            }

            // Return the now filled in string
            return left;
        }
    }
    
    @Override
    public void increment() {

        // Starts at the last digit and increments while overflowing to left if needed
        // Calls increment in LinkedDigitCounter
        // 0,1,2
        
        if(n > 1){
            LinkedDigitCounters[n-2].increment();
        }
        
        else if (n == 1){
            DigitCounter.increment();
        }
        
    }
    
    @Override
    public void decrement() {
        // Starts at the last digit and decrements while overflowing to left if needed
        // Calls decrement in LinkedDigitCounter
        // 0,1,2
        if (n > 1){
            LinkedDigitCounters[n-2].decrement();
        }
        
        else if (n == 1){
            DigitCounter.decrement();
        }
    }
    
    @Override
    public void reset() {
        if(n == 1){
            this.DigitCounter.reset();
        }
        else{
            // Resets the DigitCounter value
            this.DigitCounter.reset();

            // Resets all the LinkedDigitCounter values
            for(int i = 0; i < n-1; i++) {

                LinkedDigitCounters[i].reset();
            }
        }
    }
    
}