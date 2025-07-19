package com.jspiders.programmingnumber;

import java.util.Scanner;

public class NPrimeNumber
{
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter any Number");
	   int n=sc.nextInt();
	     int i=2;
	     int count=0;
	   while(true)
	   {
		   if(isPrime(i))
		   {
			   System.out.println(i);
			   count++;
		   }
		   if(count==n)
		       break;
		   
		   i++;
	   }
    }
   static boolean isPrime(int n)
   {
	   if(n<=1)
	       return false;
	   for(int i=2; i<=n/2; i++)
	   {
		   if(n%i==0)
			   return false;
		 }
	   return true;
   }
}
