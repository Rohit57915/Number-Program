package com.jspiders.programmingnumber;

import java.util.Scanner;

public class EvenAndOdd1
{
      public static void main(String[] args)
      {
    	  Scanner scn=new Scanner(System.in);
    	  System.out.println("Enter any Number :");
    	  int n=scn.nextInt();
    	 
    	  if(n/2*2==n)
    	  {
    		  System.out.println("Even Number");
    	  }
    	  else
    	  {
    		  System.out.println("Odd Number");
    	  }
    	  
      }
}
