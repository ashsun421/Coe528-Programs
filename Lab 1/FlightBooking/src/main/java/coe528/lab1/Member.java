/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author ashsu
 */
public class Member extends Passenger {
    private int yearsOfMembership;
    
    public Member(String name, int age, int yearsOfMembership){
        
        // Gets name and age variable from parent class passenger
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }
    
    // Overrides the applyDiscount function
    @Override
    public double applyDiscount(double p){
        
        // If yearsOfMembership > 5 give discount of 50%
        if(yearsOfMembership > 5){
            return p = p - p*0.5;
        }
        
        // If yearsOfMembership > 1 and <= 5 givesd discount of 10%
        else if(yearsOfMembership > 1 && yearsOfMembership <= 5){
            return p = p - p*0.1;
        }
        
        // Else give no discount
        else{
            return p;
        }
    }
    
}
