package com.jspiders.programmingnumber;

import java.util.Scanner;

public class StrongNumber
{
   public static void main(String[] args) 
   { 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any Number");
      int n=sc.nextInt();
      
           boolean res=isStrong(n);
        		   if(res==true)
        			   System.out.println("Strong Number");
        		   else
        			   System.out.println("Not Strong Number");
  }
   
   public static boolean isStrong(int n)
   {
	   int sum=0;
	   int org=n;
	   while(n>0)
	   {
		   int rem=n%10;
		   int f=factorial(rem);
		   sum=sum+f;
		   
		   n=n/10;
	   }
	   if(sum==org)
	       return true;
	   else
		   return false;
   }
   private static int factorial(int n)
   {
	   int fact=1;
	    for(int i=n; i>=1; i--)
	    {
	    	fact=fact*i;
	    }
	    return fact;
   }
}
