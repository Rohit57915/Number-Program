package com.jspiders.programmingstring;
// Reverse each word in a sentence while keeping the word order the same.
public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Java is fun"; // Input sentence

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Reverse each word and print
        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i); // Reverse the current word
            }
            System.out.print(reversedWord + " "); // Print the reversed word with a space
        }
    }
}

