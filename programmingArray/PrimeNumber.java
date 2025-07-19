package com.jspiders.programmingArray;

public class PrimeNumber 
{
   public static void main(String[] args) 
   {
	   int a[]= {3,6,7,13,16,17};
	   for(int i=0; i<= a.length-1;i++)
	   {
		   if(isPrime(a[i]))
			   System.out.println(a[i]);
	   }
	   
   }
   static boolean isPrime(int n)
   {
	   if(n<=1)
		   return false;
	   for(int i=2;i<=n/2; i++)
	   {
		   if(n%i==0)
			   return false;
	   }
	   return true;
   }
}
