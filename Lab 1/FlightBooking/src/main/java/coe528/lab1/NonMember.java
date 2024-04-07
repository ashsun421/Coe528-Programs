/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author ashsu
 */
public class NonMember extends Passenger{
    
    public NonMember(String name, int age){
        
        // Gets name and age variable from parent class passenger
        super(name, age);
    }
    
    // Overrides the applyDicount function
    @Override
    public double applyDiscount(double p){
        
        // If the age of the passenger is greater than 65 give 10% discount
        // Super.getAge() accesses the getAge() function in the passenger parent class
        if(super.getAge() > 65){
            return p = p - p*0.1;
        }
        
        // Else give no discount
        else{
            return p;
        }
    }
    
}
