/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author ashsu
 */
public class LinkedDigitCounter extends AbstractCounter{
    
    private Counter leftNeighbour;
    
    public LinkedDigitCounter(Counter leftNeighbour){
        this.leftNeighbour = leftNeighbour;
    }
    
    @Override
    public void increment(){
        if(value < 9){
            value += 1;
        }
        else{
            // If value is 9, set the value to 0 then increment the left neighbour
            value = 0;
            leftNeighbour.increment();
        }
    }
    
    @Override
    public void decrement(){
        if(value > 0){
            value -= 1;
        }
        else{
            // If value is 0, set the value to 9 then decrement the left neighbour
            value = 9;
            leftNeighbour.decrement();
        }
    }
    
    @Override
    public void reset(){
        // Resets the current value from the parent class
        super.reset();
        // Resets the left neighbour value
        leftNeighbour.reset();
    }
    
}
