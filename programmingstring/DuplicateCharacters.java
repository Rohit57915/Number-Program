package com.jspiders.programmingstring;
// Print duplicate Character present in the String.
public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming"; // Input string
        str = str.toLowerCase(); // Convert to lowercase for uniformity

        System.out.print("Duplicate characters: ");

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Skip already processed characters
            if (str.indexOf(ch) == i) {
                // Count occurrences of the character
                for (int j = 0; j < str.length(); j++) {
                    if (ch == str.charAt(j)) {
                        count++;
                    }
                }

                // If count > 1, it's a duplicate
                if (count > 1 && ch != ' ') {
                    System.out.print(ch + " ");
                }
            }
        }
    }
}

