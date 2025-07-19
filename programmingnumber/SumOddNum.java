package com.jspiders.programmingnumber;

import java.util.Scanner;

public class SumOddNum 
{
     public static void main(String[] args) 
     {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any Number :");
		int n=scn.nextInt();
		int sum=0;
		
		
		for(int i=1; i<=n; i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
                System.out.println("Sum of Odd Num : " +sum);
			}
		}
		
	 }
}
