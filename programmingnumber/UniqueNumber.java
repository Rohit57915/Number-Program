package com.jspiders.programmingnumber;

import java.util.Scanner;

public class UniqueNumber 
{
	
	  public static void main(String[] args) 
	  {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int n=sc.nextInt();
	       

	        if (isUnique(n))
	        {
	            System.out.println(n + " is a Unique Number.");
	        } else {
	            System.out.println(n + " is NOT a Unique Number.");
	        }
	    }

	    public static boolean isUnique(int n)
	    {
	        boolean[] digits = new boolean[10];    // Array to track digits (0-9)

	        while (n > 0) 
	        {
	            int digit = n % 10;      // Extract last digit
	            if (digits[digit])         // If the digit is already found, return false
	            {                        
	                return false;
	            }
	            digits[digit] = true;      // Mark digit as seen
	            n=n/10;                // Remove last digit
	        }
	        return true;                // If all digits are unique
	    }
	
}
