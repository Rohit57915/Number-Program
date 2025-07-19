package com.jspiders.programmingnumber;

import java.util.Scanner;

public class DateMonthValid 
{
   public static void main(String[] args)
   {
	   Scanner var=new Scanner(System.in);
	   System.out.println("Enter Date :");
	   int d=var.nextInt();
	   System.out.println("Enter Month :");
	   int m=var.nextInt();
	   System.out.println("Enter Year :");
	   int y=var.nextInt();
	     
	     if(d<1 || d>3 || m<1 || m>2 || y<1)
	     {
	    	 System.out.println("Invalid Date"); 
	     }
	     else if(m==4 || m==6 || m==9 || m==11 && d>30)
	     {
	    	 System.out.println("Invalid Date");
	     }
	     else if(!(y%4==0 && y%100!=0 || y%400==0) && m==2 && d>28)
	     {
	    	 System.out.println("Invalid Date");
	     }
	     else if(!(y%4==0 && y%100!=0 || y%400==0) && m==2 && d>29)
	     {
	    	 System.out.println("Invalid Date");
	     }
	     else
	     {
	    	 System.out.println("Valid Date");
	     }
   }
}
