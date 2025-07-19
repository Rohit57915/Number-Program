package com.jspiders.programmingstring;
 // Check whether a string has all unique characters or not.
public class UniqueOrNot {
    public static void main(String[] args) {
        String s = "World"; // Change this string to test with different inputs
        boolean isUnique = true; // Assume the string is unique

        // Check each character with every other character
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isUnique = false; // Found a duplicate character
                    break;
                }
            }
            if (!isUnique) {
                break;
            }
        }

        // Print the result
        if (isUnique) {
            System.out.println("The string has all unique characters.");
        } else {
            System.out.println("The string does not have all unique characters.");
        }
    }
}
