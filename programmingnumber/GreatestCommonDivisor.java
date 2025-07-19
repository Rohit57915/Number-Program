package com.jspiders.programmingnumber;

import java.util.Scanner;

public class GreatestCommonDivisor 
{
   public static void main(String[] args) 
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number");
	int n=sc.nextInt();
	System.out.println("Enter Second Number");
	int m=sc.nextInt();
	
	   int gcd=1;
	for(int i=1; i<=n && i<=m;i++)
	{
		if(n%i==0 && m%i==0)
		{
		  gcd=i;
		}
	}
	System.out.println(gcd);
   }
    
}
