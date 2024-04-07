/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;

/**
 *
 * @author ashsu
 */
public class AnagramChecker {
    
    //Requires: Two strings, str1 and str2, must be given in order for the program to be run, strings cannot be null
    //Modifies: the givens strings, str1 and str2, have their white spaces removes, characters changed to lower case and are sorted
    //Effects: If the entered strings, str1 and str2, both contain exactly the same characters return true else false`
    
    public static boolean areAnagrams(String str1, String str2){
        
        // Removes all whitespaces in the words if any
        str1 = str1.replaceAll("\\s","");
        str2 = str2.replaceAll("\\s","");
        
        // Converts all letters in the words to lowercase
        String str1lower = str1.toLowerCase();
        String str2lower = str2.toLowerCase();
        
        // Stores these lowercase letters of the two words in two seperate character arrays
        char[] str1Array = str1lower.toCharArray();
        char[] str2Array = str2lower.toCharArray();
        
        // Sorts the character arrays of both words
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        
        System.out.println("First String: " + str1 + "\nSecond String: " + str2);
        System.out.println(str1Array);
        System.out.println(str2Array);
        
        
        if(Arrays.equals(str1Array, str2Array)){
            System.out.println("These two words are anagrams\n");
        }
        
        else{
            System.out.println("These two words are not anagrams\n");
        }

        return Arrays.equals(str1Array, str2Array);
        
        
        
    }
    
    public static void main(String[] args){
        
        // If only one command line argument
        if(args.length == 1) {
            if (args[0].equals("1"))
                System.out.println( areAnagrams("listen", "silent"));
            else if (args[0].equals("2"))
                System.out.println(areAnagrams("Hello", "World"));
            else if (args[0].equals("3"))
                System.out.println(areAnagrams("Dormitory", "Dirty room")); 
        } 
    }
    
}

