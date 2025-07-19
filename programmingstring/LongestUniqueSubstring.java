package com.jspiders.programmingstring;
// find and print the longest unique substring (substring without repeating characters) from the main string.
public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb"; // Input string
        String longest = "";
        String current = "";

        for (char c : s.toCharArray()) {
            // If character is already in current substring, remove characters from the start
            if (current.contains(String.valueOf(c))) {
                current = current.substring(current.indexOf(c) + 1);
            }

            // Add the current character
            current += c;

            // Update longest substring if current is longer
            if (current.length() > longest.length()) {
                longest = current;
            }
        }

        System.out.println("Longest Unique Substring: " + longest);
    }
}


