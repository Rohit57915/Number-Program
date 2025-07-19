package com.jspiders.programmingnumber;

import java.util.Scanner;

public class FactorOfDivisor
{
   public static void main(String[] args) 
   {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter any number :");
	int n=scn.nextInt();
	
	    for(int i=1; i<=n/2; i++)
	    {
	    	if(n%i==0)
	    	{
	    		System.out.println("Factor of Num : " +i);
	    	}
	    }
    
   }
}
