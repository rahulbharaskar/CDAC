package org.collection.question3;

import java.util.HashMap;

public class FirstNonRepeatedCharacter {
    
    public static char findFirstNonRepeatedChar(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();
   
        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : input.toCharArray()) {
            if (charCount.get(ch) == 1) {
                return ch;
            }
        }
        
        return '0'; 
    }
    public static void main(String[] args) {
        String input = "aabbccddeffg";
        char result = findFirstNonRepeatedChar(input);
        
        if (result != '0') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}

