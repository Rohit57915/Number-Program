package com.jspiders.programmingnumber;

import java.util.Scanner;

public class PrimeNumber 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Numner");
	int n=sc.nextInt();
	
	   boolean res=isPrime(n);
	   if(res==true)
	   {
		   System.out.println(" Not Prime Number");
	   }
	   else
	   {
		   System.out.println(" Prime Number");
	   }
	   
  }    
	   public static boolean isPrime(int n)
	   {
		   int count=0;
		   for(int i=1; i<=n;i++)
		   {
			   if(n%i==0)
			  count++;
		   }
		   if(count==2)
		   {
			   return false;
		   }
		   else
		   {
			   return true;
		   }
	   }
	
  
}
