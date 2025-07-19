package com.jspiders.programmingnumber;

import java.util.Scanner;

public class FactorialNumber1
{
	public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter any Number");
	  int n=sc.nextInt();
	  
	     int f=isFactorial(n);
	     System.out.println("Factorial of " + n + " is: " + f);

   }      
	 public static int isFactorial(int n)
	 {
	        	int fact=1;
	        	for(int i=n; i>=1; i--)
	        	{
	        		fact=fact*i;
	        	}
	        	return fact;
	 }
	  
   
}
