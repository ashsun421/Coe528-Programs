/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab2;

/**
 *
 * @author ashsu
 */
public class Palindrome {
    
    //Requires: A string must be given in order for the program to be ran, cannot be null
    //Modifies: The given string a is modified by removing white spaces 
    //Effects: If the entered string is a palindrome return true else return false
    
    // race car
    // 01234567
    // rac ecar
    // 76543210
    public static boolean isPalindrome(String a){
        
        // Variable to store the reversed string
        String reversed = "";
        
        // Checks to see if input string is null
        if (a != null){
            // Checks to see if input string is an empty string
            if(a.isBlank() == false){
                
                // Removes all white  spaces in the string if any
                a = a.replaceAll("\\s","");

                // Loops the orignal string backwards and stores the reversed chracters in a variable
                for (int i = a.length() - 1; i >= 0; i--){
                    reversed += a.charAt(i);
                }

                System.out.println("Original String: " + a + "\nR1eversed String: " + reversed);

                
            }
            else{
                System.out.println("String is empty");
                return false;
            }
        }
        
        else{
            System.out.println("String is null");
            return false;
        }
        // Returns true if string is a palindrome else false
        return a.equals(reversed);

    }
    
    public static void main(String[] args){
        
        // If only one command line argument
        if(args.length == 1) {
            if (args[0].equals("1"))
                System.out.println(isPalindrome(null));
            else if (args[0].equals("2"))
                System.out.println(isPalindrome(""));
            else if (args[0].equals("3"))
                System.out.println(isPalindrome("deed"));
            else if (args[0].equals("4"))
                System.out.println(isPalindrome("race car"));
        }        
    }
    
}
