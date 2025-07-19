package com.jspiders.programmingstring;
// Print Unique Character present in the String.
public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "hello World"; // Input string
        str = str.toLowerCase(); // Convert to lowerCase for uniformity

        System.out.print("Unique characters: ");

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;

            // Check if character appears again in the string
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j) && i != j) {
                    isUnique = false;
                    break;
                }
            }

            // Print if the character is unique
            if (isUnique && ch != ' ') {
                System.out.print(ch + " ");
            }
        }
    }
}

