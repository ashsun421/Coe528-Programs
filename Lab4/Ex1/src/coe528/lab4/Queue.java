/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab4;
import java.util.ArrayList;

/**
 *
 * @author ashsu
 */
public class Queue <T>{
// Overview: Queue is a mutable, bounded
// collection of integers that operate in
// FIFO (First-In-First-Out) order.
//
// The abstraction function is:
// {x | p(x)} - shows that for all values x the predicate is true
// AF(c) =  {c.items.get(i) | 0 <= i < c.items.size()}
// 
// 0 <= i < c.items.size() Shows that the elements of the queue are within in the queue size     
//     
// The rep invariant is:
// RI(c) = all elements in the queue are of the specified data type
//
//the rep
    private ArrayList<T> items;
    
    // the <T> means the element used in the classes are generic types, so any 
    // data type can be used as long as they are uniform
    
    public Queue(){
        // EFFECTS: Creates a new Queue object
        this.items = new ArrayList<T>();
    }
   
    public void enqueue(T x){
        // MODIFIES: The Queue Object
        // EFFECTS: Appends the element at the end of the queue
        // if the element entered is not null, otherwise does nothing.
        if(x == null){
            System.out.println("Cannot enqueue element if it is null");
        }
        
        items.addLast(x);
        
    }
    
    public T dequeue(){
        // MODIFIES: The Queue Object
        // EFFECTS: Removes the element at the front of the queue
        // if queue is nto empty, otherwise does nothing.

        if(items.size() == 0){
            System.out.println("Cannot deqeueue element if queue empty");
        }
        
        return items.removeFirst();
    }
    
    public boolean isEmpty(){
        // EFFECTS: Returns true when the queue is empty, otherwise
        // returns false.
        if(items.size() == 0){
            return true;
        }
        return false;
        
    }
    
    public boolean repOK(){
        // EFFECTS: Returns true if the rep invariant holds for this
        // object; otherwise returns false
        for(int i = 0; i < items.size(); i++){
            if(items.get(i) instanceof T == false){
                return false;
            }
        }
        
        return true;
    }
    
    public String toString(){
        // EFFECTS: Returns a string that contains the strings in the
        // Queue. Implements the abstraction function.
        String temp = "";
        for(int i = 0; i < items.size(); i++){
            temp += items.get(i) + " ";
        }
        return temp;
    }
    
   
}
