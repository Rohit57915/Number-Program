package com.jspiders.programmingnumber;

import java.util.Scanner;

public class SpyNumber 
{
  public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter any Number");
	   int n=sc.nextInt();
	   
	   int count=0;
	   int prod=1;
	   
	   while(n>0)
	   {
		   int rem=n%10;
		   
		   count=count+rem;
		   prod=prod*rem;
		  
		   n=n/10;
	   }
	   if(count==prod)
	   {
		   System.out.println("SPY Number");
	   }
	   else
	   {
		   System.out.println("Not SPY Number");
	   }
   }
}
