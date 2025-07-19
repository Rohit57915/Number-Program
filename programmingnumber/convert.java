package com.jspiders.programmingnumber;

import java.util.Scanner;

public class convert 
{
 public static void main(String[] args) 
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number");
	int dec=sc.nextInt();
	
	String b=isBinary(dec);
	    System.out.println(b);
   }
 public static String isBinary(int dec)
   {
	   
	   String bin="";
	   while(dec>0)
	   {
		   int rem=dec%2;
		   bin=rem+bin;
		   dec=dec/2;
	   }
	   return bin;
	}
    
}
