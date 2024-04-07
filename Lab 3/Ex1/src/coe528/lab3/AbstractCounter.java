/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author ashsu
 */
abstract class AbstractCounter implements Counter {
        
    int value;
    
    // Abstract constrcutor
    public AbstractCounter(){
        value = 0;
    }
    
    @Override
    // Converts the count to a string display
    public String count(){
        return ("" + this.value);
    }
    
    @Override
    // Resets the counter
    public void reset(){
        value = 0;
    }
    
    @Override
    // Increments the value if less than 9
    public void increment(){
        if(value < 9){
            value += 1;
        }
        else{
            value = 0;
        }
    }
    
    @Override
    // Decrements the value if greater than 0
    public void decrement(){
        if(value > 0){
            value -= 1;
        }
        else{
            value = 9;
        }
    }
}
