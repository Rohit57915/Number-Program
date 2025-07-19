package com.jspiders.programmingstring;
// For each word, print the count of vowels and consonants.
public class VowelConsonantCount {
    public static void main(String[] args) {
        String sentence = "Java is fun"; // Input sentence

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Loop through each word
        for (String word : words) {
            int vowels = 0;
            int consonants = 0;

            // Convert word to lowerCase for easy comparison
            word = word.toLowerCase();

            // Check each character in the word
            for (char c : word.toCharArray()) {
                if (c >= 'a' && c <= 'z') { // Check only alphabets
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            // Print the result for the current word
            System.out.println("Word: " + word + " - Vowels: " + vowels + ", Consonants: " + consonants);
        }
    }
}

