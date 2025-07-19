package com.jspiders.programmingstring;
//A string is a Pangram string if it contains all the character of the alphabets ignoring the case of the alphabets.
public class PangramCheck {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog"; // Change this string to test
        s = s.toLowerCase(); // Convert to lowerCase to handle case-insensitivity
        boolean isPangram = true;

        // Check each letter from 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                isPangram = false; // Letter not found, so it's not a Pangram.
                break;
            }
        }

        // Print the result
        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}

