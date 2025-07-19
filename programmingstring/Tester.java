package com.jspiders.programmingstring;

public class Tester {
    public static void main(String[] args) 
    {
        String s = "AbCdEf";
        char ch[] = s.toCharArray(); // Move it outside the loop to modify the array
        
        for (int i = 0; i < s.length(); i++) 
        { 
            if (ch[i] >= 'A' && ch[i] <= 'Z') // Check for Upper case
            { 
                ch[i] = (char) (ch[i] + 32); // Convert to lower case
            } 
            else if (ch[i] >= 'a' && ch[i] <= 'z')   // Check for lower case
            { 
                ch[i] = (char) (ch[i] - 32); // Convert to upper case
            }
        }
        
        System.out.println(new String(ch)); // Convert the array back to string and print
    }
}

