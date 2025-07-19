package com.jspiders.programmingstring;
// Print the word along with its vowel count.
public class VowelCount {
    public static void main(String[] args) {
        String sentence = "Java is fun"; // Input sentence

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Loop through each word
        for (String word : words) {
            int vowels = 0;
            word = word.toLowerCase(); // Convert word to lowercase for easy comparison

            // Check each character in the word
            for (char c : word.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                }
            }

            // Print the result for the current word
            System.out.println("Word: " + word + " - Vowels: " + vowels);
        }
    }
}

