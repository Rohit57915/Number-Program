package com.jspiders.programmingstring;
//Convert the first character of each word to upperCase. 
public class EachWord1stCharacterUpperCase {
    public static void main(String[] args) {
        String str = " i am rohit ray ";
        String[] words = str.trim().split("\\s+"); // Split by spaces, ignoring multiple spaces
        String result = "";

        for (String word : words) {
            // Convert first character to uppercase and add the rest of the word
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }

        System.out.println(result.trim()); // Trim to remove the trailing space
    }
}
