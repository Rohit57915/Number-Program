package com.jspiders.programmingstring;
// Compress a string by counting consecutive characters.
public class StringCompression {
    public static void main(String[] args) {
        String str = "aabbbccaaa"; // Input string
        String result = ""; // To store the compressed result

        int count = 1; // Initialize count of characters

        // Loop through the string
        for (int i = 0; i < str.length() - 1; i++) {
            // If current and next characters are the same, increment count
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append character and its count to result
                result += str.charAt(i) + String.valueOf(count);
                count = 1; // Reset count for the next character
            }
        }

        // Add the last character and its count
        result += str.charAt(str.length() - 1) + String.valueOf(count);

        // Print the compressed string
        System.out.println(result);
    }
}

