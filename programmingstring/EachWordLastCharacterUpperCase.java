package com.jspiders.programmingstring;
// Converts the last character of each word to upperCase.
public class EachWordLastCharacterUpperCase {
    public static void main(String[] args) {
        String s = "Java Full Stack Development";
        String[] words = s.split(" "); // Split the sentence by spaces
        String result = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                int len = word.length();
                // Convert last character to upperCase and add it to the result
                result += word.substring(0, len - 1) + Character.toUpperCase(word.charAt(len - 1)) + " ";
            }
        }

        System.out.println(result.trim()); // Trim to remove the trailing space
    }
}

