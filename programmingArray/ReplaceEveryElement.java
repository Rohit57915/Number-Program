package com.jspiders.programmingArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceEveryElement 
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Size");
	  int size=sc.nextInt();
	  int a[]=new int[size];
	  
	  System.out.println("Enter "+size+ " Element");
	  
	  for(int i=0;i<=a.length-1; i++)
	  {
		  a[i]=sc.nextInt();
	  }
		System.out.println("===============================");
		for(int i=0; i<=a.length-1; i++)
		{
			a[i]=sumOfDigits(a[i]);
		}
		System.out.println("After Replacing");
		System.out.println(Arrays.toString(a));
  }
 public static int sumOfDigits(int n)
 {
	 int sum=0;
	 while(n>0)
	 {
		 int rem=n%10;
		 sum=sum+rem;
		 n=n/10;
	 }
	 return sum;
 }

}
