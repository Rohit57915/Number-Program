package com.jspiders.programmingnumber;

import java.util.Scanner;

public class EvenNumPresent
{
  public static void main(String[] args) 
  {
	 Scanner ref=new Scanner(System.in);
	 System.out.println("Enter any Number :");
	 int n=ref.nextInt();
	 
	for(int i=1; i<=n; i++)
	{
		if(i%2==0)
		{
			System.out.println("Even Number : " +i);
		}
		
	}
  }
}
