package com.jspiders.programmingArray;

import java.util.Scanner;

public class ArraysSpy 
{
   public static void main(String[] args) 
    {
	  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter Size");
			  int size=sc.nextInt();
			  int a[]=new int[size];
			  System.out.println("Enter" +size+ "Array Element");
			  
			  for(int i=0; i<=a.length-1; i++)
			  {
				  a[i]=sc.nextInt();
			  }
			  System.out.println("============================");
			  
			  int spySum=0;
			  
			  for(int i=0; i<=a.length-1; i++)
			  {
				  //true
				  if(isSpy(a[i]))
					  spySum=spySum+a[i];
			  }
			  System.out.println("Sum of all Spy Number is " +spySum);
    }
   public static boolean isSpy(int n)
   {
	   int sum=0;
	   int prod=1;
	   
	   while(n>0)
	   {
		   int rem =n%10;
		   sum=sum+rem;
		   prod=prod*rem;
		   n=n/10;
	   }
	   if(sum==prod)
	   {
		   return true;
	   }
	   else
	   {
		   return false;     // return sum==prod, we can also write
	   }
   }
}
