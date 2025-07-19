package com.jspiders.programmingstring;
// Reverse the words in a sentence.
public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun"; // Input sentence

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Print words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
