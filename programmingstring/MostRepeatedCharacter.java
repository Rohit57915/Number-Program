package com.jspiders.programmingstring;
// Print the character that is repeated the most in a given string. 
public class MostRepeatedCharacter {
    public static void main(String[] args) {
        String str = "programming"; // Input string
        str = str.toLowerCase(); // Convert to lowerCase for uniformity

        char mostRepeatedChar = ' ';
        int maxCount = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Skip already processed characters
            if (str.indexOf(ch) == i && ch != ' ') {
                // Count occurrences of the character
                for (int j = 0; j < str.length(); j++) {
                    if (ch == str.charAt(j)) {
                        count++;
                    }
                }

                // Update if this character has a higher count
                if (count > maxCount) {
                    maxCount = count;
                    mostRepeatedChar = ch;
                }
            }
        }

        // Print the result
        if (maxCount > 1) {
            System.out.println("Most repeated character: " + mostRepeatedChar + " (" + maxCount + " times)");
        } else {
            System.out.println("No character is repeated more than once.");
        }
    }
}

