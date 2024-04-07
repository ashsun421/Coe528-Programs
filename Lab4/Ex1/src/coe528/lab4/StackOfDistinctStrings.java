/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab4;

import java.util.ArrayList;
public class StackOfDistinctStrings {
// Overview: StacksOfDistinctStrings are mutable, bounded
// collection of distinct strings that operate in
// LIFO (Last-In-First-Out) order.
//
// The abstraction function is:
// a) Write the abstraction function here
// {x | p(x)} - shows that for all values x the predicate is true
// 
// AF(c) =  {c.items.get(i) | 0 <= i < c.items.size() && c.items.contains(c.items.get(i)) == false}
// 
// 0 <= i < c.items.size() Shows that the elements of the stack are within in the stack size     
// 
// c.items.contains(c.items.get(i)) == false, Retrieves element at i checks if its in the stack
// negates the result so if its not found in stack return true if it is found in stack return false
//     
// The rep invariant is:
// b) Write the rep invariant here
// RI(c) = all elements in stack are distinct
//         && all elements within the stack are strings
//         && the top of the stack is items.size() - 1
//
//the rep
    private ArrayList<String> items;
    // constructor
    public StackOfDistinctStrings() {
        // EFFECTS: Creates a new StackOfDistinctStrings object
        items = new ArrayList<String>();
    }
    public void push(String element) throws Exception {
        // MODIFIES: this
        // EFFECTS: Appends the element at the top of the stack
        // if the element is not in the stack, otherwise
        // does nothing.
        if(element == null){
            throw new Exception();
        }
        if(false == items.contains(element)){
            items.add(element);
        }
    }
    public String pop() throws Exception {
        // MODIFIES: this
        // EFFECTS: Removes an element from the top of the stack
        if (items.size() == 0){
            throw new Exception();
        }
        return items.remove(items.size()-1);
    }
    public boolean repOK() {
    // EFFECTS: Returns true if the rep invariant holds for this
    // object; otherwise returns false
    // c) Write the code for the repOK() here
    
    // Top of the stack
    String top = items.get(items.size()-1);
    
        // Loop runs for length of stack
        for(int i = 0; i < items.size(); i++){

            for(int j = i + 1; j < items.size(); j++){
                if(items.get(j) == items.get(i)){
                    return false;
                }
            }
            
            // If all all elements are not strings return false
            if(items.get(i) instanceof String == false){
                return false;
            }
            
            // If the determined top of stack is not the top of stack return false
            else if(top.equals(items.get(items.size()-1)) == false){
                return false;
            }
        }
        
        // If all pass return true;
        return true;
        
    }
    
    public String toString() {
    // EFFECTS: Returns a string that contains the strings in the
    // stack and the top element. Implements the
    // abstraction function.
    // d) Write the code for the toString() here
    
        // Temp string 
        String temp = "";
        
        // Loop that adds the elements of the stack arraylist to the temp string
        for(int i = 0; i < items.size(); i++){
            temp += items.get(i) + " ";
        }
        
        // Returns the temp string
        return temp;
    }
    
    
     //Used to test the methods
    public static void main(String[] args){
        // Creates stack
        StackOfDistinctStrings stack = new StackOfDistinctStrings();
        
        try{
            
            // Methods that result in exceptions
            //stack.pop();
            //stack.push(null);
            //System.out.println(stack.repOK());
            
            // Pushes elements onto stack
            stack.push("ab");
            stack.push("cd");
            stack.push("ae");
            stack.push("bd");
            
            // Pops the top element bd
            stack.pop();
            
            // Strings ab and cd are not added to stack as they are duplicates
            stack.push("ab");
            stack.push("cd");
                       
            //Prints out the final stack
            System.out.println(stack.toString());
        }
        catch(Exception ex){
            System.out.println("Error has occured");
        }
    }
}