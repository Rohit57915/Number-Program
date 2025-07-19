package com.jspiders.programmingnumber;

import java.util.Scanner;

public class PerfectNumber
{
   public static void main(String[] args)
   { 
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter any Number :");
	int n=scn.nextInt();
	int count=0;
	
	for(int i=1; i<=n/2; i++)
	{
	    if(n%i==0)
	       {
		     count=count+i;
		   }
	 } 
	if(count==n)
    {
    	System.out.println("Perfect Number");
    }
    else
    { 
    	System.out.println("Not Perfect Number");
    }
   }
}
