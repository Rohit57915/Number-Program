package com.jspiders.programmingstring;
// Convert How Many Character an Present in each Word.
public class EachWord {
    public static void main(String[] args) {
        String s = "Web Techonology related to fronted";
        String word = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                word += c;  // Build the current word
            } else {
                if (!word.isEmpty()) {
                    System.out.println(word + " = " + word.length() + " characters");
                    word = ""; // Reset for the next word
                }
            }
        }

        // Process the last word if the string doesn't end with a space
        if (!word.isEmpty()) {
            System.out.println(word + " = " + word.length() + " characters");
        }
    }
}

