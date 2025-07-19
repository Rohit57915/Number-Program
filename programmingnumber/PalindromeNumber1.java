package com.jspiders.programmingnumber;

import java.util.Scanner;

public class PalindromeNumber1
{
      public static void main(String[] args)
      {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=sc.nextInt();
		
		  if (isPalindrome(n))
		 
			  System.out.println("palindrome Number");
		 else
			  System.out.println("Not Palindrome Number");
			  
	 }
		  

      public static boolean isPalindrome(int n)
      {
    	   int rev=0;
    	   int original=n;
    	   
    	   while(n>0)
    	   {
    	   int rem=n%10;
    	   rev=rev*10+rem;
    	   n=n/10;
    	   }
    	   if(rev==original)
    	   {
    		   return true;
    	   }
    	   else
    	   {
    		   return false;
    	   }
      }
}
