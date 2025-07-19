package com.jspiders.programmingstring;
// Displays the character and how many times it occurred.
public class CharacterOccurrence {
    public static void main(String[] args) {
        String str = "hello"; // Input string
        str = str.toLowerCase(); // Convert to lowerCase for uniformity

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Skip if character is already counted
            if (str.indexOf(ch) == i) {
                // Count the occurrences of the character
                for (int j = 0; j < str.length(); j++) {
                    if (ch == str.charAt(j)) {
                        count++;
                    }
                }

                // Print the character and its count
                System.out.println(ch + ": " + count);
            }
        }
    }
}
