/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab4;

/**
 *
 * @author ashsu
 */
public class Main {
    public static void main(String[] args) {
        
        // Test the queue implementation
        Queue<String> queue = new Queue<>();
        
        // Enqueue elements
        queue.enqueue("ab");
        queue.enqueue("cd");
        queue.enqueue("ef");
        queue.enqueue("gh");
        queue.enqueue("ij");
        queue.enqueue("kl");
        queue.enqueue("mn");
        queue.enqueue("op");
        queue.enqueue("qr");
        
        // Dequeue elements
        String dequeuedElement1 = queue.dequeue(); // 10
        String dequeuedElement2 = queue.dequeue(); // 20
        
        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty(); // false
        
        //System.out.println(queue.repOK());
        
        // Expected output
        System.out.println("Dequeued element 1: " + dequeuedElement1);
        System.out.println("Dequeued element 2: " + dequeuedElement2);
        System.out.println("Is the queue empty? " + isEmpty);
        
        System.out.println(queue.toString());
        
        
        
    }
}
