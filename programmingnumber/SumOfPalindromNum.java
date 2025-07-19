package com.jspiders.programmingnumber;

import java.util.Scanner;

public class SumOfPalindromNum 
{
   public static void main(String[] args)
   {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter any Number");
	  int n=sc.nextInt();
	  
	  int sum=0;
	  for(int i=1; i<=n; i++)
	  {
		  if(isPalindrom(i))
			  sum=sum+i;
	  }
	  System.out.println("Sum of Palindromic Numbers up to " + n + " is: " + sum);
   }
   public static boolean isPalindrom(int n)
	   {
	       int rem=0;
	       int rev=0;
	       int original;
	       
	       original=n;
	       
	       while(n>0)
	       {
	    	   rem=n%10;
	    	   rev=(rev*10)+rem;
	    	   n=n/10;
           }
	       if(original==rev)
    		   return true;
	       else
	    	   return false;
	   }
     
}
