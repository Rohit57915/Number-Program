package com.jspiders.programmingnumber;

import java.util.Scanner;

public class FindNPower 
{
 public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n Number");
	int n=sc.nextInt();
	System.out.println("Enter p Number");
	int p=sc.nextInt();
	
	  
	   int pow=isPower(n,p);
			   System.out.println(+pow);
	
  }
 public static int isPower(int n,int p)
 {
	 int pow=1;
	 
	 for(int i=1; i<=p; i++)
	 {
		 pow=pow*n;
	 }
	 return pow;
 }
}
