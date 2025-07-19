package com.jspiders.programmingnumber;

import java.util.Scanner;

public class ConvertDecToOct 
{
  public static void main(String[] args)
  {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any Numbetr");
	    int dec=sc.nextInt();
	    
	    String octal=isOctal(dec);
	          System.out.println(octal);
 }

 public static String isOctal(int dec)
  {
	  String oct="";
	  while(dec>0)
	  {
		  int rem=dec%8;
		  oct=rem+oct;
		  dec=dec/8;
	  }
	  return oct;
	}
}