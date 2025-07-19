package com.jspiders.programmingArray;

import java.util.Arrays;
import java.util.Scanner;

public class Element 
{
   public static void main(String[] args) 
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Size");
	 int size=sc.nextInt();
	 int a[]=new int[size];
	 
	 System.out.println("Enter "+size+ "Elements");  
	 for(int i=0;i<=a.length-1; i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 System.out.println("=================================");
	 System.out.println("Array Element are");
	 System.out.println(Arrays.toString(a));
   }
}
