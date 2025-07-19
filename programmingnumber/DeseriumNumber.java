package com.jspiders.programmingnumber;

import java.util.Scanner;

public class DeseriumNumber
{
   public static void main(String[] args)
   {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter any Number");
	  int n=sc.nextInt();
	  
	  if(isDeserium(n))
		  System.out.println("Deserium Number");
	  else
		  System.out.println("Not Deserium Number");
	  
   }
   static boolean isDeserium(int n)
   {
	   int sum=0;
	   int org=n;
	   
	   int cd=countDigit(n);
	   
	   while(n>0)
	   {
		   int rem=n%10;
		   int pow=(int)Math.pow(rem, cd);
		   sum=sum+pow;
		   n=n/10;
		   cd--;
	   }
	   return sum==org;
   }
   static int countDigit(int n)
   {
	   int count=0;
	   while(n>0)
	   {
		   count++;
		   n=n/10;
		   
	   }
	   return count;
   }
}
