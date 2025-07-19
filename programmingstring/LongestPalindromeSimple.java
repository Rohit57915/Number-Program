package com.jspiders.programmingstring;
// A palindrome is a string that reads the same backward as forward.
public class LongestPalindromeSimple {
    public static void main(String[] args) {
        String s = "babad"; // Input string
        String longestPalindrome = "";

        // Check all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String subStr = s.substring(i, j);
                
                // Check if the current substring is a palindrome
                if (isPalindrome(subStr) && subStr.length() > longestPalindrome.length()) {
                    longestPalindrome = subStr;
                }
            }
        }

        // Print the result
        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

