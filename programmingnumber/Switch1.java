package com.jspiders.programmingnumber;

import java.util.Scanner;

public class Switch1 
{
   public static void main(String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("Enter any 1 to 5 number");
	   int n=scn.nextInt();
	   
	   switch(n)
	   {
		   case 1:
		   {
			   System.out.println("Hindi");
		   }
		   break;
		   case 2:
		   {
			   System.out.println("English");
		   }
		   break;
		   case 3:
		   {
			   System.out.println("Mathali");
		   }
		   break;
		   case 4:
		   {
			   System.out.println("Bhojpuri");
		   }
		   break;
		   case 5:
		   {
			   System.out.println("Begali");
		   }
		   break;
		   default :
		   {
			   System.out.println("Invalid Number");
		   }
	   }
	   
   }
}
