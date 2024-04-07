/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author ashsu
 */

// Digit counter only needs to know its current value
// So it only increments or decrements its own value 
public class DigitCounter extends AbstractCounter{
    
    
    // Constructor
    public DigitCounter(){
       
    }
    
    @Override
    // Increments the number if conditions are met
    public void increment(){
        if(value < 9){
            value += 1;
        }
        else{
            value = 0;
        }
    }
    
    @Override
    // Decrements the number if conditions are met
    public void decrement(){
        if(value > 0){
            value -= 1;
        }
        else{
            value = 9;
        }
    }
    
}
