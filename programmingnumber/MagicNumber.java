package com.jspiders.programmingnumber;

import java.util.Scanner;

public class MagicNumber
{
   public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the any number");
	  int n=sc.nextInt();
	  
	    if(isMagicNumber(n))
	    {
	    	System.out.println("Magic Number");
	    }
	    else 
	    {
	    	System.out.println("not Magic Number");
	    }
   }
   public static boolean isMagicNumber(int n)
   {
	  
	   while(n>9)
	   {
		   int sum=0;
	       while(n>0)
	        {
		      int rem=n%10;
		      sum=sum+rem;
		      n=n/10;
	        }
	     n=sum;
	   }
	   return n==1;
   }   
}
