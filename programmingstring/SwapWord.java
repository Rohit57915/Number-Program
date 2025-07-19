package com.jspiders.programmingstring;
// Swap Each word 1st and last Character;
public class SwapWord {
    public static void main(String[] args) {
        String s = "In the Box";
        String result = "";
        String word = "";
         for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
           if (c != ' ') {
                word += c;  // Build the current word
            } else {
                result += swapFirstLast(word) + " "; // Swap and add to result
                word = ""; // Reset word for the next one
            }
        }

        // Process the last word if the string doesn't end with a space
        if (!word.isEmpty()) {
            result += swapFirstLast(word);
        }

        System.out.println(result);
    }

    // Method to swap the first and last characters of a word
    public static String swapFirstLast(String word) {
        if (word.length() <= 1) {
            return word; // No swap needed for single-character words
        }

        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);

        // Swap the characters
        return last + word.substring(1, word.length() - 1) + first;
    }
}

