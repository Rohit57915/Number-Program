package com.jspiders.programmingnumber;

import java.util.Scanner;

public class SumEvenNum 
{
    public static void main(String[] args)
    {
	   Scanner ref=new Scanner(System.in);
	   System.out.println("Enter any Number :");
	   int n=ref.nextInt();
	   int sum=0;
	   
	   for(int i=1; i<=n; i++)
	   {
		   if(i%2==0)
		   {
			  sum=sum+i;
			  System.out.println(i+" Sum of Even Num : " +sum);
		   }
	   }
	}
}
